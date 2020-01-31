package com.otsi.springbootdemo.controller;

import java.util.concurrent.atomic.AtomicLong;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.otsi.springbootdemo.bo.Greeting;

@RestController
public class GreetingController {
	@Autowired
	MessageSource messageSource;

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@RequestMapping(value = "/get-greeting", method = RequestMethod.GET)
	public String greeting(HttpServletRequest request) {
		/**
		 * @LocaleContextHolder.getLocale() Return the Locale associated with the given
		 * user context,if any, or the system default Locale otherwise. This is
		 * effectively a replacement for Locale.getDefault(), able to optionally respect
		 * a user-level Locale setting.
		 */
		System.out.println(request.getParameter("language"));
		return messageSource.getMessage("msg.greet", null, LocaleContextHolder.getLocale());
	}
}
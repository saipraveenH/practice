package com.otsi.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.otsi.springbootdemo.bo.Student;
import com.otsi.springbootdemo.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudnetContorller {
	@Autowired
	private StudentService studentService;

	@PostMapping(path = "/save")
	private ResponseEntity<Student> save(@RequestBody Student student) {
		studentService.save(student);
		return new ResponseEntity<Student>(student, HttpStatus.ACCEPTED);
	}
}

package com.otsi.springbootdemo.exception;

import java.net.URI;

import org.zalando.problem.AbstractThrowableProblem;
import org.zalando.problem.Status;

/**
 * @author praveen.hemadri
 * 
 * @link https://www.baeldung.com/problem-spring-web
 *
 */
public class TaskNotFoundProblem extends AbstractThrowableProblem {
	private static final URI TYPE = URI.create("https://springboot-demo.com/not-found");

	public TaskNotFoundProblem(Long taskId) {
		super(TYPE, "Not found", Status.NOT_FOUND, String.format("Task '%s' not found", taskId));
	}
}

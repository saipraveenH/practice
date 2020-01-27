package com.otsi.springbootdemo.bo;

/**
 * @author praveen.hemadri
 *
 * @link https://www.baeldung.com/problem-spring-web
 */
public class Task {
	private long id;

	public Task(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;
}

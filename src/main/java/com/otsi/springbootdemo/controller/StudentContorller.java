package com.otsi.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.otsi.springbootdemo.bo.Student;
import com.otsi.springbootdemo.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentContorller {
	@Autowired
	private StudentService studentService;

	@GetMapping("/{id}")
	private ResponseEntity<Student> findById(@PathVariable("id") Long id) {
		Student findById = studentService.findById(id);
		return new ResponseEntity<Student>(findById, HttpStatus.ACCEPTED);
	}

	@PostMapping(path = "/save")
	private ResponseEntity<Student> save(@RequestBody Student student) {
		Student save = studentService.save(student);
		return new ResponseEntity<Student>(save, HttpStatus.ACCEPTED);
	}
}

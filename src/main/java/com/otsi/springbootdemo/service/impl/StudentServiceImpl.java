package com.otsi.springbootdemo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.otsi.springbootdemo.bo.Student;
import com.otsi.springbootdemo.repository.StudentRepository;
import com.otsi.springbootdemo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public long save(Student student) {
		studentRepository.save(student);
		return 0;
	}
}

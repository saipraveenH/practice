package com.otsi.springbootdemo.service;

import com.otsi.springbootdemo.bo.Student;

public interface StudentService {
	public Student save(Student student);

	public Student findById(Long id);
}

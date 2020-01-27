package com.otsi.springbootdemo.service.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.otsi.springbootdemo.bo.Student;
import com.otsi.springbootdemo.repository.StudentRepository;
import com.otsi.springbootdemo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student save(Student student) {

		return studentRepository.save(student);
	}

	@Override
	public Student findById(Long id) {
		log.info("finding student with id {} ", id);
		Optional<Student> findById = studentRepository.findById(id);
		if (findById != null) {
			return findById.get();
		}
		return null;
	}
}

package com.otsi.springbootdemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.otsi.springbootdemo.bo.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}

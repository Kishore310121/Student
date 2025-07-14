package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.entity.StudentEntity;
import com.demo.repository.StudentRepository;

@Repository
public class StudentDao {
	@Autowired
	StudentRepository sr;
	public String PostStudentList(List<StudentEntity> s) {
		sr.saveAll(s);
		return "saved successfully";
	}
	
	public List<StudentEntity> GetStudentList() {
		return sr.findAll();
	}

	public List<StudentEntity> GetStudentDetailsById(int a) {
		return sr.GetStudentDetailsById(a);
	}

	public List<StudentEntity> GetStudentDetailsByAge(int a) {
		return sr.GetStudentDetailsByAge(a);
	}

}

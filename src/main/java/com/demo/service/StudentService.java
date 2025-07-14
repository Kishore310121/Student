package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.StudentDao;
import com.demo.entity.StudentEntity;
import com.demo.globalexception.AgeNotFoundException;
import com.demo.globalexception.IdNotFoundException;

@Service
public class StudentService {
	@Autowired
	StudentDao sd;
	public String PostStudentList(List<StudentEntity> s) {
		return sd.PostStudentList(s);
	}

	public List<StudentEntity> GetStudentList() {
		return sd.GetStudentList();
	}

	public List<StudentEntity> GetStudentDetailsById(int a) throws IdNotFoundException {
		if(sd.GetStudentDetailsById(a).isEmpty()) {
			throw new IdNotFoundException("Id Not Found");
		}else {
			return sd.GetStudentDetailsById(a);
		}
	}

	public List<StudentEntity> GetStudentDetailsByAge(int a) throws AgeNotFoundException{
		if(sd.GetStudentDetailsByAge(a).isEmpty()) {
			throw new AgeNotFoundException("Age Not Found");
		}else {
			return sd.GetStudentDetailsByAge(a);
		}
	}
	
}

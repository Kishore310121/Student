package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.StudentEntity;
import com.demo.globalexception.AgeNotFoundException;
import com.demo.globalexception.IdNotFoundException;
import com.demo.service.StudentService;

@RestController
@RequestMapping(value="/stud-api")

public class StudentController {
	@Autowired
	StudentService ss;
	@PostMapping(value="/PostStudentList")
	public String PostStudentList(@RequestBody List<StudentEntity> s) {
		return ss.PostStudentList(s);
	}
	@GetMapping(value="/GetStudentList")
	public List<StudentEntity> GetStudentList() {
		return ss.GetStudentList();
	}
	
	@GetMapping(value="/GetStudentDetailsById/{a}")
    public List<StudentEntity> GetStudentDetailsById(@PathVariable int a) throws IdNotFoundException {
        return ss.GetStudentDetailsById(a);
    }
	
	@GetMapping(value="/GetStudentDetailsByAge/{a}")
    public List<StudentEntity> GetStudentDetailsByAge(@PathVariable int a) throws AgeNotFoundException {
        return ss.GetStudentDetailsByAge(a);
    }
	
	@GetMapping(value = "/Hello Student Git-Hub")
	public String getGit() {
		return "Kishore's Student GitHub";
	}
	
	@GetMapping(value = "/Hello Student 2 Git-Hub")
	public String getGit2() {
		return "Kishore's Student 2 GitHub";
	}
	
	@GetMapping(value = "/Hello Student 3 Git-Hub")
	public String getGit3() {
		return "Kishore's Student 3 GitHub";
	}
}

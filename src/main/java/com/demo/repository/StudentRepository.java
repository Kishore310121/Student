package com.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity,Integer>{

	@Query(value = "SELECT * FROM student_details.student_table WHERE id=?1",nativeQuery = true)
	List<StudentEntity> GetStudentDetailsById(int a);

	@Query(value = "SELECT * FROM student_details.student_table WHERE age=?1",nativeQuery = true)
	List<StudentEntity> GetStudentDetailsByAge(int a);
}
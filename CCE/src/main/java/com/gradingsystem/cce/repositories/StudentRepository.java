package com.gradingsystem.cce.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gradingsystem.cce.model.Student;

public interface StudentRepository extends JpaRepository<Student, String> {

	@Query("select s from Student s where s.standard=?1 and s.section=?2")
	List<Student> StudentId(String standard,String section);
	
	@Query("select s from Student s where s.sid=?1")
	List<Student> findAllStudent(String sid);

	@Query("select s from Student s where s.standard=?1 and s.section=?2")
	List<Student> findAllStudentStandards(String standard, String section);
}

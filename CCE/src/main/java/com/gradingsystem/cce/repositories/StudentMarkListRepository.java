package com.gradingsystem.cce.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gradingsystem.cce.model.StudentMarkList;

public interface StudentMarkListRepository extends JpaRepository<StudentMarkList, String> {

//	@Query("select s from StudentMarkList s where s.sid=?1 and s.term in ('term1','term2','term3') ")
	@Query("select s from StudentMarkList s where s.sid=?1 and s.term=?2 ")
	List<StudentMarkList> getGradeById(String sid,String term);
}

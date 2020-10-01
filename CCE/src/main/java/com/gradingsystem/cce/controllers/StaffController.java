package com.gradingsystem.cce.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gradingsystem.cce.beans.AllObjectBean;
import com.gradingsystem.cce.model.Student;
import com.gradingsystem.cce.model.StudentMarkList;
import com.gradingsystem.cce.service.StaffDatabaseService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class StaffController {

	@Autowired
	StaffDatabaseService sfds;
	
	@PostMapping("/stumarklist")
	public String stuMarkList() {
//		if(sfds.smlRegister(sml)) {
//			return "registered";
//		}
//		else {@RequestBody StudentMarkList sml
//			return "Not-registered";
//		}
		return "Not-registered";
	}
	@GetMapping("/gdetail{id}")
	public List<Student> gDetails(@PathVariable String id) {
		return sfds.getStudentId(id);
	}
	@GetMapping("/stupersonal{sid}")
	public List<Student> stuPersonal(@PathVariable String sid){
		return sfds.getStuPersonal(sid);
	}
	@GetMapping("/multistupersonal{tid}")
	public List<Student> mulitStuPersonal(@PathVariable String tid){
		return sfds.getStudentId(tid);
	}
	
	@PostMapping(value="/stugradelist",produces = "application/json")
	public List<StudentMarkList> stuGradeList(@RequestBody AllObjectBean id){
		return sfds.getStuMarkList(id);
	}
	
}

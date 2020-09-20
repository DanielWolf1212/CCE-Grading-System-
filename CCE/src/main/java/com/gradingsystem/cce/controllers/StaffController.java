package com.gradingsystem.cce.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gradingsystem.cce.model.Student;
import com.gradingsystem.cce.model.StudentMarkList;
import com.gradingsystem.cce.service.StaffDatabaseService;

@RestController
@CrossOrigin
public class StaffController {

	@Autowired
	StaffDatabaseService sfds;
	
	@PostMapping("/stumarklist")
	public String stuMarkList(@RequestBody StudentMarkList sml) {
		if(sfds.smlRegister(sml)) {
			return "registered";
		}
		else {
			return "Not-registered";
		}
	}
	
	@GetMapping("/gdetail{id}")
	public List<Student> gDetails(@PathVariable String id) {
		return sfds.getStudentId(id);
	}
}

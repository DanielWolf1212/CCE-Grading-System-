package com.gradingsystem.cce.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gradingsystem.cce.model.Staff;
import com.gradingsystem.cce.model.Student;
import com.gradingsystem.cce.service.AdminDatabaseService;

@RestController
@CrossOrigin
@SpringBootApplication
public class AdminController {

	@Autowired
	AdminDatabaseService ads;

	@PostMapping("/stfregister")
	public String stfregister(@RequestBody Staff staff) {
		if (ads.staffRegsitry(staff)) {
			return "Registered";
		} else {
			return "Not-Registered";
		}
	}
	@PostMapping("/sturegister")
	public String sturegister(@RequestBody Student student) {
		if(ads.studentRegistry(student)) {
			return "Registered";
		}
		else {
			return "Not-Registered";
		}
	}
}
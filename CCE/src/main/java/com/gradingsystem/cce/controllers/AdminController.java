package com.gradingsystem.cce.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
	@GetMapping("/staffid")
	public List<Staff> staffIdFetch(){
		return ads.staffIdFetch();
	}
	@PostMapping("/stafflist")
	public List<Staff> staffList(@RequestBody Staff staff){
		return ads.staffData(staff);
	}
	@PostMapping("/adminstupersonal")
	public List<Student> adminStudentPersonal(@RequestBody Student student){
		return ads.adminStudentPersonal(student);
		
	}
	@PostMapping("/adminallstupersonal")
	public List<Student> adminAllStudentPersonal(@RequestBody Student student){
		return ads.adminAllStudentPersonal(student);
	}
	@PostMapping("/staffstdsec")
	public List<Staff> staffStdSec(@RequestBody Staff staff) {
		return ads.getStaffStdSec(staff);
	}
}
package com.gradingsystem.cce.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gradingsystem.cce.beans.AllObjectBean;
import com.gradingsystem.cce.model.Staff;
import com.gradingsystem.cce.model.Student;
import com.gradingsystem.cce.model.StudentMarkList;
import com.gradingsystem.cce.service.StaffDatabaseService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
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
		//return "Not-registered";
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
	
	@PostMapping(value = "/studentgradefetch",produces = "application/json")
	public List<StudentMarkList> studentGradeFetch(@RequestBody StudentMarkList sml){
		return sfds.studentGradeFetch(sml);
	}
	
	@PostMapping(value = "/studentgradelist")
	public String gradeUpdate(@RequestBody StudentMarkList sml) {
		int r=sfds.updateGrade(sml);
		if(r>0) {
			return "Updated";
		}
		else {
			return "not Successfull";
		}
	}
	@PostMapping("/staffpassupdate")
	public String staffPassUpdate(@RequestBody Staff staff) {
		int r=sfds.staffPassUpdate(staff);
		if(r>0) {
			return "Sucessfully Updated";
		}else {
			return "Not Updated";
		}
	}
	@PostMapping("/gradeduplicate")
	public List<StudentMarkList> gradeDuplicate(@RequestBody StudentMarkList sml){
		return sfds.getDuplicated(sml);
	}
	
}

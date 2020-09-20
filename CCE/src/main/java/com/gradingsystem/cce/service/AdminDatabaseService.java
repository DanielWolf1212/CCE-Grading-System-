package com.gradingsystem.cce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gradingsystem.cce.model.Staff;
import com.gradingsystem.cce.model.Student;
import com.gradingsystem.cce.repositories.StaffRepository;
import com.gradingsystem.cce.repositories.StudentRepository;

@Service
public class AdminDatabaseService {
	
	@Autowired
	StaffRepository stfr;
	@Autowired
	StudentRepository stur;
	@Autowired
	AutoIncrementService auto;
	
	public boolean staffRegsitry(Staff staff) {
		boolean b=false;
		staff.setTid(auto.getTid());
		staff.setPassword(auto.getTid());
		if(stfr.save(staff)!=null) {
			b=true;
		}
		return b;
	}
	public boolean studentRegistry(Student student) {
		boolean b=false;
		student.setSid(auto.getSid(student));
		if(stur.save(student)!=null) {
			b=true;
		}
		return b;
	}

}

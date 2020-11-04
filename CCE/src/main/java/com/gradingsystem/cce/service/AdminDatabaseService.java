package com.gradingsystem.cce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gradingsystem.cce.model.ApplicationUser;
import com.gradingsystem.cce.model.Staff;
import com.gradingsystem.cce.model.Student;
import com.gradingsystem.cce.repositories.ApplicationUserReposiroty;
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
	@Autowired
	ApplicationUserReposiroty apur;
	
	public boolean staffRegsitry(Staff staff) {

		boolean b=false;
		staff.setTid(auto.getTid());
		staff.setPassword(auto.getTid());
		
		ApplicationUser apu=new ApplicationUser();
		apu.setUsername(auto.getTid());
		apu.setPassword(auto.getTid());
		apu.setRoles("STAFF");
		
		if(stfr.save(staff)!=null) {
			apur.save(apu);
			b=true;
		}
		return b;
	}
	
	public boolean studentRegistry(Student student) {
		boolean b=false;
		ApplicationUser apu=new ApplicationUser();
		
		student.setSid(auto.getSid(student));
		apu.setUsername(auto.getSid(student));
		
		apu.setPassword(student.getDateofbirth());
		apu.setRoles("STUDENT");
		
		if(stur.save(student)!=null) {
			apur.save(apu);
			b=true;
		}
		return b;
	}
	
	public List<Staff> staffIdFetch() {
		return stfr.findAll();
	}

	public List<Staff> staffData(Staff staff) {
		return stfr.getStaffByID(staff.getTid());
		
	}

	public List<Student> adminStudentPersonal(Student student) {
		return stur.findAllStudent(student.getSid());
	}

	public List<Student> adminAllStudentPersonal(Student student) {
		return stur.findAllStudentStandards(student.getStandard(),student.getSection());
	}

	public List<Staff> getStaffStdSec(Staff staff) {
		
		return stfr.getStaffStdSec(staff.getStandard(),staff.getSection());
	}
}

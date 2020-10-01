package com.gradingsystem.cce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gradingsystem.cce.beans.AllObjectBean;
import com.gradingsystem.cce.model.Staff;
import com.gradingsystem.cce.model.Student;
import com.gradingsystem.cce.model.StudentMarkList;
import com.gradingsystem.cce.repositories.StaffRepository;
import com.gradingsystem.cce.repositories.StudentMarkListRepository;
import com.gradingsystem.cce.repositories.StudentRepository;

@Service
public class StaffDatabaseService {

	@Autowired
	StudentMarkListRepository smlr;
	@Autowired
	StudentRepository stur;
	@Autowired
	StaffRepository stfr;

	public boolean smlRegister(StudentMarkList sml) {
		boolean b = false;
		if (smlr.save(sml) != null) {
			b = true;
		}
		return b;
	}

	public List<Student> getStudentId(String stid) {
		List<Student> l = null;
		List<Staff> sl = stfr.selectstaff(stid);
		String std = "";
		String sec = "";
		for (Staff stf : sl) {
			std = stf.getStandard();
			sec = stf.getSection();
		}
		l = stur.StudentId(std, sec);
		return l;
	}

	public List<Student> getStuPersonal(String id) {
		List<Student> l = stur.findAllStudent(id);
		return l;
	}

	public List<StudentMarkList> getStuMarkList(AllObjectBean id) {
		return smlr.getGradeById(id.getSid(), id.getTerm());
		// return null;
	}

}

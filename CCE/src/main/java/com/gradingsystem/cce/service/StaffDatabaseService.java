package com.gradingsystem.cce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gradingsystem.cce.beans.AllObjectBean;
import com.gradingsystem.cce.model.Staff;
import com.gradingsystem.cce.model.Student;
import com.gradingsystem.cce.model.StudentMarkList;
import com.gradingsystem.cce.repositories.ApplicationUserReposiroty;
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
	@Autowired
	ApplicationUserReposiroty apur;

	public boolean smlRegister(StudentMarkList sml) {
		boolean b = false;
		if (smlr.save(sml) != null) {
			sml=new StudentMarkList();
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
	}
	public List<StudentMarkList> studentGradeFetch(StudentMarkList sml) {
		return smlr.getGradeById(sml.getSid(), sml.getTerm());
	}
	public int updateGrade(StudentMarkList sml) {
		int r=0;
		r=smlr.updateGrade(	sml.getTamilfa(),sml.getTamilsa(),sml.getTamiltotal(),sml.getTamilfag(),sml.getTamilsag(),sml.getTamilttg(),
							sml.getEnglishfa(),sml.getEnglishsa(),sml.getEnglishtotal(),sml.getEnglishfag(),sml.getEnglishsag(),sml.getEnglishttg(),
							sml.getMathsfa(),sml.getMathssa(),sml.getMathstotal(),sml.getMathsfag(),sml.getMathssag(),sml.getMathsttg(),
							sml.getSciencefa(),sml.getSciencesa(),sml.getSciencetotal(),sml.getSciencefag(),sml.getSciencesag(),sml.getSciencettg(),
							sml.getSocialfa(),sml.getSocialsa(),sml.getSocialtotal(),sml.getSocialfag(),sml.getSocialsag(),sml.getSocialttg(),sml.getSid(),sml.getTerm());
		return r;
	}
	public int staffPassUpdate(Staff staff) {
		int r=0;
		r=stfr.passUpdate(staff.getTid(),staff.getPassword());
		r=apur.passUpdate(staff.getTid(),staff.getPassword());
		return r;
	}
	public List<StudentMarkList> getDuplicated(StudentMarkList sml) {
		
		return smlr.getDuplicate(sml.getSid(),sml.getTerm());
	}
}

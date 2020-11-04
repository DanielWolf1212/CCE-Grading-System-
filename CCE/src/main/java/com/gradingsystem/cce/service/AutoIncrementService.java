package com.gradingsystem.cce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gradingsystem.cce.model.Staff;
import com.gradingsystem.cce.model.Student;
import com.gradingsystem.cce.repositories.StaffRepository;
import com.gradingsystem.cce.repositories.StudentRepository;

@Service
public class AutoIncrementService {

	@Autowired
	StaffRepository stfr;
	@Autowired
	StudentRepository stur;

	public String getTid() {
		String tid = "";
		List<Staff> staff = stfr.findAll();
		for (Staff st : staff) {
			tid = st.getTid();
		}
		if (tid.equals("")) {
			tid = "STF01";
		} else {
			int r = Integer.parseInt(tid.substring(3));
			r++;
			tid = tid.substring(0, 4) + r;
		}
		if (tid.length() > 5) {
			tid = tid.substring(0, 3) + tid.substring(4);
		}
		return tid;
	}

	public String getSid(Student student) {
		String sid = "";
		List<Student> l = stur.StudentId(student.getStandard(), student.getSection());
		for (Student stu : l) {
			sid = stu.getSid();
		}
		if (sid.equals("")) {
			sid = "STU" + student.getStandard() + student.getSection() + "01";
		} else {
			if(student.getStandard().length()==1) {
				int r = Integer.parseInt(sid.substring(6));
				r++;
				sid = sid.substring(0, 6) + r;
				if(sid.length()>7) {
					sid=sid.substring(0,5)+sid.substring(6);
				}
			}
			else if(student.getStandard().length()==2) {
				int r = Integer.parseInt(sid.substring(7));
				r++;
				sid = sid.substring(0, 7) + r;
				if(sid.length()>8) {
					sid=sid.substring(0,6)+sid.substring(7);
				}
			}
			else {
				int r = Integer.parseInt(sid.substring(8));
				r++;
				sid = sid.substring(0, 8) + r;
				if(sid.length()>9) {
					sid=sid.substring(0,7)+sid.substring(8);
				}
			}
		}
		return sid;
	}

}
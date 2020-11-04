package com.gradingsystem.cce.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.gradingsystem.cce.model.Staff;
import com.gradingsystem.cce.model.StudentMarkList;

public interface StaffRepository extends JpaRepository<Staff, String> {

	@Query("select s from Staff s where s.tid=?1")
	List<Staff> selectstaff(String tid);
	
	@Transactional
	@Modifying
	@Query(" update Staff s set s.password=?2 where s.tid=?1")
	int passUpdate(String tid, String password);

	@Query(" select s from Staff s where s.tid=?1")
	List<Staff> getStaffByID(String tid);

	@Query("select s from Staff s where s.standard=?1 and s.section=?2 ")
	List<Staff> getStaffStdSec(String standard, String section);


}

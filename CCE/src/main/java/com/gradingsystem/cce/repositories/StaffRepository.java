package com.gradingsystem.cce.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gradingsystem.cce.model.Staff;

public interface StaffRepository extends JpaRepository<Staff, String> {

	@Query("select s from Staff s where s.tid=?1")
	List<Staff> selectstaff(String tid);
}

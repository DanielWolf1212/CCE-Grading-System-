package com.gradingsystem.cce.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.gradingsystem.cce.model.ApplicationUser;

public interface ApplicationUserReposiroty extends JpaRepository<ApplicationUser, Integer> {

	@Query("select a from ApplicationUser a where a.username=?1 and a.password=?2")
	List<ApplicationUser> applicationLogin(String username,String password);

	@Transactional
	@Modifying
	@Query("update ApplicationUser a set a.password=?2 where a.username=?1")
	int passUpdate(String tid, String password);
}

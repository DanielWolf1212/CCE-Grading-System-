package com.gradingsystem.cce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gradingsystem.cce.beans.AllObjectBean;
import com.gradingsystem.cce.model.ApplicationUser;
import com.gradingsystem.cce.repositories.ApplicationUserReposiroty;

@Service
public class LoginService {

	@Autowired
	ApplicationUserReposiroty apur;
	
	public List<ApplicationUser> login(AllObjectBean aob) {
		List<ApplicationUser> l;
		return l=apur.applicationLogin(aob.getUsername(), aob.getPassword());
	}
}

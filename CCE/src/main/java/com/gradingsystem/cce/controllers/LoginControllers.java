package com.gradingsystem.cce.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gradingsystem.cce.beans.AllObjectBean;
import com.gradingsystem.cce.model.ApplicationUser;
import com.gradingsystem.cce.service.LoginService;

@RestController
@CrossOrigin
public class LoginControllers {

	@Autowired
	LoginService ls;
	
	@PostMapping("userlogin")
	public String login(@RequestBody AllObjectBean aob ) {
		List<ApplicationUser> l= ls.login(aob);
		String role="";
		if(l!=null) {
			for(ApplicationUser apu :l) {
				role=apu.getRoles();
			}
		}
		return role;
	}
}

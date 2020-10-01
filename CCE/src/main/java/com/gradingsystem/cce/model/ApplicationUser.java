package com.gradingsystem.cce.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
public class ApplicationUser {

	@Id
	private int userid;
	private String username;
	private String password;
}

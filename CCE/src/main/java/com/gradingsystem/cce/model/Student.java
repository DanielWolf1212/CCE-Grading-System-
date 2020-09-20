package com.gradingsystem.cce.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="studentp")
public class Student {
	
	@Id
	String sid;
	@Column(name = "name")
	String name;
	@Column(name = "fathername")
	String fathername;
	@Column(name = "dateofbirth")
	String dateofbirth;
	
	@Column(name = "gender")
	String gender;
	@Column(name = "religion")
	String religion;
	@Column(name = "address")
	String address;
	@Column(name = "mobileno")
	String mobileno;
	@Column(name = "standard")
	String standard;
	@Column(name = "section")
	String section;
	@Column(name = "aadhar")
	String aadhar;
	@Column(name = "email")
	String email;
	
//	@OneToOne(mappedBy = "stu")
//	private StudentMarkList sml;
	
//	public StudentMarkList getSml() {
//		return sml;
//	}
//	public void setSml(StudentMarkList sml) {
//		this.sml = sml;
//	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}	
}

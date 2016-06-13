package com.mybatis3.domain;

import java.util.Date;

//@Alias(value="StudentAlias")
public class Student {
    private Integer studId;
    private String name;
    private String email;
    private Date dob; // setters and getters
   // private PhoneNumber phone;
    
	public Integer getStudId() {
		return studId;
	}
	public void setStudId(Integer studId) {
		this.studId = studId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
//	public PhoneNumber getPhone() {
//		return phone;
//	}
//	public void setPhone(PhoneNumber phone) {
//		this.phone = phone;
//	}
    
}
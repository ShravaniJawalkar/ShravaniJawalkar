package com.example.springhibbernetrunner.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class StudentName {
	@Column(name = "first_name")
	private String fname;
	@Column(name = "last_name")
	private String lname;
	@Column(name = "middle_name")
	private String mname;

	public StudentName() {

	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getMname() {
		return mname;
	}

	@Override
	public String toString() {
		return "StudentName [fname=" + fname + ", lname=" + lname + ", mname=" + mname + "]";
	}

	public void setMname(String mname) {
		this.mname = mname;
	}
}

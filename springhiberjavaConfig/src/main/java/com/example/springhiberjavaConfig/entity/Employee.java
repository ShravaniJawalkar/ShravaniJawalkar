package com.example.springhiberjavaConfig.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee_data")
public class Employee {
	@Id
	@Column(name = "emp_id")
	private long empId;
	@Column(name = "emp_name")
	private String eName;
	
//	@ManyToOne
//	private Department department;
//	
//
//	public Department getDeptDepartment() {
//		return department;
//	}
//
//	public void setDeptDepartment(Department department) {
//		this.department = department;
//	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", eName=" + eName + "]";
	}

	
}

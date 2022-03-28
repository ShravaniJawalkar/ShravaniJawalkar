//package com.example.springhiberjavaConfig.entity;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//
//@Entity
//@Table(name="department")
//public class Department {
//
//	@Id
//	@Column(name="depart_id")
//	private long departmentId;
//	
//	@Column(name="depart_name")
//	private String departmentName;
//	
//	@Column(name="dept_loc")
//	private String departmentLoc;
//	
//	@OneToMany(mappedBy = "department", fetch = FetchType.EAGER)
//	private List<Employee> employee=new ArrayList<>();
//
//	public long getDepartmentId() {
//		return departmentId;
//	}
//
//	public void setDepartmentId(long departmentId) {
//		this.departmentId = departmentId;
//	}
//
//	public String getDepartmentName() {
//		return departmentName;
//	}
//
//	public void setDepartmentName(String departmentName) {
//		this.departmentName = departmentName;
//	}
//
//	public String getDepartmentLoc() {
//		return departmentLoc;
//	}
//
//	public void setDepartmentLoc(String departmentLoc) {
//		this.departmentLoc = departmentLoc;
//	}
//
//	public List<Employee> getEmployee() {
//		return employee;
//	}
//
//	public void setEmployee(List<Employee> employee) {
//		this.employee = employee;
//	}
//
//	@Override
//	public String toString() {
//		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", departmentLoc="
//				+ departmentLoc + ", employee=" + employee + "]";
//	}
//	
//	
//	
//}

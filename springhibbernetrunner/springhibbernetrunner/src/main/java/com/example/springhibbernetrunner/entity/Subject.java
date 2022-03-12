package com.example.springhibbernetrunner.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "student_subject")
public class Subject {
	@Id
	@GeneratedValue
	@Column(name = "subject_id")
	private long subjectId;

	@Column(name = "subject_name")
	private String subjectName;

	@ManyToMany
	private List<Student> student=new ArrayList<>();

	public long getSubjectId() {
		return subjectId;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	public void setSubjectId(long subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

//	@Override
//	public String toString() {
//		return "Subject [subjectId=" + subjectId + ", subjectName=" + subjectName + ", student=" + student + "]";
//	}

}

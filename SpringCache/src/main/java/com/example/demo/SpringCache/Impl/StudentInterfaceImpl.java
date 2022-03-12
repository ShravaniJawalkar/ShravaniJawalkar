package com.example.demo.SpringCache.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.demo.SpringCache.Entity.Student;
import com.example.demo.SpringCache.Repo.StudentRepository;

@Service
public class StudentInterfaceImpl {

	@Autowired
	StudentRepository studentRepository;

	@Cacheable(value = "ten-second-cache", key = "'StudentCache+#studentId'")
	public List<Student> getStudent(int studentId) throws InterruptedException {
		Thread.sleep(4000);
		return studentRepository.getStudents(studentId);
	}
	@CacheEvict(value = "twenty-second-cache", key = "'StudentCache+#studentId'", condition ="#isCashebale!=null && #isCashebale", beforeInvocation = true)
	public List<Student> getStudentData(int studentId, boolean isCashebale) throws InterruptedException {
		Thread.sleep(4000);
		return studentRepository.getStudents(studentId);
	}
}

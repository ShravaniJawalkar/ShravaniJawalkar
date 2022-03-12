package com.example.demo.SpringCache.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.SpringCache.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	@Query(value = "select * from public.student s where s.id=?1", nativeQuery = true)
	public List<Student> getStudents(int studentId);

}

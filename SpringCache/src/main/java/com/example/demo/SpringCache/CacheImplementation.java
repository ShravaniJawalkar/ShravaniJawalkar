package com.example.demo.SpringCache;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.SpringCache.Entity.Student;
import com.example.demo.SpringCache.Impl.StudentInterfaceImpl;

@RestController
@RequestMapping("/cache")
public class CacheImplementation {
	
	@Autowired
	StudentInterfaceImpl studentInterfaceImpl;
	
	@GetMapping(value="/getStudent/{id}", produces ="application/json")
	public ResponseEntity<Student> getStudent(@PathVariable("id") int id) throws InterruptedException{
		List<Student> l=studentInterfaceImpl.getStudent(id);
		return new ResponseEntity<>(l.get(0),HttpStatus.OK);
				
	}
	@GetMapping(value ="/getStudent", produces = "application/json")
	public ResponseEntity<Student> getStudent(@RequestParam("id") int id, @RequestParam("isCache") boolean isCache) throws InterruptedException{
		return new ResponseEntity<>(studentInterfaceImpl.getStudentData(id, isCache).get(0),HttpStatus.OK);
	}

}

package com.example.springhiberjavaConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.example.springhiberjavaConfig.entity.Employee;
import com.example.springhiberjavaConfig.service.EmployeeDao;

@SpringBootApplication(exclude =  {DataSourceAutoConfiguration.class })
public class SpringhiberjavaConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringhiberjavaConfigApplication.class, args);
		EmployeeDao emp=new EmployeeDao();
		Employee e1=new Employee();
		e1.seteName("shiv kumar");
		e1.setEmpId(1L);
		//System.out.println(emp.saveDepartment(dept));
		System.out.println(emp.saveEmployee(e1));
		
	}

}

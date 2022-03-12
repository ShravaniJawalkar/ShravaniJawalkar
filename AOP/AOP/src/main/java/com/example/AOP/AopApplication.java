package com.example.AOP;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.AOP.AspectProg.TrackTime;
import com.example.AOP.Business.Business1;
import com.example.AOP.Business.Business2;
import com.example.AOP.executecust.Teacher;

@SpringBootApplication
public class AopApplication implements CommandLineRunner {

	Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private Business1 business1;
	@Autowired
	private Business2 business2;
	
	@Autowired
	private Teacher teacher;

	@TrackTime
	public static void main(String[] args) {
		SpringApplication.run(AopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		log.info("" + business1.retriveBusiness1());
		log.info("" + business2.retriveBussiness2());
		teacher.setId(1);
		teacher.setName("kamal");
		log.info(""+teacher.toString());
	}

}

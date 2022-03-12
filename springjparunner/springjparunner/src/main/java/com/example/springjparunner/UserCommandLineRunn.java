package com.example.springjparunner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.springjparunner.entity.User;
import com.example.springjparunner.service.UserService;

@Component
public class UserCommandLineRunn implements CommandLineRunner {
	
	Logger log=LoggerFactory.getLogger(UserCommandLineRunn.class);
	
	@Autowired
	UserService userService;

	@Override
	public void run(String... args) throws Exception {
			
			User user=new User("Jack","77988788");
			long id=userService.insert(user);
			log.info("user is created :"+ user);
	}

}

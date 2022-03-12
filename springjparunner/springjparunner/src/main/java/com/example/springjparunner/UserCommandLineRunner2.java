package com.example.springjparunner;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.springjparunner.entity.User;
import com.example.springjparunner.service.UserRepository;
@Component
public class UserCommandLineRunner2 implements CommandLineRunner {
Logger log=LoggerFactory.getLogger(UserCommandLineRunner2.class);
	
	@Autowired
	UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
			
			User user=new User("Harry","77988788");
			userRepository.save(user);
			log.info("user is created :"+ user);
			Optional<User> userRet=userRepository.findById(user.getId());
			if(userRet.isPresent())
				log.info("retrive user"+ userRet);
			List<User> userRep=userRepository.findAll();
			log.info("all user:"+ userRep);
	}
}

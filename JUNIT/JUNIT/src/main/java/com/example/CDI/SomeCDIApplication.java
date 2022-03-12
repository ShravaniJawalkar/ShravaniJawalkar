package com.example.CDI;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.CDI")
public class SomeCDIApplication {
	AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
			SomeCDIApplication.class);
}

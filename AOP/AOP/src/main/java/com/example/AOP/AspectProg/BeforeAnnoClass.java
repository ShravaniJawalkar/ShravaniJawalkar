package com.example.AOP.AspectProg;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class BeforeAnnoClass {
	
	Logger log = LoggerFactory.getLogger(this.getClass());
	/*
	 * PointCut-it is an expression To intercept any method call
	 * JointPoint- intercept a specific method call
	 * 
	 * Complete process is call weaving and framework of it is weaver
	 */

	@Before("execution(* com.example.AOP.*.*(..))") // PointCuts
	public void beforExe(JoinPoint joinPoint) {
		//Advice
		log.info("User Access");
		log.info("Allowing user Access {}"+ joinPoint);
	}
}

package com.example.AOP.AspectProg;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AllAspectCust {

	Logger log = LoggerFactory.getLogger(this.getClass());

	@Before("com.example.AOP.AspectProg.CommonConfig.retriveBusiness()")
	public void beforExe(JoinPoint joinPoint) {
		log.info("User Access");
		log.info("Allowing user Access {}" + joinPoint);
	}

	@AfterReturning(value = "com.example.AOP.AspectProg.CommonConfig.retriveBusiness()", returning = "result")
	public void afterReturning(JoinPoint joinPoint, Object result) {
		log.info("{} returning the result {}", joinPoint, result);
	}

	@AfterThrowing(value = "com.example.AOP.AspectProg.CommonConfig.retriveBusiness()", throwing = "exception")
	public void afterThrowing(JoinPoint joinPoint, Object exception) {
		log.info("{} throwing an {}", joinPoint, exception);
	}

	@After("com.example.AOP.AspectProg.CommonConfig.retriveBusiness()")
	public void after(JoinPoint joinPoint) {
		log.info("after execution {}", joinPoint);
	}

	@Around("com.example.AOP.AspectProg.CommonConfig.trackTimeAnnotation()")
	public void around(ProceedingJoinPoint joinPoint) throws Throwable {
		long startTime = System.currentTimeMillis();
		joinPoint.proceed();
		long timeTaken = System.currentTimeMillis() - startTime;
		log.info("{} time required {} ", joinPoint, timeTaken);
	}

}

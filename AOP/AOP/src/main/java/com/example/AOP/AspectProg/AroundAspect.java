package com.example.AOP.AspectProg;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AroundAspect {

	Logger log = LoggerFactory.getLogger(this.getClass());

	@Around("execution(* com.example.AOP.Business.*.*(..))")
	public void around(ProceedingJoinPoint joinPoint) throws Throwable {
		long startTime = System.currentTimeMillis();
		joinPoint.proceed();
		long timeTaken = System.currentTimeMillis() - startTime;
		log.info("{} time required {} ", joinPoint, timeTaken);
	}

}

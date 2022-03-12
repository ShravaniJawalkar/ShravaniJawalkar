package com.example.AOP.AspectProg;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAnnolass {

	Logger log = LoggerFactory.getLogger(this.getClass());

	@AfterReturning(value = "execution(* com.example.AOP.Business.*.*(..))", returning = "result")
	public void afterReturning(JoinPoint joinPoint, Object result) {
		log.info("{} returning the result {}",joinPoint,result);
	}
	@AfterThrowing(value = "execution(* com.example.AOP.Business.*.*(..))", throwing = "exception")
	public void afterThrowing(JoinPoint joinPoint, Object exception) {
		log.info("{} throwing an {}",joinPoint,exception);
	}
	@After("execution(* com.example.AOP.Business.*.*(..))")
	public void after(JoinPoint joinPoint) {
		log.info("after execution {}",joinPoint);
	}
}

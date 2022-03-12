package com.example.AOP.AspectProg;

import org.aspectj.lang.annotation.Pointcut;

public class CommonConfig {

	@Pointcut("execution(* com.example.AOP.Business.*.*(..))")
	public void retriveBusiness() {
	}

	@Pointcut("execution(* com.example.AOP.Dao.*.*(..))")
	public void retriveDao() {
	}

	@Pointcut("execution(* com.example.AOP.executecust.*.*(..))")
	public void retriveExecuteCust() {
	}

	@Pointcut("com.example.AOP.AspectProg.CommonConfig.retriveBusiness() && com.example.AOP.AspectProg.CommonConfig.retriveDao()")
	public void allLayer() {
	}

	@Pointcut("bean(*Dao*)")
	public void beanContainWithDao() {
	}
	
	@Pointcut("within(com.example.AOP.Dao..*)")
	public void dataLayerExecution() {}
	
	@Pointcut("@annotation(com.example.AOP.AspectProg.TrackTime)")
	public void trackTimeAnnotation() {}
}

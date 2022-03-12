package com.example.JUNIT;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.JUNIT.basic.SortingAlgorithm;

@Configurable
@ComponentScan(basePackages = "com.example.JUNIT")
public class JunitApplication {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(JunitApplication.class)) {
			System.out.println(" "+ applicationContext.getBean(SortingAlgorithm.class).getSortingAlgo(3));		}
	}

}

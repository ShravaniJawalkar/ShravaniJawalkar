package com.example.demo.xmlproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class XmlSpringApplication {
	private static Logger log = LoggerFactory.getLogger(XmlSpringApplication.class);

	public static void main(String args[]) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("xmlStringBootApp.xml");
		XmlPersonDao con = applicationContext.getBean(XmlPersonDao.class);
		log.info("{}->" + (Object) applicationContext.getBeanDefinitionNames());
		log.info("{}" + con);
		log.info("{}" + con.getXmlChildConnection());
		log.info("{}" + con.getXmlConstructorInjection());
		applicationContext.close();
		/*
		 * Bean factory
		 */
		/*
		 * Resource resource = new ClassPathResource("xmlStringBootApp.xml");
		 * BeanFactory bean = new XmlBeanFactory(resource); XmlPersonDao bp =
		 * bean.getBean(XmlPersonDao.class); //log.info("{}->" + (Object)
		 * bean.getBeanDefinitionNames()); log.info("{}" + bp); log.info("{}" +
		 * bp.getXmlChildConnection()); log.info("{}" +
		 * bp.getXmlConstructorInjection());
		 */

	}
}

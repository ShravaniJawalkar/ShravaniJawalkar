package com.example.springhiberjavaConfig;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.example.springhiberjavaConfig.entity.Employee;


public class HibernateUtilityConfig {
	private static SessionFactory sessionFactory;

	
	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			try {
				Configuration configuration = new Configuration();
				Properties settings = new Properties();
				settings.put(Environment.DRIVER, "org.postgresql.Driver");
				settings.put(Environment.URL, "jdbc:postgresql://localhost:5432/postgres");
				settings.put(Environment.USER, "postgres");
				settings.put(Environment.PASS, "root");
				settings.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
				settings.put(Environment.DEFAULT_SCHEMA, "public");
				settings.put(Environment.HBM2DDL_AUTO, "update");
				settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
				settings.put(Environment.SHOW_SQL, "true");
				configuration.setProperties(settings);
				configuration.addAnnotatedClass(Employee.class);
				ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
						.applySettings(configuration.getProperties()).build();
				sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		return sessionFactory;
	}
}

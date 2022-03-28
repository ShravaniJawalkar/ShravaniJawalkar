package com.example.springhiberjavaConfig.service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.springhiberjavaConfig.HibernateUtilityConfig;
import com.example.springhiberjavaConfig.entity.Employee;

public class EmployeeDao {
	Transaction transaction = null;

	public Employee saveEmployee(Employee emp) {

		try (Session session = HibernateUtilityConfig.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			session.save(emp);
			transaction.commit();
			session.close();
		} catch (Exception e) {
			if (transaction != null)
				transaction.rollback();
			e.printStackTrace();
		}

		return emp;
	}

//	public Department saveDepartment(Department dept) {
//
//		try (Session session = HibernateUtilityConfig.getSessionFactory().openSession()) {
//			transaction = session.beginTransaction();
//			session.save(dept);
//			transaction.commit();
//			session.close();
//		} catch (Exception e) {
//			if (transaction != null)
//				transaction.rollback();
//			e.printStackTrace();
//		}
//
//		return dept;
//	}

}

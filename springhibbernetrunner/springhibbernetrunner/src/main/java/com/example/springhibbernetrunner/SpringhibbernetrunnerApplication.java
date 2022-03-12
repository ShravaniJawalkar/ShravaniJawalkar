package com.example.springhibbernetrunner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.springhibbernetrunner.entity.OrderDetails;
import com.example.springhibbernetrunner.entity.Student;
import com.example.springhibbernetrunner.entity.StudentName;
import com.example.springhibbernetrunner.entity.Subject;

@SpringBootApplication
public class SpringhibbernetrunnerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringhibbernetrunnerApplication.class, args);
		Subject sub=new Subject();
		sub.setSubjectName("maths");
		StudentName sname=new StudentName();
		sname.setFname("shravani");
		sname.setLname("jawalkar");
		sname.setMname("pramod");
		Student stud=new Student();
		stud.setMarks(30);
		stud.setName(sname);
		stud.getSubject().add(sub);
		sub.getStudent().add(stud);
		Configuration con =new Configuration().configure("DbFile.cfg.xml").addAnnotatedClass(Student.class).addAnnotatedClass(Subject.class).addAnnotatedClass(OrderDetails.class);
		ServiceRegistry sr=new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		SessionFactory sf=con.buildSessionFactory(sr);
		//SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		session.beginTransaction();
		session.save(stud);
		session.getTransaction().commit();
		session.close();
		Session session2=sf.openSession();
		session2.beginTransaction();
		OrderDetails orderDetails=session2.get(OrderDetails.class, "1khf");
		System.out.println(orderDetails);
		session2.getTransaction().commit();
		session2.close();
		
		
	}

}

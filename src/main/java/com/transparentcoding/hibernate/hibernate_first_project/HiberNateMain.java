package com.transparentcoding.hibernate.hibernate_first_project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.transparentcoding.hibernate.hibernate_first_project.dto.HibernateDemo;

public class HiberNateMain {
	public static void main(String[] args) {

		// create configuration
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml"); // if you have hibernate.cfg.xml then not need to define but
		                                              //if you have different name cfg file then you should to be define
		configuration.addAnnotatedClass(HibernateDemo.class);

		// create session factory
		SessionFactory factory = configuration.buildSessionFactory();

		// initialised the session
		Session session = factory.openSession();   // create a new session with db 

		HibernateDemo demo = new HibernateDemo();
		demo.setId(2);
		demo.setFirstname("John");
		demo.setLastName("Wick");

		session.beginTransaction(); // for SQL Query show 
		session.save(demo);
		session.getTransaction().commit();  // for SQL Query commit 
		System.out.println("session save ... please check db ");
		
		session.close();  // c
	}
}

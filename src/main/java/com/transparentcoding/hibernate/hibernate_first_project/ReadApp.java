package com.transparentcoding.hibernate.hibernate_first_project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.transparentcoding.hibernate.hibernate_first_project.dto.HibernateDemo;

public class ReadApp {
	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(HibernateDemo.class);

		SessionFactory factory = configuration.buildSessionFactory();  // immutable 

		Session session = factory.openSession(); 
		
		HibernateDemo dto = session.get(HibernateDemo.class, 2);
		
//		HibernateDemo dto = session.load(HibernateDemo.class, 2);
		System.out.println(dto);
	}

}

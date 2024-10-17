package com.transparentcoding.hibernate.hibernate_first_project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.transparentcoding.hibernate.hibernate_first_project.dto.HibernateDemo;
import com.transparentcoding.hibernate.hibernate_first_project.utility.HibernateUtilits;

public class HiberNateMain {
	public static void main(String[] args) {

		SessionFactory factory = HibernateUtilits.getSessionFactory();

		// initialised the session
		Session session = factory.openSession(); // create a new session with db

		HibernateDemo demo = new HibernateDemo();
		demo.setId(3);
		demo.setFirstname("Rahul");
		demo.setLastName("Gupta");

		session.beginTransaction(); // for SQL Query show
		session.save(demo);
		session.getTransaction().commit(); // for SQL Query commit
		System.out.println("session save ... please check db ");

		session.close(); // c
	}
}

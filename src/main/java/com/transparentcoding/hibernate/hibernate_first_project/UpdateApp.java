package com.transparentcoding.hibernate.hibernate_first_project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.transparentcoding.hibernate.hibernate_first_project.dto.HibernateDemo;
import com.transparentcoding.hibernate.hibernate_first_project.utility.HibernateUtilits;

public class UpdateApp {
	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtilits.getSessionFactory();

		if (sessionFactory != null) { // removing null pointer exceptions
			Session session = sessionFactory.openSession();
			HibernateDemo demo = session.get(HibernateDemo.class, 1);

			session.beginTransaction();
			demo.setFirstname("NITISH Kumar "); // here internally call Update Method .
//		session.update(demo);
			session.getTransaction().commit();
		}
		System.out.println(" Null pointer exception we get here !");

	}

}

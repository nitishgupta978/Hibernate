package com.transparentcoding.hibernate.hibernate_first_project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.transparentcoding.hibernate.hibernate_first_project.dto.HibernateDemo;

public class UpdateApp {
	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(HibernateDemo.class);

		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();
		HibernateDemo demo = session.get(HibernateDemo.class, 1);
		demo.setFirstname("NITISH "); // only update first name and remain same with change object id

		session.beginTransaction();
		session.update(demo);
		session.getTransaction().commit();
		System.out.println(demo);

	}
}

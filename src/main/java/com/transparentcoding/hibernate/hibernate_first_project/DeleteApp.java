package com.transparentcoding.hibernate.hibernate_first_project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.transparentcoding.hibernate.hibernate_first_project.dto.HibernateDemo;

public class DeleteApp {
	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(HibernateDemo.class);

		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();
		HibernateDemo demo = session.get(HibernateDemo.class, 2);

		session.beginTransaction();
		session.delete(demo);
		session.getTransaction().commit();

	}
}

package com.transparentcoding.hibernate.hibernate_first_project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.transparentcoding.hibernate.hibernate_first_project.dto.HibernateDemo;
import com.transparentcoding.hibernate.hibernate_first_project.utility.HibernateUtilits;

public class DeleteApp {
	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtilits.getSessionFactory();

		Session session = sessionFactory.openSession();
		HibernateDemo demo = session.get(HibernateDemo.class, 2);

		session.beginTransaction();
		session.delete(demo);
		session.getTransaction().commit();

	}
}

package com.transparentcoding.hibernate.hibernate_first_project.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.transparentcoding.hibernate.hibernate_first_project.dto.HibernateDemo;

public class HibernateUtilits { // Singleton pattern use

	private static SessionFactory sessionFactory = null;

	public static SessionFactory getSessionFactory() {

		try {
			if (sessionFactory == null) {
				Configuration configuration = new Configuration();
				configuration.configure();
				configuration.addAnnotatedClass(HibernateDemo.class);

				sessionFactory = configuration.buildSessionFactory();
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("we get some issue");
		}
		return sessionFactory;
	}

}

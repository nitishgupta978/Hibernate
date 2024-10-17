package com.transparentcoding.hibernate.hibernate_first_project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.transparentcoding.hibernate.hibernate_first_project.dto.HibernateDemo;
import com.transparentcoding.hibernate.hibernate_first_project.utility.HibernateUtilits;

public class ReadApp {
	public static void main(String[] args) {

		SessionFactory factory = HibernateUtilits.getSessionFactory(); // immutable

		Session session = factory.openSession();

		HibernateDemo dto = session.get(HibernateDemo.class, 2); // not need to be transaction commit

//		HibernateDemo dto = session.load(HibernateDemo.class, 2);
		System.out.println(dto);
	}

}

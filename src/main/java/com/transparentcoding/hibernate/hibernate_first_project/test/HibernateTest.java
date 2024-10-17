package com.transparentcoding.hibernate.hibernate_first_project.test;

import org.hibernate.SessionFactory;

import com.transparentcoding.hibernate.hibernate_first_project.utility.HibernateUtilits;

public class HibernateTest {
	public static void main(String[] args) { 
		
		SessionFactory sessionFactory1 = HibernateUtilits.getSessionFactory();
		
		SessionFactory sessionFactory2 = HibernateUtilits.getSessionFactory();
		
		if(sessionFactory1 == sessionFactory2) {
		System.out.println("equal reference points are  "+sessionFactory1 +" - "+ sessionFactory2);
		}
		
		
	}

}

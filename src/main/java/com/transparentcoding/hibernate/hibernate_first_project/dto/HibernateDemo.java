package com.transparentcoding.hibernate.hibernate_first_project.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "demo")
public class HibernateDemo { // same table name as db tableName and column name also

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "Firstname")
	private String Firstname;

	@Column(name = "Lastname")
	private String LastName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

}

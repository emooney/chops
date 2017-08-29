package com.emooney.hateoas.chops.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Size(min=2, max=64, message="First Name must be between 2 and 64 characters")
	private String firstName;
	@Size(min=2, max=64, message="Last Name must be between 2 and 64 characters")
	private String lastName;
	@Size(min=2, max=64, message="Title must be between 2 and 64 characters")
	private String title;
	@Size(min=2, max=64, message="Favorite Language must be between 2 and 64 characters")
	private String lang1;
	private String lang2;
	private String lang3;
	private String wishLang1;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLang1() {
		return lang1;
	}
	public void setLang1(String lang1) {
		this.lang1 = lang1;
	}
	public String getLang2() {
		return lang2;
	}
	public void setLang2(String lang2) {
		this.lang2 = lang2;
	}
	public String getLang3() {
		return lang3;
	}
	public void setLang3(String lang3) {
		this.lang3 = lang3;
	}
	public String getWishLang1() {
		return wishLang1;
	}
	public void setWishLang1(String wishLang1) {
		this.wishLang1 = wishLang1;
	}
	
//	public User(int id, String firstName, String lastName, String title, String lang1, String lang2, String lang3,
//			String wishLang1) {
//		super();
//		this.id = id;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.title = title;
//		lang1 = lang1;
//		lang2 = lang2;
//		lang3 = lang3;
//		this.wishLang1 = wishLang1;
//	}

	
	// Heres code to create a user table and data
	/**
	 * 
		CREATE TABLE USER(ID INT PRIMARY KEY, FIRSTNAME VARCHAR(255), LASTNAME VARCHAR(255), TITLE VARCHAR(255), LANG1 VARCHAR(255), LANG2 VARCHAR(255),LANG3 VARCHAR(255),WISHLANG1 VARCHAR(255));
INSERT INTO USER VALUES(1, 'Chris','Selenium', 'JavaScript', 'SharePoint', 'Kramer', 'Analyst', 'Groovy');
INSERT INTO USER VALUES(2, 'Linda','SharePoint', 'JavaScript', 'Python', 'Willey', 'Analyst', 'Java');
INSERT INTO USER VALUES(3, 'Bert','Selenium', 'JavaScript', 'Java','Mooney', 'Validator', 'Java');
INSERT INTO USER VALUES(4, 'Jenny','SharePoint', 'JavaScript', 'Bash','Harrison', 'Analyst', 'Java');
INSERT INTO USER VALUES(5, 'Eric','Java', 'JavaScript', 'Java', 'Mooney', 'IT Specialist', 'Java');
		
		SELECT * FROM USER ORDER BY ID;
		UPDATE USER SET WISHLANG1='Groovy' WHERE ID=4;
	 * 
	 * 
	 */
	
}

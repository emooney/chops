package com.emooney.hateoas.chops.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Person {

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
	private String favoriteLanguage;
	private String image;
	private String otherLanguages;
	
	
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
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}
	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getOtherLanguages() {
		return otherLanguages;
	}
	public void setOtherLanguages(String otherLanguages) {
		this.otherLanguages = otherLanguages;
	}
	
	/**
	 * 	curl -i -X POST -H "Content-Type:application/json" -d "{  \"firstName\" : \"Linda\", \"lastName\" : \"Willey\", \"title\" : \"Validation\", \"favoriteLanguage\" : \"JavaScript\", \"image\" : \"test\", \"otherLanguages\" : \"ReactJS\" }" http://localhost:8080/people
	   curl -i -X POST -H "Content-Type:application/json" -d "{  \"firstName\" : \"Bert\", \"lastName\" : \"Mooney\", \"title\" : \"Programmer\", \"favoriteLanguage\" : \"Java\", \"image\" : \"test\", \"otherLanguages\" : \"javascript\" }" http://localhost:8080/people
	   curl -i -X POST -H "Content-Type:application/json" -d "{  \"firstName\" : \"Chris\", \"lastName\" : \"Kramer\", \"title\" : \"Validation\", \"favoriteLanguage\" : \"JavaScript\", \"image\" : \"test\", \"otherLanguages\" : \"ReactJS\" }" http://localhost:8080/people
	   curl -i -X POST -H "Content-Type:application/json" -d "{  \"firstName\" : \"Jenny\", \"lastName\" : \"Harrison\", \"title\" : \"Validation\", \"favoriteLanguage\" : \"JavaScript\", \"image\" : \"test\", \"otherLanguages\" : \"javascript\" }" http://localhost:8080/people
	   curl -i -X POST -H "Content-Type:application/json" -d "{  \"firstName\" : \"Kurt\", \"lastName\" : \"Hilgartner\", \"title\" : \"Programmer\", \"favoriteLanguage\" : \"Java\", \"image\" : \"test\", \"otherLanguages\" : \"javascript\" }" http://localhost:8080/people
	   curl -i -X POST -H "Content-Type:application/json" -d "{  \"firstName\" : \"Wade\", \"lastName\" : \"Hilgartner\", \"title\" : \"Programmer\", \"favoriteLanguage\" : \"JavaScript\", \"image\" : \"test\", \"otherLanguages\" : \"javascript\" }" http://localhost:8080/people
	   curl -i -X POST -H "Content-Type:application/json" -d "{  \"firstName\" : \"Bruce\", \"lastName\" : \"Hilgartner\", \"title\" : \"Validation\", \"favoriteLanguage\" : \"JavaScript\", \"image\" : \"test\", \"otherLanguages\" : \"ReactJS\" }" http://localhost:8080/people
	   curl -i -X POST -H "Content-Type:application/json" -d "{  \"firstName\" : \"Melanie\", \"lastName\" : \"Romagnoli\", \"title\" : \"Programmer\", \"favoriteLanguage\" : \"JavaScript\", \"image\" : \"test\", \"otherLanguages\" : \"javascript\" }" http://localhost:8080/people
	   curl -i -X POST -H "Content-Type:application/json" -d "{  \"firstName\" : \"Bunny\", \"lastName\" : \"Mooney\", \"title\" : \"Validation\", \"favoriteLanguage\" : \"Java\", \"image\" : \"test\", \"otherLanguages\" : \"javascript\" }" http://localhost:8080/people
	   curl -i -X POST -H "Content-Type:application/json" -d "{  \"firstName\" : \"Bert\", \"lastName\" : \"Mooney\", \"title\" : \"Programmer\", \"favoriteLanguage\" : \"JavaScript\", \"image\" : \"test\", \"otherLanguages\" : \"javascript\" }" http://localhost:8080/people
	 */
	
}

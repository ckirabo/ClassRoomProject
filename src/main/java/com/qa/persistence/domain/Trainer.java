package com.qa.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Trainer")
public class Trainer {

	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Id
	private int id;

	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	

	public Trainer() {

	}
	
	public Trainer(String vfirstName, String vlastName) {
		this.firstName = vfirstName;
		this.lastName = vlastName;
	}
	
	

	public String getTrainerName() {
		return firstName;
	}

	public void setTrainerName(String trainerName) {
		this.firstName = trainerName;
	}


	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getTrainer() {
		return firstName + " " + lastName;
	}

}

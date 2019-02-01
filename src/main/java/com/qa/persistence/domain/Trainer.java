package com.qa.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trainer {

	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Id
	private int id;

	private String trainerName;

	public Trainer() {

	}
	
	public Trainer(String vTrainerName) {
		this.trainerName = vTrainerName;
	}
	
	

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}


	public String getTrainer() {
		return trainerName;
	}

}

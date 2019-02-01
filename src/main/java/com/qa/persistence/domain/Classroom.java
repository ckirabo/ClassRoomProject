package com.qa.persistence.domain;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Classroom")
public class Classroom {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Id
	private int id;
	
	
		
	public Classroom() {
		
	}

	
}

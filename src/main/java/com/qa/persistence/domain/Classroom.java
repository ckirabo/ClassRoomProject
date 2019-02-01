package com.qa.persistence.domain;

import java.util.Collection;
import java.util.LinkedHashSet;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
	private int classroomId;
	
	
	private String trainerFirstName;
	
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "classroomId", cascade = CascadeType.ALL)
	private Collection<Trainer> trainers = new LinkedHashSet<Trainer>(); 
		
	public Classroom() {
		
	}
	
	public Classroom(int vClassroomId, String vTrainerFirstName) {
		this.classroomId = vClassroomId;
		this.trainerFirstName = vTrainerFirstName;
	}

	public int getClassroomId() {
		return classroomId;
	}

	public void setClassroomId(int classroomId) {
		this.classroomId = classroomId;
	}

	public String getTrainerFirstName() {
		return trainerFirstName;
	}

	public void setTrainerFirstName(String trainerFirstName) {
		this.trainerFirstName = trainerFirstName;
	}

	
}

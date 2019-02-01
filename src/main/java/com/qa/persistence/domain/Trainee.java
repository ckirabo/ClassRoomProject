package com.qa.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Trainee")
public class Trainee {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer id;

	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	private Integer classroomId;

	public Trainee() {

	}
	
	public Trainee(Integer vClassroomId, String vfirstName, String vlastName ) {
		this.classroomId = vClassroomId;
		this.firstName = vfirstName;
		this.lastName = vlastName;
	}
	
	

	public String getTraineeName() {
		return firstName;
	}

	public void setTraineeName(String traineeName) {
		this.firstName = traineeName;
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

	public Integer getClassroomId() {
		return classroomId;
	}

	public void setClassroomId(Integer classroomId) {
		this.classroomId = classroomId;
	}

}

package com.qa.persistence.repository;

public interface ClassroomRepository {
	String getAllClassrooms();
	String getAClassroom();
	String createClassroom();
	String deleteClassroom(int id);
	String updateClassroom(int id); //???? id trainer
}

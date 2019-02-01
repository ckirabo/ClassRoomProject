package com.qa.persistence.repository;

public interface TraineeRepository {

	String getAllTrainees();
	String getATrainee(int id);
	String createTrainee(String trainee);
	String deleteTrainees(int id);
	String updateTrainee(int id, String trainee);
}

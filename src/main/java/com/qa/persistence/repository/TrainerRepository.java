package com.qa.persistence.repository;

public interface TrainerRepository {

	String getAllTrainers();
	String getATrainer();
	String createTrainer(String trainer);
	String deleteTrainert(int id);
	String updateTrainer(int id, String trainer);
}

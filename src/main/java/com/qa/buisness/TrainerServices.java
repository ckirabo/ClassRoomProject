package com.qa.buisness;

public interface TrainerServices {
	String getAllTrainers();
	String getATrainer(int id);
	String createTrainer(String trainer);
	String deleteTrainer(int id);
	String updateTrainer(int id, String trainer);
}

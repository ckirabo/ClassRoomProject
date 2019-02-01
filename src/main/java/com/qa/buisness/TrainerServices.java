package com.qa.buisness;

public interface TrainerServices {
	String getAllTrainees();
	String getATrainee(int id);
	String createTrainee(String trainer);
	String deleteTrainee(int id);
	String updateTrainee(int id, String trainer);
}

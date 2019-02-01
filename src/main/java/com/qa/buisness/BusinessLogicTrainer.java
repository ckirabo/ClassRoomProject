package com.qa.buisness;

import javax.inject.Inject;

import com.qa.persistence.repository.TraineeRepository;


public class BusinessLogicTrainer implements TrainerServices {

	@Inject
	private TraineeRepository tRepo;

	public String getAllTrainees() {
		return tRepo.getAllTrainees();
	}
	
	public String getATrainee(int id) {
		return tRepo.getATrainee(id);
	}

	public String createTrainee(String trainee) {
		return tRepo.createTrainee(trainee);
	}

	public String deleteTrainee(int id) {
		return tRepo.deleteTrainees(id);
	}

	public String updateTrainee(int id, String trainee) {
		return tRepo.updateTrainee(id, trainee);
	}



}

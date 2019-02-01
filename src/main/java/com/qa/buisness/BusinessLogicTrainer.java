package com.qa.buisness;

import javax.inject.Inject;

import com.qa.persistence.repository.TrainerRepository;


public class BusinessLogicTrainer implements TrainerServices {

	@Inject
	private TrainerRepository tRepo;

	public String getAllTrainers() {
		return tRepo.getAllTrainers();
	}

	public String getATrainer(int id) {
		return tRepo.getATrainer(id);
	}

	public String createTrainer(String trainer) {
		return tRepo.createTrainer(trainer);
	}

	public String deleteTrainer(int id) {
		return tRepo.deleteTrainert(id);
	}

	public String updateTrainer(int id, String trainer) {
		return tRepo.updateTrainer(id, trainer);
	}

}

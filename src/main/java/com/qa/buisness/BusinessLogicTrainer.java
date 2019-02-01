package com.qa.buisness;

import javax.inject.Inject;

import com.qa.persistence.repository.TrainerRepository;
import com.qa.utils.JSONUtil;

public class BusinessLogicTrainer implements TrainerServices {

	@Inject
	private TrainerRepository tRepo;

	@Inject
	private JSONUtil json;

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
		// TODO Auto-generated method stub
		return tRepo.deleteTrainert(id);
	}

	public String updateTrainer(int id, String trainer) {
		// TODO Auto-generated method stub
		return tRepo.updateTrainer(id, trainer);
	}

}

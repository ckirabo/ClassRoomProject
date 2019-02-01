package com.qa.persistence.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.qa.utils.JSONUtil;

@Transactional(SUPPORTS)
@Default
public class TrainerDBImplementation implements TrainerRepository {

	@PersistenceContext(unitName = "primary")
	private EntityManager em;
	
	
	@Inject
	private JSONUtil jsonUtil;


	public String getAllTrainers() {
		// TODO Auto-generated method stub
		return null;
	}


	public String getATrainer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional(REQUIRED)
	public String createTrainer(String trainer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional(REQUIRED)
	public String deleteTrainert(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional(REQUIRED)
	public String updateTrainer(int id, String trainer) {
		// TODO Auto-generated method stub
		return null;
	}
}

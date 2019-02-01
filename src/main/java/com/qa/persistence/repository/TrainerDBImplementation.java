package com.qa.persistence.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.Collection;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.qa.persistence.domain.Trainer;
import com.qa.utils.JSONUtil;

@Transactional(SUPPORTS)
@Default
public class TrainerDBImplementation implements TrainerRepository {

	@PersistenceContext(unitName = "primary")
	private EntityManager em;

	@Inject
	private JSONUtil jsonUtil;

	public String getAllTrainers() {
		Query query = em.createQuery("SELECT t FROM Trainer t");
		Collection<Trainer> trainers = (Collection<Trainer>) query.getResultList();
		return jsonUtil.getJSONForObject(trainers);
	}

	public String getATrainer(int id) {
		Trainer foundTrainer = em.find(Trainer.class, id);
		return jsonUtil.getJSONForObject(foundTrainer);
	}

	@Transactional(REQUIRED)
	public String createTrainer(String trainer) {
		Trainer newTrainer = jsonUtil.getObjectForJSON(trainer, Trainer.class);
		em.persist(newTrainer);
		return "{ \"Message\" : \"The trainer has arrived!\"}";
	}

	@Transactional(REQUIRED)
	public String deleteTrainert(int id) {
		Trainer thisTrainer = em.find(Trainer.class, id);
		
		if(thisTrainer != null) {
			em.remove(thisTrainer);
			return "{ \"Message\" : \"The trainer has been thown out !\"}";
		}
		return "{ \"Message\" : \"The trainer never even existed\"}";
	}

	@Transactional(REQUIRED)
	public String updateTrainer(int id, String trainer) {
		Trainer newTrainer =jsonUtil.getObjectForJSON(trainer, Trainer.class);
		
		Trainer thisTrainer = em.find(Trainer.class, id);
		
		if(thisTrainer != null) {
			em.remove(thisTrainer);
			em.persist(newTrainer);
			return "{ \"Message\" : \"The trainer infor has been updated\"}";
		}
		return "{ \"Message\" : \"Returned the Account\"}";
	}
}

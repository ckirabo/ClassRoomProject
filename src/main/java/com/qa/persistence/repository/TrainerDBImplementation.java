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

import com.qa.persistence.domain.Trainee;
import com.qa.utils.JSONUtil;

@Transactional(SUPPORTS)
@Default
public class TrainerDBImplementation implements TraineeRepository {

	@PersistenceContext(unitName = "primary")
	private EntityManager em;

	@Inject
	private JSONUtil jsonUtil;

	public String getAllTrainees() {
		Query query = em.createQuery("SELECT t FROM Trainee t");
		Collection<Trainee> trainees = (Collection<Trainee>) query.getResultList();
		return jsonUtil.getJSONForObject(trainees);
	}

	public String getATrainee(int id) {
		Trainee foundTrainee = em.find(Trainee.class, id);
		return jsonUtil.getJSONForObject(foundTrainee);
	}

	@Transactional(REQUIRED)
	public String createTrainee(String trainee) {
		Trainee newTrainee = jsonUtil.getObjectForJSON(trainee, Trainee.class);
		em.persist(newTrainee);
		return "{ \"Message\" : \"The trainee has arrived!\"}";
	}

	@Transactional(REQUIRED)
	public String deleteTrainees(int id) {
		Trainee thisTrainee = em.find(Trainee.class, id);
		
		if(thisTrainee != null) {
			em.remove(thisTrainee);
			return "{ \"Message\" : \"The trainee has been thown out !\"}";
		}
		return "{ \"Message\" : \"The trainee never even existed\"}";
	}

	@Transactional(REQUIRED)
	public String updateTrainee(int id, String trainee) {
		Trainee newTrainee =jsonUtil.getObjectForJSON(trainee, Trainee.class);
		
		Trainee thisTrainee = em.find(Trainee.class, id);
		
		if(thisTrainee != null) {
			em.remove(thisTrainee);
			em.persist(newTrainee);
			return "{ \"Message\" : \"The trainee info has been updated\"}";
		}
		return "{ \"Message\" : \"Returned the trainee\"}";
	}
}

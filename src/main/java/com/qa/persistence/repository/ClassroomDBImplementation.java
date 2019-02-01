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

import com.qa.persistence.domain.Classroom;
import com.qa.utils.JSONUtil;

@Transactional(SUPPORTS)
@Default
public class ClassroomDBImplementation implements ClassroomRepository {
	

	@PersistenceContext(unitName = "primary")
	private EntityManager em;
	
	
	@Inject
	private JSONUtil jsonUtil;


	public String getAllClassrooms() {
		Query query = em.createQuery("SELECT c FROM Classroom c");
		Collection<Classroom> Classrooms = (Collection<Classroom>) query.getResultList();
		return jsonUtil.getJSONForObject(Classrooms);
	}


	public String getAClassroom(int id) {
		Classroom foundClassroom = em.find(Classroom.class, id);
		return jsonUtil.getJSONForObject(foundClassroom);
	}

	@Transactional(REQUIRED)
	public String createClassroom(String trainer) {
		Classroom aTrainer = jsonUtil.getObjectForJSON(trainer, Classroom.class);
		em.persist(aTrainer);
		return "{ \"Message\" : \"The Classroom has trainers !\"}";
	}

	@Transactional(REQUIRED)
	public String deleteClassroom(int id) {
		Classroom thisClassroom = em.find(Classroom.class, id);
		
		if(thisClassroom != null) {
			em.remove(thisClassroom);
			return "{ \"Message\" : \"The Classroom has been dissapeared lol !\"}";
		}
		
		return "{ \"Message\" : \"The Classroom never existed\"}";
	}

	@Transactional(REQUIRED)
	public String updateClassroom(int id, String trainer) {
		Classroom newTrainer = jsonUtil.getObjectForJSON(trainer, Classroom.class);
		
		Classroom thisClassroom =  em.find(Classroom.class, id);
		
		if(thisClassroom != null) {
			em.remove(thisClassroom);
			em.persist(newTrainer);
			return "{ \"Message\" : \"The Classroom name has been updated\"}";
		}
		
		return "{ \"Message\" : \"Classroom could not be updated\"}";
	}



}

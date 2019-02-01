package com.qa.persistence.repository;

import static javax.transaction.Transactional.TxType.SUPPORTS;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.qa.utils.JSONUtil;

@Transactional(SUPPORTS)
@Default
public class ClassroomDBImplementation implements ClassroomRepository {
	

	@PersistenceContext(unitName = "primary")
	private EntityManager em;
	
	
	@Inject
	private JSONUtil jsonUtil;


	public String getAllClassrooms() {
		// TODO Auto-generated method stub
		return null;
	}


	public String getAClassroom() {
		// TODO Auto-generated method stub
		return null;
	}


	public String createClassroom() {
		// TODO Auto-generated method stub
		return null;
	}


	public String deleteClassroom(int id) {
		// TODO Auto-generated method stub
		return null;
	}


	public String updateClassroom(int id, String trainers) {
		// TODO Auto-generated method stub
		return null;
	}


}

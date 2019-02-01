package com.qa.buisness;

import javax.inject.Inject;

import com.qa.persistence.repository.ClassroomRepository;

public class BuisnessLogicClassroom implements ClassroomServices {

	@Inject
	private ClassroomRepository cRepo;
	
	public String getAllClassrooms() {
	
		return cRepo.getAllClassrooms();
	}

	public String getAClassroom(int id) {
		return cRepo.getAClassroom(id);
	}

	public String createClassroom(String trainer) {
		return cRepo.createClassroom(trainer);
	}

	public String deleteClassroom(int id) {
		return cRepo.deleteClassroom(id);
	}

	public String updateClassroom(int id, String trainer) {

		return cRepo.updateClassroom(id, trainer);
	}

}

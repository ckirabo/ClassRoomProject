package com.qa.buisness;

public interface ClassroomServices {
	String getAllClassrooms();
	String getAClassroom(int id);
	String createClassroom(String trainer);
	String deleteClassroom(int id);
	String updateClassroom(int id, String trainer);
}

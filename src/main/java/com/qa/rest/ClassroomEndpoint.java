package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.buisness.ClassroomServices;

@Path("/Classroom")
public class ClassroomEndpoint {

	@Inject
	private ClassroomServices classroomInterfaces;
	
	@GET
	@Path("/allClassrooms")
	@Produces({ "application/json" })
	public String getAllClassrooms() {
		return classroomInterfaces.getAllClassrooms();
	}
	
	@GET
	@Path("/getAClassroom/{id}")
	@Produces({ "application/json" })
	public String getAClassroom(@PathParam("id") int id) {
		return classroomInterfaces.getAClassroom(id);
	}
	
	
	@POST
	@Path("/createAClassroom")
	@Produces({ "application/json" })
	public String createClassroom(String trainer) {
		return classroomInterfaces.createClassroom(trainer);
	}
	
	@DELETE
	@Path("/deleteClassroom/{id}")
	@Produces({ "application/json" })
	public String deleteClassroom(@PathParam("id") int id) {
		return classroomInterfaces.deleteClassroom(id);
	}

	@PUT
	@Path("/updateClassroom/{id}")
	@Produces({ "application/json" })
	public String updateClassroom(@PathParam("id") int id, String trainer) {
		return classroomInterfaces.updateClassroom(id, trainer);
	}
	
	
	
}

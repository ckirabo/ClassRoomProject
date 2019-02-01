package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.buisness.TrainerServices;



@Path("/Trainee")
public class TraineEndpoint {

	@Inject 
	private TrainerServices traineeInterface;
	
	@GET
	@Path("/allTrainee")
	@Produces({ "application/json" })
	public String getAllAccounts() {
		return traineeInterface.getAllTrainees();
	}
	
	@GET
	@Path("/getATrainee/{id}")
	@Produces({ "application/json" })
	public String getATrainer(@PathParam("id") int id) {
		return traineeInterface.getATrainee(id);
	}
	
	
	@POST
	@Path("/createTrainee")
	@Produces({ "application/json" })
	public String createAccount(String trainee) {
		return traineeInterface.createTrainee(trainee);
	}
	
	@DELETE
	@Path("/deleteTrainee/{id}")
	@Produces({ "application/json" })
	public String deleteAccount(@PathParam("id") int id) {
		return traineeInterface.deleteTrainee(id);
	}

	@PUT
	@Path("/updateTrainee/{id}")
	@Produces({ "application/json" })
	public String deleteAccount(@PathParam("id") int id, String trainee) {
		return traineeInterface.updateTrainee(id, trainee);
	}
	
	
}

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



@Path("/Trainer")
public class TrainerEndpoint {

	@Inject 
	private TrainerServices trainerInterface;
	
	@GET
	@Path("/allTrainers")
	@Produces({ "application/json" })
	public String getAllAccounts() {
		return trainerInterface.getAllTrainers();
	}
	
	@GET
	@Path("/getATrainer")
	@Produces({ "application/json" })
	public String getATrainer(@PathParam("id") int id) {
		return trainerInterface.getATrainer(id);
	}
	
	
	@POST
	@Path("/createTrainer")
	@Produces({ "application/json" })
	public String createAccount(String trainer) {
		return trainerInterface.createTrainer(trainer);
	}
	
	@DELETE
	@Path("/deleteTrainer/{id}")
	@Produces({ "application/json" })
	public String deleteAccount(@PathParam("id") int id) {
		return trainerInterface.deleteTrainer(id);
	}

	@PUT
	@Path("/updateTrainer/{id}")
	@Produces({ "application/json" })
	public String deleteAccount(@PathParam("id") int id, String trainer) {
		return trainerInterface.updateTrainer(id, trainer);
	}
	
	
}

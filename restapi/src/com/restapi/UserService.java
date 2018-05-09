package com.restapi;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/UserService")
public class UserService {

	private UserDao userDao = new UserDao();
	
	@GET
	@Path("/users")
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getAllUsers(){
		return userDao.getAllUsers();
	}
	
	@POST
	@Path("/createuser")
	@Consumes(MediaType.APPLICATION_JSON)
	public void createUser(User user){
		System.out.println("user : " + user);
	}
}

package com.javawsrest.demorest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("aliens")
public class AlienResource {
	
	AlienRepository repo = new AlienRepository();
	
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<AlienClass>  getAliensData()
	{
		System.out.println("get aliens print..");
			
		return repo.getAliens();
	}
	
	@GET
	@Path("alien/{age}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public AlienClass  getAlienData(@PathParam("age") int age)
	{
		System.out.println("get aliens print..");
			
		return repo.getAlien(age);
	}
	
	@POST
	@Path("alien")
	@Consumes(MediaType.APPLICATION_XML)
	public AlienClass createAlien(AlienClass a1)
	{
		System.out.println(a1);
		repo.create(a1);
		
		return a1;
	}

}

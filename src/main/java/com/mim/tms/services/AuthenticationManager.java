package com.mim.tms.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/auth")
public class AuthenticationManager {

	@GET
	@Path("login/{param}")
	public Response login(@PathParam("param") String msg) {

		String output = "login request : " + msg;

		return Response.status(200).entity(output).build();

	}

}
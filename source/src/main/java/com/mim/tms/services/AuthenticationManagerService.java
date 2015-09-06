package com.mim.tms.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.NewCookie;
import javax.ws.rs.core.Response;

@Path("/auth")
public class AuthenticationManagerService {

	@GET
	@Path("login/{param}")
	public Response login(@PathParam("param") String msg) {

		String output = "login request : " + msg;

		return Response.status(200)
				.cookie(new NewCookie("token", "123456_" + output)).build();
		// return Response.status(200).entity(output).build();

	}

}
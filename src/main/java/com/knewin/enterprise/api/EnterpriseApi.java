package com.knewin.enterprise.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path(EnterpriseApi.BASE_PATH)
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface EnterpriseApi {

	public static final String BASE_PATH = "/v1";

	@GET
	@Path("/companies")
	public Response getCompanies();

	@GET
	@Path("/clients/{companyId}")
	public Response getClients(@PathParam("companyId") final Integer companyId);

}

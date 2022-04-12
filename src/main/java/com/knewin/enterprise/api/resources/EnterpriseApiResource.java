package com.knewin.enterprise.api.resources;

import java.util.Map;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.knewin.enterprise.api.EnterpriseApi;
import com.knewin.enterprise.api.services.EnterpriseApiService;


@Path(EnterpriseApi.BASE_PATH)
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class EnterpriseApiResource implements EnterpriseApi{

	@Inject
	EnterpriseApiService service;

	@Override
	public Response getCompanies() {
		final Map<Integer, String> result = service.getCompanies();
		return result.isEmpty() ? Response.noContent().build() : Response.ok(result).build();
	}

	@Override
	public Response getClients(final Integer companyId) {
		return Response.ok(companyId).build();
	}
}
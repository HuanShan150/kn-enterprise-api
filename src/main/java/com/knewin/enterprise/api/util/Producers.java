package com.knewin.enterprise.api.util;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Produces;

import com.knewin.database.dao.CompanyDao;
import com.knewin.database.dao.DaoFactory;

public class Producers {

	@Produces
	@ApplicationScoped
	CompanyDao CreateCompanyDao() {
		return DaoFactory.getDaoFactory().getCompanyDao();
	}
}

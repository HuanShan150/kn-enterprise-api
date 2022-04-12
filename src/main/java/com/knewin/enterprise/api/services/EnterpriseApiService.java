package com.knewin.enterprise.api.services;

import java.sql.SQLException;
import java.util.Collections;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Provider;

import com.knewin.database.dao.CompanyDao;


@ApplicationScoped
public class EnterpriseApiService {

	@Inject
	Provider<CompanyDao> companyDao;

	public Map<Integer, String> getCompanies() {
		try {
			return companyDao.get().getCompanies();
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		return Collections.emptyMap();
	}

	public void getClients(final Integer companyId) {

	}


}
package com.knewin.enterprise.api.util;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

import com.knewin.database.Database;

import io.agroal.api.AgroalDataSource;
import io.quarkus.runtime.StartupEvent;

@ApplicationScoped
public class StartupConfig {

	void onStart(@Observes final StartupEvent ev, final AgroalDataSource dataSource) {
		Database.setDataAccess(new DataAccessImpl(dataSource));
	}

}

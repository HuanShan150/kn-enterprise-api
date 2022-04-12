package com.knewin.enterprise.api.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.knewin.database.DataAccess;

import io.agroal.api.AgroalDataSource;

public class DataAccessImpl implements DataAccess {

	private final AgroalDataSource dataSource;

	public DataAccessImpl(final AgroalDataSource dataSource) {
		this.dataSource = dataSource;
	}


	@Override
	public Connection getConnection() throws SQLException {
		return dataSource.getConnection();
	}


	@Override
	public String getJdbcUrl() throws IOException, ClassNotFoundException {
		return null;
	}


	@Override
	public String getPassword() throws IOException, ClassNotFoundException {
		return null;
	}


	@Override
	public String getUsername() throws IOException, ClassNotFoundException {
		return null;
	}


	@Override
	public void close() throws SQLException {

	}


	@Override
	public DataSource getDataSource() throws SQLException {
		return null;
	}

}

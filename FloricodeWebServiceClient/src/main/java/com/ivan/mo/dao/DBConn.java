package com.ivan.mo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
	public Connection dataBaseConnection(String url, String userName, String userPassword) {

		Connection dbConn = null;
		try {
			dbConn = DriverManager.getConnection(url, userName, userPassword);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return dbConn;
	}
}

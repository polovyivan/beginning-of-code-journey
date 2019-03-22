package com.ivan.mo.dao;

public class DBConnSingleton {
	static DBConn instance = new DBConn();

	public DBConn getInstance() {
		return instance;
	}
}

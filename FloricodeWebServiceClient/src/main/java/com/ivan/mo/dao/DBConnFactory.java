package com.ivan.mo.dao;

import java.sql.Connection;

public class DBConnFactory {

	public static Connection getDBConnLocalSingleton() {

		String url = "jdbc:mysql://localhost:3306/xxxxx_xxxxxx?useTimezone=true&serverTimezone=UTC";
		String userName = "xxxx";
		String userPassword = "xxxxxxxxxxxxxxxxxxx";

		return new DBConnSingleton().getInstance().dataBaseConnection(url, userName, userPassword);
	}

}

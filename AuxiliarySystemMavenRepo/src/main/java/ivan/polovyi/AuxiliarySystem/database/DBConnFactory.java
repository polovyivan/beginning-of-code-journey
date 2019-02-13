package ivan.polovyi.AuxiliarySystem.database;

import java.sql.Connection;

/*
 * Factory pattern used to manage connections to different DB
 */
public class DBConnFactory {

	public static Connection getDBConnHBLOSingleton() {

		String url = "jdbc:mysql://192.xxx.xxx.xxx:3306/ivanprogramming";
		String userName = "ivan_progranning1";
		String userPassword = "ivan_exemple1";

		return new DBConnSingleton().getInstance().dataBaseConnection(url, userName, userPassword);
	}

	public static Connection getDBConnUnoSingleton() {

		String url = "jdbc:mysql://xxxxxxxxx.xxxxxp.com.br:60140/db_uc_example";
		String userName = "ivan_progranning2";
		String userPassword = "ivan_exemple2";

		return new DBConnSingleton().getInstance().dataBaseConnection(url, userName, userPassword);
	}

}

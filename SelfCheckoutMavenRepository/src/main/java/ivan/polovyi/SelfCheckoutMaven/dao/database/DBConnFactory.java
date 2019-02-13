package ivan.polovyi.SelfCheckoutMaven.dao.database;

import java.sql.Connection;

/*
 * Factory pattern used to manage connections to different data bases 
 */
public class DBConnFactory {

	public static Connection getDBConnHBLOSingleton() {

		String url = "jdbc:mysql://192.xxx.xxx.xxx:xxxx/ivan_programming";
		String userName = "selfservice";
		String userPassword = "gitexampler";

		return new DBConnSingleton().getInstance().dataBaseConnection(url, userName, userPassword);
	}

}

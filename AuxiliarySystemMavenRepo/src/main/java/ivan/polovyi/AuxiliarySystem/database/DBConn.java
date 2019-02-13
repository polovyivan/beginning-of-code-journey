package ivan.polovyi.AuxiliarySystem.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import ivan.polovyi.AuxiliarySystem.view.ViewFactory;

public class DBConn {

	public Connection dataBaseConnection(String url, String userName, String userPassword) {

		Connection dbConn = null;
		try {
			dbConn = DriverManager.getConnection(url, userName, userPassword);
		} catch (SQLException e) {
			e.printStackTrace();
			ViewFactory error = new ViewFactory();
			error.getErrorMess("DBConn class_ " + e.toString());

		}

		return dbConn;
	}

}

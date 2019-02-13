package ivan.polovyi.AuxiliarySystem.database;
/*
 * Singleton pattern is used to have only one data base connection object.
 */
public class DBConnSingleton {

	static DBConn instance = new DBConn();
		
	public DBConn getInstance() {
		return instance;
	}

}

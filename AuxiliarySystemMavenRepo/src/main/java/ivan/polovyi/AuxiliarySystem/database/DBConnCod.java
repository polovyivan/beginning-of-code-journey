package ivan.polovyi.AuxiliarySystem.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ivan.polovyi.AuxiliarySystem.view.ViewFactory;

public class DBConnCod {

	public ArrayList<String> executeQuery() throws SQLException {

		ArrayList<String> codes = new ArrayList<String>();

		String mySQLQuery = "SELECT \r\n" + "    (SELECT \r\n" + "            cod_produto\r\n" + "        FROM\r\n"
				+ "            cd_produto\r\n" + "        WHERE\r\n" + "            cod_produto NOT LIKE 'HA%'\r\n"
				+ "                AND cod_produto NOT LIKE 'HIMP%'\r\n"
				+ "                AND cod_produto NOT LIKE 'HS%'\r\n"
				+ "                AND cod_produto NOT LIKE 'HP%'\r\n"
				+ "                AND cod_produto NOT LIKE 'HC%'\r\n" + "        ORDER BY dt_implant DESC\r\n"
				+ "        LIMIT 1) AS cod_H,\r\n" + "    (SELECT \r\n" + "            cod_produto\r\n"
				+ "        FROM\r\n" + "            cd_produto\r\n" + "        WHERE\r\n"
				+ "            cod_produto LIKE 'HA%'\r\n" + "        ORDER BY dt_implant DESC\r\n"
				+ "        LIMIT 1) AS cod_HA,\r\n" + "    (SELECT \r\n" + "            cod_produto\r\n"
				+ "        FROM\r\n" + "            cd_produto\r\n" + "        WHERE\r\n"
				+ "            cod_produto LIKE 'HIMP%'\r\n" + "        ORDER BY dt_implant DESC\r\n"
				+ "        LIMIT 1) AS cod_HIMP,\r\n" + "    (SELECT \r\n" + "            cod_produto\r\n"
				+ "        FROM\r\n" + "            cd_produto\r\n" + "        WHERE\r\n"
				+ "            cod_produto LIKE 'HC%'\r\n" + "        ORDER BY dt_implant DESC\r\n"
				+ "        LIMIT 1) AS cod_HC,\r\n" + "    (SELECT \r\n" + "            cod_produto\r\n"
				+ "        FROM\r\n" + "            cd_produto\r\n" + "        WHERE\r\n"
				+ "            cod_produto LIKE 'HP%'\r\n" + "        ORDER BY dt_implant DESC\r\n"
				+ "        LIMIT 1) AS cod_HP,\r\n" + "    (SELECT \r\n" + "            cod_produto\r\n"
				+ "        FROM\r\n" + "            cd_produto\r\n" + "        WHERE\r\n"
				+ "            cod_produto LIKE 'HS%'\r\n" + "        ORDER BY dt_implant DESC\r\n"
				+ "        LIMIT 1) AS cod_HS\r\n" + "FROM\r\n" + "    cd_produto\r\n" + "ORDER BY dt_implant DESC\r\n"
				+ "LIMIT 1\r\n" + "";

		Connection conn = null;
		PreparedStatement mySt = null;
		ResultSet rs = null;

		try {

			conn = DBConnFactory.getDBConnUnoSingleton();
			mySt = conn.prepareStatement(mySQLQuery);
			rs = mySt.executeQuery();

			while (rs.next()) {
				
				codes.add(rs.getString("cod_H"));
				
				codes.add(rs.getString("cod_HA"));
				
				codes.add(rs.getString("cod_HIMP"));
				
				codes.add(rs.getString("cod_HC"));
				
				codes.add(rs.getString("cod_HP"));
				
				codes.add(rs.getString("cod_HS"));

			}

		} catch (SQLException e) {
			e.printStackTrace();
			ViewFactory error = new ViewFactory();
			error.getErrorMess("DBConnCod class_ " + e.toString());

		} finally {

			try {

				if (rs != null) {
					rs.close();
				}
				if (mySt != null) {
					mySt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException sqlee) {
				sqlee.printStackTrace();
				ViewFactory error = new ViewFactory();
				error.getErrorMess("DBConnXML class_ " + sqlee.toString());
			}

		}

		return codes;
	}

}

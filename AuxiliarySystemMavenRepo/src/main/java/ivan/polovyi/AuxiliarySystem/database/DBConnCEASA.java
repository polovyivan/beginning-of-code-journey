package ivan.polovyi.AuxiliarySystem.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ivan.polovyi.AuxiliarySystem.view.ViewFactory;

public class DBConnCEASA {

	public String executeQuery(String supplierCNPJ) throws SQLException {

		String mySQLQuery = "SELECT cnpj FROM cd_fornecedor where cod_fornecedor = ?";

		int i = 0;
		i++;
		Connection conn = null;
		PreparedStatement mySt = null;
		ResultSet rs = null;

		try {

			conn = DBConnFactory.getDBConnUnoSingleton();

			mySt = conn.prepareStatement(mySQLQuery);

			mySt.setString(1, supplierCNPJ);

			rs = mySt.executeQuery();
			if (!rs.isBeforeFirst()) {

				supplierCNPJ = "sem cadastro";

			} else {

				while (rs.next()) {

					supplierCNPJ = rs.getString("cnpj");

				}

			}

		} catch (SQLException e) {
			e.printStackTrace();
			ViewFactory error = new ViewFactory();
			error.getErrorMess("DBConnXML class_ " + e.toString());

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

		return supplierCNPJ;
	}

}

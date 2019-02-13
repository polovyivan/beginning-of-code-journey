package ivan.polovyi.AuxiliarySystem.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ivan.polovyi.AuxiliarySystem.view.ViewFactory;

public class DBConnInventory {
	public String getProductCode(String productCode) {

		String mySQLQuery = "SELECT cod_produto FROM cd_produto_fornecedor WHERE  cod_fornecedor = 5727 and  cod_produto_fornec = ?";

		Connection conn = null;
		PreparedStatement mySt = null;
		ResultSet rs = null;
		try {

			conn = DBConnFactory.getDBConnUnoSingleton();

			mySt = conn.prepareStatement(mySQLQuery);

			mySt.setString(1, productCode);

			rs = mySt.executeQuery();

			if (!rs.isBeforeFirst()) {

				productCode = "sem cadastro";
			}

			else {
				while (rs.next()) {
					productCode = rs.getString("cod_produto");

				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
			ViewFactory error = new ViewFactory();
			error.getErrorMess("BDConnImp class_ " + e.toString());
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
				error.getErrorMess("BDConnImp class_ " + sqlee.toString());
			}

		}
		return productCode;
	}

}

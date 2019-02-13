package ivan.polovyi.AuxiliarySystem.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ivan.polovyi.AuxiliarySystem.model.utilities.beans.ProductBean;
import ivan.polovyi.AuxiliarySystem.view.ViewFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DBConnDuplicates {

	public ObservableList<ProductBean> executeQuery() throws SQLException {
		ObservableList<ProductBean> listOfProducts = FXCollections.observableArrayList();

		String mySQLQuery = "SELECT \r\n"
				+ "    cd_produto.cod_produto, cd_produto.desc_comercial, COUNT(*) as count\r\n" + "FROM\r\n"
				+ "    cd_produto\r\n" + "        INNER JOIN\r\n"
				+ "    cd_produto_empresa ON cd_produto.cod_produto = cd_produto_empresa.cod_produto\r\n" + "WHERE\r\n"
				+ "    cd_produto_empresa.cod_empresa = 1\r\n" + "        AND cd_produto_empresa.situacao = 1\r\n"
				+ "        AND cd_produto_empresa.cod_produto NOT LIKE 'HC%'\r\n"
				+ "        AND cd_produto_empresa.cod_produto NOT LIKE 'HP%'\r\n" + "GROUP BY desc_comercial\r\n"
				+ "HAVING COUNT(*) > 1;";

		Connection conn = null;
		PreparedStatement mySt = null;
		ResultSet rs = null;

		try {

			conn = DBConnFactory.getDBConnUnoSingleton();
			mySt = conn.prepareStatement(mySQLQuery);
			rs = mySt.executeQuery();

			while (rs.next()) {

				listOfProducts.add(new ProductBean(null, rs.getString("cod_produto"), rs.getString("desc_comercial"),
						null, null, rs.getString("count"), null, null, null, null, null, null, null, null, null));

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

		return listOfProducts;
	}

}

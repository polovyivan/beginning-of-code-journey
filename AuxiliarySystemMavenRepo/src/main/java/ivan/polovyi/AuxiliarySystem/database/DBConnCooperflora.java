package ivan.polovyi.AuxiliarySystem.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ivan.polovyi.AuxiliarySystem.model.utilities.beans.ProductBean;
import ivan.polovyi.AuxiliarySystem.view.ViewFactory;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DBConnCooperflora {

	private static ObservableList<ProductBean> productsListReturn = FXCollections.observableArrayList();

	public ObservableList<ProductBean> executeQuery(ObservableList<ProductBean> productsListInput) throws SQLException {

		String mySQLQuery = "SELECT  cadprodutos.codprod,   itensamarrados.codprodamarrado, cadprodutos.descricao, itensamarrados.forn_id FROM cadprodutos INNER JOIN itensamarrados ON cadprodutos.id = itensamarrados.codprodid where itensamarrados.forn_id = 18 and itensamarrados.codprodamarrado = ?";

		for (ProductBean productBean : productsListInput) {
			int i = 0;
			i++;
			Connection conn = null;
			PreparedStatement mySt = null;
			ResultSet rs = null;

			try {

				conn = DBConnFactory.getDBConnHBLOSingleton();

				mySt = conn.prepareStatement(mySQLQuery);

				mySt.setString(1, productBean.getProductSupplierCode());

				rs = mySt.executeQuery();
				if (!rs.isBeforeFirst()) {

					productBean.setProductStatus(new SimpleStringProperty("sem cadastro"));

					productsListReturn.add(productBean);

				}

				while (rs.next()) {

					String convertedProductNumber = rs.getString("codprod");

					productBean.setProductHBLOCode(new SimpleStringProperty(convertedProductNumber));

					productsListReturn.add(productBean);
				}

			} catch (SQLException e) {
				e.printStackTrace();
				ViewFactory error = new ViewFactory();
				error.getErrorMess("DBConnCooperflora class_ " + e.toString());

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
					error.getErrorMess("DBConnCooperflora class_ " + sqlee.toString());

				}

			}

		}

		return productsListReturn;
	}

}

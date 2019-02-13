package ivan.polovyi.AuxiliarySystem.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ivan.polovyi.AuxiliarySystem.model.utilities.beans.ProductBeanXML;
import ivan.polovyi.AuxiliarySystem.view.ViewFactory;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;

public class DBConnXML {

	public ObservableList<ProductBeanXML> executeQuery(ObservableList<ProductBeanXML> productsListInput,
			String supplierCNPJ) throws SQLException {

		String convertedProductNumber = "";

		String mySQLQuery1 = "SELECT \r\n" + "    cd_produto_fornecedor.cod_produto\r\n" + "FROM\r\n"
				+ "    cd_fornecedor\r\n" + "        INNER JOIN\r\n"
				+ "    cd_produto_fornecedor ON cd_fornecedor.cod_fornecedor = cd_produto_fornecedor.cod_fornecedor  \r\n"
				+ "        INNER JOIN\r\n"
				+ "    cd_produto_empresa ON cd_produto_fornecedor.cod_produto = cd_produto_empresa.cod_produto\r\n"
				+ " WHERE\r\n" + "    cd_fornecedor.cnpj = ?\r\n"
				+ "        AND cd_produto_fornecedor.cod_produto_fornec = ?\r\n"
				+ "       AND cd_produto_empresa.situacao = 1\r\n" + "        AND cd_produto_empresa.cod_empresa = 1";

		String mySQLQuery2 = "SELECT cod_produto_fornec FROM cd_produto_fornecedor WHERE cod_produto = ? AND cod_fornecedor = 5727";

		for (ProductBeanXML productXML : productsListInput) {
			int i = 0;
			i++;
			Connection conn = null;
			PreparedStatement mySt = null;
			ResultSet rs = null;

			try {

				conn = DBConnFactory.getDBConnUnoSingleton();

				mySt = conn.prepareStatement(mySQLQuery1);

				mySt.setString(1, supplierCNPJ);
				mySt.setString(2, productXML.getProductSupplierCode());

				rs = mySt.executeQuery();
				if (!rs.isBeforeFirst()) {

					productXML.setProductStatus(new SimpleStringProperty("sem cadastro"));
					productXML.setProductHBLOCode(new SimpleStringProperty(
							productXML.getProductSupplierCode() + "-" + productXML.getProductName()));

				} else {

					while (rs.next()) {

						convertedProductNumber = rs.getString("cod_produto");

					}

					mySt = conn.prepareStatement(mySQLQuery2);

					mySt.setString(1, convertedProductNumber);
					rs = mySt.executeQuery();
					if (!rs.isBeforeFirst()) {

						productXML.setProductStatus(new SimpleStringProperty("sem amrra��o com cod do FreshPortal"));
						productXML.setProductHBLOCode(new SimpleStringProperty(
								productXML.getProductSupplierCode() + "-" + productXML.getProductName()));
					}

					while (rs.next()) {

						convertedProductNumber = rs.getString("cod_produto_fornec");

						productXML.setProductHBLOCode(new SimpleStringProperty(convertedProductNumber));

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

		}

		return productsListInput;
	}

}

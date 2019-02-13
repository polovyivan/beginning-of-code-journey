package ivan.polovyi.AuxiliarySystem.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ivan.polovyi.AuxiliarySystem.model.utilities.beans.ProductBeanXML;
import ivan.polovyi.AuxiliarySystem.view.ViewFactory;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;

public class DBConnXMLACC {

	public ObservableList<ProductBeanXML> executeQuery(ObservableList<ProductBeanXML> productsListInput,
			String supplierCNPJ) throws SQLException {

		String convertedProductNumber = "";
		String productUnit = "";
		String mySQLQuery1 = "SELECT cd_produto_unidade.un, cd_produto_empresa.cod_produto FROM cd_fornecedor INNER JOIN cd_produto_fornecedor ON cd_fornecedor.cod_fornecedor = cd_produto_fornecedor.cod_fornecedor INNER JOIN cd_produto_empresa ON cd_produto_empresa.cod_produto = cd_produto_fornecedor.cod_produto LEFT JOIN cd_produto_unidade ON cd_produto_empresa.cod_produto = cd_produto_unidade.cod_produto WHERE cd_fornecedor.cnpj = ? AND cd_produto_fornecedor.cod_produto_fornec = ? AND cd_produto_empresa.cod_empresa = 1 AND cd_produto_empresa.situacao = 1 GROUP BY cd_produto_empresa.cod_produto";

		String mySQLQuery2 = "SELECT desc_comercial, cod_produto FROM cd_produto WHERE desc_comercial LIKE ?";

		System.out.println(mySQLQuery1);

		for (ProductBeanXML productBeanAcc : productsListInput) {
			int i = 0;
			i++;
			Connection conn = null;
			PreparedStatement mySt = null;
			PreparedStatement mySt2 = null;
			ResultSet rs = null;
			ResultSet rs2 = null;
			try {

				conn = DBConnFactory.getDBConnUnoSingleton();

				mySt = conn.prepareStatement(mySQLQuery1);

				mySt.setString(1, supplierCNPJ);
				mySt.setString(2, productBeanAcc.getProductSupplierCode());

				rs = mySt.executeQuery();
				if (!rs.isBeforeFirst()) {

					productBeanAcc.setProductStatus(new SimpleStringProperty("sem cadastro"));
					productBeanAcc.setProductHBLOCode(new SimpleStringProperty(
							productBeanAcc.getProductSupplierCode() + "-" + productBeanAcc.getProductName()));
					mySt2 = conn.prepareStatement(mySQLQuery2);
					mySt2.setString(1, productBeanAcc.getProductName());

					rs2 = mySt2.executeQuery();
					if (rs2.next()) {

						ArrayList<String> recordData = new ArrayList<String>();
						recordData.add(rs2.getString("desc_comercial") + " // " + rs2.getString("cod_produto"));
						StringBuilder sb = new StringBuilder();
						for (String s : recordData) {

							sb.append(s);
							sb.append("\t");
						}
						productBeanAcc.setComment(new SimpleStringProperty(sb.toString()));

					}

				} else {

					while (rs.next()) {

						convertedProductNumber = rs.getString("cod_produto");
						productUnit = rs.getString("un");

						productBeanAcc.setProductHBLOCode(new SimpleStringProperty(convertedProductNumber));

						productBeanAcc.setUnit(new SimpleStringProperty(productUnit));

					}
				}

			} catch (SQLException e) {
				e.printStackTrace();
				ViewFactory error = new ViewFactory();
				error.getErrorMess("DBConnXMLAC class_ " + e.toString());
			} finally {

				try {

					if (rs != null) {
						rs.close();
					}
					if (rs2 != null) {
						rs2.close();
					}
					if (mySt != null) {
						mySt.close();
					}
					if (mySt2 != null) {
						mySt2.close();
					}
					if (conn != null) {
						conn.close();
					}
				} catch (SQLException sqlee) {
					sqlee.printStackTrace();

					ViewFactory error = new ViewFactory();
					error.getErrorMess("DBConnXMLAC class_ " + sqlee.toString());
				}

			}

		}

		return productsListInput;
	}

}

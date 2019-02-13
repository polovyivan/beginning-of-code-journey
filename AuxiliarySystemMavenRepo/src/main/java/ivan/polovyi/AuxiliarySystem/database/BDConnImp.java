package ivan.polovyi.AuxiliarySystem.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ivan.polovyi.AuxiliarySystem.model.utilities.beans.BillBean;
import ivan.polovyi.AuxiliarySystem.model.utilities.beans.ProductBeanXML;
import ivan.polovyi.AuxiliarySystem.view.ViewFactory;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;

public class BDConnImp {

	public String getSupplierCod(BillBean bill) {
		String supplierCode = null;
		String mySQLQuery = "select cod_fornecedor from cd_fornecedor where razao_social like ?";

		Connection conn = null;
		PreparedStatement mySt = null;
		ResultSet rs = null;
		try {

			conn = DBConnFactory.getDBConnUnoSingleton();

			mySt = conn.prepareStatement(mySQLQuery);

			mySt.setString(1, "%" + bill.getBillDest() + "%");

			rs = mySt.executeQuery();

			if (!rs.isBeforeFirst()) {

				bill.setSupplierCNPJ(new SimpleStringProperty("sem cadastro"));
			}

			else {
				while (rs.next()) {
					supplierCode = rs.getString("cod_fornecedor");

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
		return supplierCode;
	}

	public ObservableList<ProductBeanXML> executeQuery(ObservableList<ProductBeanXML> productsListInput) {

		String mySQLQuery = "SELECT cd_produto_fornecedor.cod_produto_fornec FROM cd_produto INNER JOIN cd_produto_fornecedor ON cd_produto.cod_produto = cd_produto_fornecedor.cod_produto INNER JOIN cd_produto_empresa ON cd_produto.cod_produto = cd_produto_empresa.cod_produto WHERE cd_produto_fornecedor.cod_fornecedor = '5727' AND cd_produto_empresa.situacao = 1 and cd_produto.cod_empresa = 1 AND cd_produto.cod_produto = ? group by cd_produto_fornecedor.cod_produto_fornec";
		for (ProductBeanXML productBeanXML : productsListInput) {

			if (productBeanXML.getProductSupplierCode().startsWith("H")) {
				Connection conn = null;
				PreparedStatement mySt = null;
				ResultSet rs = null;
				try {

					conn = DBConnFactory.getDBConnUnoSingleton();

					mySt = conn.prepareStatement(mySQLQuery);

					mySt.setString(1, productBeanXML.getProductSupplierCode());

					rs = mySt.executeQuery();

					if (!rs.isBeforeFirst()) {

						productBeanXML.setProductStatus(new SimpleStringProperty("sem cadastro"));

					}

					else {
						while (rs.next()) {

							productBeanXML
									.setProductHBLOCode(new SimpleStringProperty(rs.getString("cod_produto_fornec")));

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
			} else {

				productBeanXML.setProductHBLOCode(new SimpleStringProperty(productBeanXML.getProductSupplierCode()));

			}
		}
		return productsListInput;
	}

}

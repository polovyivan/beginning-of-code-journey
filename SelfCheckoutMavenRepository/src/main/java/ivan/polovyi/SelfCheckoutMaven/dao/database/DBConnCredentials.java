package ivan.polovyi.SelfCheckoutMaven.dao.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ivan.polovyi.SelfCheckoutMaven.beanclasses.CustomerBean;

public class DBConnCredentials {

	private static CustomerBean customer;

	public DBConnCredentials(CustomerBean customer) {
		DBConnCredentials.customer = customer;
	}

	public CustomerBean executeQueryFetchData() throws SQLException {

		String mySQLQuery = "SELECT * FROM selfcheckout WHERE barcode_key = ?";

		Connection conn = null;
		PreparedStatement mySt = null;
		ResultSet rs = null;

		try {

			conn = DBConnFactory.getDBConnHBLOSingleton();
			mySt = conn.prepareStatement(mySQLQuery);
			mySt.setString(1, customer.getBarcodeKey());
			rs = mySt.executeQuery();
			System.out.println(mySt);
			while (rs.next()) {
				
				
				customer.setCredentialsEnscripted(rs.getString("credentials_enscripted"));
			
			System.out.println(customer.getCredentialsEnscripted());
			}

		} catch (SQLException e) {
			e.printStackTrace();

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

			}

		}

		return customer;
	}

	public void executeQueryUpdateData() throws SQLException {

		String mySQLQuery = "INSERT INTO selfcheckout(ws_username,barcode_key,credentials_enscripted) VALUES (?,?,?) ON DUPLICATE KEY UPDATE barcode_key = ?, credentials_enscripted = ?";

		Connection conn = null;
		PreparedStatement mySt = null;
		ResultSet rs = null;

		try {

			conn = DBConnFactory.getDBConnHBLOSingleton();
			mySt = conn.prepareStatement(mySQLQuery);

			mySt.setString(1, customer.getWsUserName());
			mySt.setString(2, customer.getBarcodeKey());
			mySt.setString(3, customer.getCredentialsEnscripted());
			mySt.setString(4, customer.getBarcodeKey());
			mySt.setString(5, customer.getCredentialsEnscripted());
			mySt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();

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

			}

		}

	}

	public static CustomerBean getCustomer() {
		return customer;
	}

	public static void setCustomer(CustomerBean customer) {
		DBConnCredentials.customer = customer;
	}

}

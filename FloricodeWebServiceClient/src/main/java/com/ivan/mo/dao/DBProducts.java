package com.ivan.mo.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ivan.mo.Product;

public class DBProducts {

	public Product executeQueryFetchData(String tradeLineItemId) throws SQLException {
		Product product = null;
		ArrayList<String> latestOrderDateTimes = new ArrayList<String>();
		String mySQLQuery = "select * from mo_products_delivery_date inner join mo_products on mo_products.tradeLineItemId = mo_products_delivery_date.traid_Line_Item_Id where mo_products.tradeLineItemId = ?";

		Connection conn = null;
		PreparedStatement mySt = null;
		ResultSet rs = null;

		try {

			conn = DBConnFactory.getDBConnLocalSingleton();
			mySt = conn.prepareStatement(mySQLQuery);
			mySt.setString(1, tradeLineItemId);
			rs = mySt.executeQuery();

			while (rs.next()) {
				latestOrderDateTimes.add(0, rs.getString("delivery_date_and_time1"));
				latestOrderDateTimes.add(1, rs.getString("delivery_date_and_time2"));
				latestOrderDateTimes.add(2, rs.getString("delivery_date_and_time3"));
				latestOrderDateTimes.add(3, rs.getString("delivery_date_and_time4"));
				latestOrderDateTimes.add(4, rs.getString("delivery_date_and_time5"));
				latestOrderDateTimes.add(5, rs.getString("delivery_date_and_time6"));
				latestOrderDateTimes.add(6, rs.getString("delivery_date_and_time7"));
				latestOrderDateTimes.add(7, rs.getString("delivery_date_and_time8"));
				latestOrderDateTimes.add(8, rs.getString("delivery_date_and_time9"));
				latestOrderDateTimes.add(9, rs.getString("delivery_date_and_time10"));
				latestOrderDateTimes.add(10, rs.getString("delivery_date_and_time11"));
				latestOrderDateTimes.add(11, rs.getString("delivery_date_and_time12"));
				latestOrderDateTimes.add(12, rs.getString("delivery_date_and_time13"));
				latestOrderDateTimes.add(13, rs.getString("delivery_date_and_time14"));
				latestOrderDateTimes.add(14, rs.getString("delivery_date_and_time15"));

				product = new Product(tradeLineItemId, rs.getString("referencedDocumentIssuerAssignedID"),
						rs.getString("uriidURI"), null, rs.getString("productNumber"), rs.getString("productGroupID"),
						rs.getString("s1"), rs.getString("s1Value"), rs.getString("s2"), rs.getString("s2Value"),
						rs.getString("s3"), rs.getString("s3Value"), rs.getString("s4"), rs.getString("s4Value"),
						rs.getString("manufacturerPartyPrimaryID"), rs.getString("manufacturerPartyName"),
						new BigDecimal(rs.getString("elementQuantityNumber")),
						new BigDecimal(rs.getString("chargeAmountValue")),
						new BigDecimal(rs.getString("bQuantityValue")), new BigDecimal(rs.getString("mQuantityValue")),
						rs.getString("schemeAgencyNamePP1"), rs.getString("valuePP2"), rs.getString("listIDPP3"),
						rs.getString("listAgencyNamePP4"), rs.getString("valuePP5"), rs.getString("unitCodePP6"),
						new BigDecimal(rs.getString("valuePP7")), rs.getString("unitCodePP8"),
						new BigDecimal(rs.getString("valuePP9")), rs.getString("listIDPP10"),
						rs.getString("listAgencyNameP11"), rs.getString("valuePP12"), rs.getString("unitCodePP13"),
						new BigDecimal(rs.getString("valuePP14")), rs.getString("unitCodePP15"),
						new BigDecimal(rs.getString("valuePP16")), rs.getString("listIDPP17"),
						rs.getString("listAgencyName18"), rs.getString("valuePP19"), rs.getString("unitCode20"),
						new BigDecimal(rs.getString("value21")), rs.getString("unitCode22"),
						new BigDecimal(rs.getString("value23")), latestOrderDateTimes);

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

		return product;
	}

	public void executeQueryUpdateData(List<Product> products) throws SQLException {

		String mySQLQuery = "INSERT INTO mo_products(tradeLineItemId, referencedDocumentIssuerAssignedID, uriidURI, productNumber, productGroupID, s1, s1Value, s2, s2Value, s3, s3Value, s4, s4Value, manufacturerPartyPrimaryID, manufacturerPartyName, elementQuantityNumber, chargeAmountValue, bQuantityValue, mQuantityValue, schemeAgencyNamePP1, valuePP2, listIDPP3, listAgencyNamePP4, valuePP5, unitCodePP6, valuePP7 , unitCodePP8, valuePP9 , listIDPP10, listAgencyNameP11, valuePP12, unitCodePP13, valuePP14,  unitCodePP15, valuePP16, listIDPP17,  listAgencyName18,  valuePP19, unitCode20, value21, unitCode22, value23   \r\n"
				+ ") VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ";

		String mySQLQuery2 = "INSERT INTO mo_products_delivery_date(traid_Line_Item_Id, delivery_date_and_time1, delivery_date_and_time2, delivery_date_and_time3, delivery_date_and_time4, delivery_date_and_time5, delivery_date_and_time6, delivery_date_and_time7, delivery_date_and_time8, delivery_date_and_time9, delivery_date_and_time10, delivery_date_and_time11, delivery_date_and_time12, delivery_date_and_time13, delivery_date_and_time14, delivery_date_and_time15 \r\n"
				+ ") VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ";

		Connection conn = null;
		PreparedStatement mySt = null;
		PreparedStatement mySt2 = null;
		ResultSet rs = null;

		try {

			conn = DBConnFactory.getDBConnLocalSingleton();
			conn.setAutoCommit(false);
			mySt = conn.prepareStatement(mySQLQuery);

			for (Product product : products) {

				mySt.setString(1, product.getTradeLineItemId());
				mySt.setString(2, product.getReferencedDocumentIssuerAssignedID());
				mySt.setString(3, product.getUriidURI());
				mySt.setString(4, product.getProductNumber());
				mySt.setString(5, product.getProductGroupID());
				mySt.setString(6, product.getS1());
				mySt.setString(7, product.getS1Value());
				mySt.setString(8, product.getS2());
				mySt.setString(9, product.getS2Value());
				mySt.setString(10, product.getS3());
				mySt.setString(11, product.getS3Value());
				mySt.setString(12, product.getS4());
				mySt.setString(13, product.getS4Value());
				mySt.setString(14, product.getManufacturerPartyPrimaryID());
				mySt.setString(15, product.getManufacturerPartyName());
				mySt.setString(16, product.getElementQuantityNumber().toString());
				mySt.setString(17, product.getChargeAmountValue().toString());
				mySt.setString(18, product.getbQuantityValue().toString());
				mySt.setString(19, product.getmQuantityValue().toString());
				mySt.setString(20, product.getSchemeAgencyNamePP1());
				mySt.setString(21, product.getValuePP2());
				mySt.setString(22, product.getListIDPP3());
				mySt.setString(23, product.getListAgencyNamePP4());
				mySt.setString(24, product.getValuePP5());
				mySt.setString(25, product.getUnitCodePP6());
				mySt.setString(26, product.getValuePP7().toString());
				mySt.setString(27, product.getUnitCodePP8());
				mySt.setString(28, product.getValuePP9().toString());
				mySt.setString(29, product.getListIDPP10());
				mySt.setString(30, product.getListAgencyNameP11());
				mySt.setString(31, product.getValuePP12());
				mySt.setString(32, product.getUnitCodePP13());
				mySt.setString(33, product.getValuePP14().toString());
				mySt.setString(34, product.getUnitCodePP15());
				mySt.setString(35, product.getValuePP16().toString());
				mySt.setString(36, product.getListIDPP17());
				mySt.setString(37, product.getListAgencyName18());
				mySt.setString(38, product.getValuePP19());
				mySt.setString(39, product.getUnitCode20());
				mySt.setString(40, product.getValue21().toString());
				mySt.setString(41, product.getUnitCode22());
				mySt.setString(42, product.getValue23().toString());

				mySt.executeUpdate();

				mySt2 = conn.prepareStatement(mySQLQuery2);

				ArrayList<String> latestOrderDateTimes = product.getLatestOrderDateTime();
				int arraySize = latestOrderDateTimes.size();
				// fill up ArrayList if it has less than 15 items
				if (arraySize < 15) {

					for (int i = arraySize; i < 15; i++) {
						latestOrderDateTimes.add(i, "0000-00-00T 00:00:00-3:00");

					}

				}

				mySt2.setString(1, product.getTradeLineItemId());

				int y = 2;
				for (int i = 0; i < latestOrderDateTimes.size(); i++) {

					mySt2.setString(y++, latestOrderDateTimes.get(i));
					if (i == 14) {
						break;
					}
				}
				mySt2.executeUpdate();
			}
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();

		}

		finally {

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

}

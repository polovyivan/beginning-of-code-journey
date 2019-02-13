//Granflora

package ivan.polovyi.AuxiliarySystem.controllers;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import ivan.polovyi.AuxiliarySystem.database.DBConnDuplicates;
import ivan.polovyi.AuxiliarySystem.model.utilities.beans.ProductBean;
import ivan.polovyi.AuxiliarySystem.view.ViewFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

public class DuplicatesController implements Initializable {
	@FXML
	private Label lblMain;
	@FXML
	private AnchorPane apDuplicates;

	@FXML
	private TableView<ProductBean> tVDuplicates;

	@FXML
	private TableColumn<ProductBean, String> productCodeColumn;

	@FXML
	private TableColumn<ProductBean, String> productNameColumn;

	@FXML
	private TableColumn<ProductBean, String> productQty;

	@FXML
	private Button returnButton;

	@FXML
	void returnToMain(ActionEvent event) {
		ViewFactory viewFactory = new ViewFactory();
		viewFactory.getMainScene();
		returnButton.getScene().getWindow().hide();
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		ObservableList<ProductBean> listOfProducts = FXCollections.observableArrayList();
		DBConnDuplicates dbconn = new DBConnDuplicates();
		try {
			listOfProducts = dbconn.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		productCodeColumn.setCellValueFactory(new PropertyValueFactory<ProductBean, String>("productHBLOCode"));
		productNameColumn.setCellValueFactory(new PropertyValueFactory<ProductBean, String>("productName"));
		productQty.setCellValueFactory(new PropertyValueFactory<ProductBean, String>("boxQuantity"));

		tVDuplicates.setItems(listOfProducts);
	}

}

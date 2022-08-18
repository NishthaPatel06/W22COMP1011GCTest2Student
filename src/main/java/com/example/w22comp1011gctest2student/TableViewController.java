//Name : Nishtha Patel
//Student Number: 200474598
package com.example.w22comp1011gctest2student;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class TableViewController implements Initializable {
    @FXML
    private Label saleLabel;

    @FXML
    private Label msrpLabel;

    @FXML
    private Label savingsLabel;

    @FXML
    private Label rowsInTableLabel;

    @FXML
    private TableView<Customer> tableView;

    @FXML
    private TableColumn<Customer, Integer> idColumn;

    @FXML
    private TableColumn<Customer, String> firstNameColumn;

    @FXML
    private TableColumn<Customer, String> lastNameColumn;

    @FXML
    private TableColumn<Customer, String> phoneColumn;

    @FXML
    private TableColumn<Customer, String> totalPurchaseColumn;

    @FXML
    private ListView<Product> purchaseListView;

    @FXML
    private ImageView imageView;
    private CustomerArraylists Utility;

    @FXML
    private void top10Customers()
    {
        System.out.println("called method top10Customers()");
    }

    @FXML
    private void customersSavedOver5()
    {
        System.out.println("called method customersSavedOver5()");
    }

    @FXML
    private void loadAllCustomers()
    {
        System.out.println("called method loadAllCustomers");
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        Customer customer = new Customer();

        idColumn.setCellValueFactory(new PropertyValueFactory<>(String.valueOf(customer.getId())));
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<>(customer.getFirstName()));
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<>(customer.getLastName()));
        phoneColumn.setCellValueFactory(new PropertyValueFactory<>(customer.getPhoneNumber()));
        tableView.getItems().addAll(Utility.getCustomersFromJSONFile("customers.json"));
        rowsInTableLabel.setText("Rows in table: " + String.valueOf(tableView.getItems().size()));

//a listener added to the tableview object such that if a customer is selected, will put all of their
// purchases in the purchaseListView.
        purchaseListView.setOnMouseClicked(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent click) {

                if (click.getClickCount() == 2) {
                    //Use purchaseListView's getSelected Item
                    Product currentItemSelected = purchaseListView.getSelectionModel()
                            .getSelectedItem();
                }
            }
        });
    }
    }


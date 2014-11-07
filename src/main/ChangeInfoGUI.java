package main;

import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ChangeInfoGUI {

	@FXML
	private TextField username; // = Account.getUsername();
	private TextField paymentCard;
	private Label errorUsername;
	private Label errorPassword;
	private Label errorPayment;

	public ChangeInfoGUI() {

	}

	// Update account information
	public void account(ActionEvent event) {
		// this.errorUsername.setText("Rejected!");
		System.out.println("Update Processed"); // check method works
	}

	// Update Payment information
	public void payment(ActionEvent event) {
		// Account.setCreditCardInfo();
		System.out.println("Payment Processed"); // check method works
	}

	
}
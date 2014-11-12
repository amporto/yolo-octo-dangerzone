package main;

import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * 
 * @author Brandon Bielefeld
 * 
 *         This class is a controller class for the ChangeInfoGUI with its
 *         action listeners.
 */
public class ChangeInfoGUI {

	@FXML
	private TextField username; // = Account.getUsername();
	private TextField paymentCard;
	private Label errorUsername;
	private Label errorPassword;
	private Label errorPayment;

	public ChangeInfoGUI() {

	}

	/**
	 * 
	 * @param event
	 *            this listens for a mouse button click that processes account
	 *            information and updates the login database.
	 */
	// Update account information
	public void account(ActionEvent event) {
		// this.errorUsername.setText("Rejected!");
		System.out.println("Update Processed"); // check method works
	}

	/**
	 * 
	 * @param event
	 *            this listens for a mouse click of enter button and saves
	 *            updated payment information within a database.
	 */
	// Update Payment information
	public void payment(ActionEvent event) {
		// Account.setCreditCardInfo();
		System.out.println("Payment Processed"); // check method works
	}

}
package main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

/**
 * @author Brandon Bielefeld
 * @version 1.0
 * @created 12-Oct-2014 7:46:06 PM
 */
public class SeatingLayoutGUI {

	@FXML
	// change visibility
	public void visible(ActionEvent event) {
		// this.errorUsername.setText("Rejected!");
		System.out.println("visible Processed"); // check method works
	}

	// Update Payment information
	public void payment(ActionEvent event) {
		// Account.setCreditCardInfo();
		System.out.println("Payment Processed"); // check method works
	}

}
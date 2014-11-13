package main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

/**
 * @author Brandon Bielefeld
 * 
 * 
 * 
 *         This class is a controller class for the SeatingLayoutGUI with its
 *         action listeners.
 */

public class SeatingLayoutGUI {

	/**
	 * 
	 * @param event
	 *            this listens for the AI and sets seating available or not
	 *            available
	 */
	@FXML
	// change visibility
	public void visible(ActionEvent event) {
		// this.errorUsername.setText("Rejected!");
		System.out.println("visible Processed"); // check method works
	}

	/**
	 * 
	 * @param event
	 *            this listner changes the time viewed on the sating layout tab
	 */
	// Update Payment information
	public void time(ActionEvent event) {
		// Account.setCreditCardInfo();
		System.out.println("time Processed"); // check method works
	}

}
package main;

import java.io.IOException;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javax.swing.*;


public class ChangeInfoGUI extends JFXPanel {

	@FXML
	private TextField username; // = Account.getUsername();
	private TextField paymentCard;
	private Label errorUsername;
	private Label errorPassword;
	private Label errorPayment;
	

	public ChangeInfoGUI(){
		

		Platform.runLater(new Runnable() {
			@Override
			public void run() {

				try {
					Parent changeRoot = FXMLLoader.load(getClass().getResource(
							"C:\\Users\\spaceman\\workspace\\Starbucks\\src\\fxml\\ChangeInfoGUI.fxml"));
					setScene(new Scene(changeRoot));

				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		});


//		setTitle("Tabbed Pane");
//		JTabbedPane jtp = new JTabbedPane();
//		getContentPane().add(jtp);
//		jtp.addTab("Account", panelChangeInfo);
//		jtp.addTab("Profits", panelProfits);
//		jtp.addTab("Seating", panelSeatingLayout);

		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(450, 850);
		this.setVisible(true);
		//this.setResizable(false);
	}
	
	// Update account information
	public void account(ActionEvent event) {
		//this.errorUsername.setText("Rejected!");
		System.out.println("Update Processed"); // check method works
	}

	// Update Payment information
	public void payment(ActionEvent event) {
		// Account.setCreditCardInfo();
		System.out.println("Payment Processed"); // check method works
	}
	
	public void finalize() throws Throwable {

	}

}
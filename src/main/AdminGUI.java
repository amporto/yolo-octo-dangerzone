package main;

import java.io.IOException;

import javax.swing.JFrame;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author Alex Procaccini
 * @version 1.0
 * @created 12-Oct-2014 7:46:01 PM
 *
 *          This is the GUI for the administrator. Everything they need will be
 *          here.
 */
public class AdminGUI extends JFXPanel {

	/**
	 * Instantiate new scenes of each interface that will be added to a panel on
	 * each tab
	 */

	public AdminGUI() {
		Platform.runLater(() -> {
			try {
				this.setScene(new Scene(FXMLLoader.load(getClass().getResource(
						"/fxml/AdminGUI.fxml"))));
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
	}

	public static void main(String[] args) {

		JFrame frame = new JFrame("Login");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new AdminGUI());
		frame.setSize(450, 800);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
	}
}

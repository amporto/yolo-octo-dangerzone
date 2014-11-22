package main;

import java.io.IOException;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;

import main.LoginGUI.LoginPane;
import jxl.read.biff.BiffException;

/**
 * 
 * @author Brandon Bielefeld
 * 
 *         This class is a Test class for the first sprint that integrates my
 *         interfaces within the tabs of the java swing frame that Alex has
 *         created.
 * 
 */

public class UserGUI extends JFXPanel {

	/**
	 * Instantiate new scenes of each interface that will be added to a panel on
	 * each tab
	 */

	public UserGUI() {
		Platform.runLater(() -> {
			try {
				this.setScene(new Scene(FXMLLoader.load(getClass().getResource(
						"/fxml/UserGUI.fxml"))));
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
	}

	public static void main(String[] args) {

		JFrame frame = new JFrame("Login");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new UserGUI());
		frame.setSize(450, 800);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
	}
}

package main;

import java.io.IOException;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;

/**
 * 
 * @author Brandon Bielefeld
 * 
 *         This class is a Test class for the first sprint that integrates my
 *         interfaces within the tabs of the java swing frame that Alex has
 *         created.
 * 
 */

public class FXInSwing extends JFrame {

	/**
	 * Instantiate new scenes of each interface that will be added to a panel on
	 * each tab
	 */

	JFXPanel panelChangeInfo;
	JFXPanel panelProfits;
	JFXPanel panelSeatingLayout;

	Scene sceneChange;
	Scene sceneProfits;
	Scene sceneSeating;

	public FXInSwing() {

		panelChangeInfo = new JFXPanel();
		panelProfits = new JFXPanel();
		panelSeatingLayout = new JFXPanel();
		ChangeInfoGUI changeSet = new ChangeInfoGUI();
		MenuGUI orderMenu = new MenuGUI();

		Platform.runLater(() -> {

			try {

				panelChangeInfo.setScene(sceneChange = new Scene(FXMLLoader
						.load(getClass()
								.getResource("/fxml/ChangeInfoGUI.fxml"))));

			} catch (IOException e) {
				e.printStackTrace();
			}

		});

		Platform.runLater(new Runnable() {
			@Override
			public void run() {

				try {

					panelProfits.setScene(sceneProfits = new Scene(FXMLLoader
							.load(getClass().getResource(
									"/fxml/ProfitsGUI.fxml"))));

				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		});

		Platform.runLater(new Runnable() {
			@Override
			public void run() {

				try {

					panelSeatingLayout.setScene(sceneSeating = new Scene(
							FXMLLoader.load(getClass().getResource(
									"/fxml/SeatingLayoutGUI.fxml"))));

				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		});

		setTitle("Tabbed Pane");
		JTabbedPane jtp = new JTabbedPane();
		getContentPane().add(jtp);
		jtp.addTab("Menu", orderMenu);
		jtp.addTab("Account", panelChangeInfo);
		jtp.addTab("Profits", panelProfits);
		jtp.addTab("Seating", panelSeatingLayout);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(450, 800);
		this.setVisible(true);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new FXInSwing();
			}
		});
	}
}

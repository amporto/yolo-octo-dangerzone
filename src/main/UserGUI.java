package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;




/**
 * @author Alex Procaccini
 * @version 1.0
 * @created 12-Oct-2014 7:46:01 PM
 * 
 * This is the GUI for the customer. Everything they need will be here.
 */
public class UserGUI extends Application{
	
	/**
	 * Constructor for the user GUI
	 */
	public static void main(String[] args) {
		launch(args);
	}

	/**
	 * This creates the main interface for the user
	 * 
	 * @param primaryStage
	 * @throws Exception
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {

		primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource(
				"/fxml/UserGUI.fxml"))));
		primaryStage.setTitle("User interface");
		primaryStage.show();
		primaryStage.setResizable(false);

		
	}
}

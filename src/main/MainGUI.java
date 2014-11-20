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
 *          This is the main GUI. Everything will be contained in here
 */

public class MainGUI extends Application {
	
//	public MainGUI(boolean isAdmin){
//		if (isAdmin == true)
//			startAdmin();
//			
//		
//	}

	public static void main(String[] args) {
		launch(args);
	}

	public void startUser(Stage primaryStage) throws Exception {

		primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource(
				"/fxml/UserGUI.fxml"))));
		primaryStage.setTitle("User interface");
		primaryStage.show();
		primaryStage.setResizable(false);

	}
	
	public void startAdmin(Stage primaryStage) throws Exception {

		primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource(
				"/fxml/AdminGUI.fxml"))));
		primaryStage.setTitle("Admin interface");
		primaryStage.show();
		primaryStage.setResizable(false);

	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}
}

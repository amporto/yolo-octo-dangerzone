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
<<<<<<< HEAD
	public UserGUI(){
		MenuGUI menu = new MenuGUI();
		SeatingLayoutGUI seating = new SeatingLayoutGUI();
		ChangeInfoGUI changeInfo = new ChangeInfoGUI();
		
		addTab("Order", menu);
		//addTab("Seating", seating);
		//addTab("Account", changeInfo);
		
=======
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

>>>>>>> 7eb4ea783d687b80aa6e782067629c86aede4957
		
	}
}

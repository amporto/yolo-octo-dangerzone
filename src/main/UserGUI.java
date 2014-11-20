package main;

import javax.swing.JTabbedPane;




/**
 * @author Alex Procaccini
 * @version 1.0
 * @created 12-Oct-2014 7:46:01 PM
 * 
 * This is the GUI for the customer. Everything they need will be here.
 */
public class UserGUI extends JTabbedPane{
	
	/**
	 * Constructor for the user GUI
	 */
	public UserGUI(){
		MenuGUI menu = new MenuGUI();
		SeatingLayoutGUI seating = new SeatingLayoutGUI();
		ChangeInfoGUI changeInfo = new ChangeInfoGUI();
		
		addTab("Order", menu);
		//addTab("Seating", seating);
		//addTab("Account", changeInfo);
		
		
	}
}

package main;

import javax.swing.JTabbedPane;





public class UserGUI extends JTabbedPane{
	public UserGUI(){
		MenuGUI menu = new MenuGUI();
		SeatingLayoutGUI seating = new SeatingLayoutGUI();
		ChangeInfoGUI changeInfo = new ChangeInfoGUI();
		
		addTab("Order", menu);
		addTab("Seating", seating);
		addTab("Account", changeInfo);
		
	}
}

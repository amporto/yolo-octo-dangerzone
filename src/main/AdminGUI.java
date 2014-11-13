package main;

import javax.swing.JTabbedPane;

import main.ChangeInfoGUI;
import main.InventoryGUI;
import main.ProfitsGUI;
import main.TrendsGUI;

/**
 * @author Alex Procaccini
 * @version 1.0
 * @created 12-Oct-2014 7:46:01 PM
 *
 * This is the GUI for the administrator. Everything they need will be here.
 */
public class AdminGUI extends JTabbedPane{
	
	/**
	 * Constructor for the admin GUI
	 */
	AdminGUI() {
		ProfitsGUI profitsGUI = new ProfitsGUI();
		TrendsGUI trendsGUI = new TrendsGUI();
		InventoryGUI inventoryGUI = new InventoryGUI();
		ChangeInfoGUI changeInfoGUI = new ChangeInfoGUI();

		addTab("Profits", profitsGUI);
		addTab("Trends", trendsGUI);
		addTab("Inventory", inventoryGUI);
		//addTab("Account", changeInfoGUI);
	}

}

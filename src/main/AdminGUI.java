package main;

import javax.swing.JTabbedPane;

import main.ChangeInfoGUI;
import main.InventoryGUI;
import main.ProfitsGUI;
import main.TrendsGUI;


public class AdminGUI extends JTabbedPane{
	AdminGUI() {
		ProfitsGUI profitsGUI = new ProfitsGUI();
		TrendsGUI trendsGUI = new TrendsGUI();
		InventoryGUI inventoryGUI = new InventoryGUI();
		ChangeInfoGUI changeInfoGUI = new ChangeInfoGUI();

		addTab("Profits", profitsGUI);
		addTab("Trends", trendsGUI);
		addTab("Inventory", inventoryGUI);
		addTab("Account", changeInfoGUI);
	}

}
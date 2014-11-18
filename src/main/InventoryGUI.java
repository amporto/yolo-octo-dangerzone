package main;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.io.File;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JPanel;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;



/**
 * @author JeanV
 * This class creates the GUI for the inventory as a JPanel
 */
public class InventoryGUI extends JPanel{

	public InventoryGUI() {
		
		File inventory = new File("./src/main/Inventory.xls");

		/**
		 * Reads Excel file to obtain Items / Quantities
		 */
	/*	Workbook inventoryWorkbook1 = Workbook.getWorkbook(inventory);
		Sheet sheet = inventoryWorkbook1.getSheet(0); 
		int i = 0;
		int max = sheet.getRows();
		for (i=0; i <= max ; i++){
			
	    Cell item = sheet.getCell(0, i);
	    String ITEM = item.getContents();
	    
	  //To show in GUI
	    JLabel Item = new JLabel(ITEM);
	    Cell quantity = sheet.getCell(1, i);
	   
	    */
	  //To show in GUI
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.EAST;
        gbc.insets = new Insets(2, 2, 2, 2);
        gbc.gridx = 0;
        gbc.gridy = 0;
        
        String INVENTORYHEADER = "Inventory";
        JLabel InventoryHeader = new JLabel(INVENTORYHEADER);
       
        // Will change hardcoded string value for GETTER
        String ITEM = "Frapuccino";
        JLabel Item = new JLabel(ITEM);
        
        //add(nameLabel, gbc);
		//String QUANTITY = Inventory.getItemAmount();
        
        // Will change hardcoded string value for GETTER
		String QUANTITY = "12";
	    JLabel Quantity = new JLabel(QUANTITY);
        
        add(InventoryHeader, gbc);
        gbc.gridy++; //doesn't do anything :(
        add(Item, gbc);
        gbc.gridx++;
	    add(Quantity, gbc);
	   
	    
		}
		

	
	public void finalize() throws Throwable {
	
	}
}//end InventoryGUI

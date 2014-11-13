package main;

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

	public InventoryGUI() throws BiffException, IOException{
		
File inventory = new File("./src/main/Inventory.xls");

		/**
		 * Reads Excel file to obtain Items / Quantities
		 */
		Workbook inventoryWorkbook1 = Workbook.getWorkbook(inventory);
		Sheet sheet = inventoryWorkbook1.getSheet(0); 
		int i = 0;
		int max = sheet.getRows();
		for (i=0; i <= max ; i++){
			
	    Cell item = sheet.getCell(0, i);
	    String ITEM = item.getContents();
	    
	  //To show in GUI
	    JLabel Item = new JLabel(ITEM);
	    Cell quantity = sheet.getCell(1, i);
	    String QUANTITY = quantity.getContents();
	    
	  //To show in GUI
	    JLabel Quantity = new JLabel(QUANTITY);
	    
		}
		
	}
	
	public void finalize() throws Throwable {

	}
}//end InventoryGUI

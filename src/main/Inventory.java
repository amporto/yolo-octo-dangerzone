/*
 * Course: SE300-01
 * Term: Fall 2014
 * Assignment: Starbucks Final Project
 * Author: Megan Porto
 * Date: 11/08/14
 */


package main;

import java.io.File;
import java.io.IOException;

import javax.swing.JLabel;

import jxl.Cell;
import jxl.LabelCell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

/**
 * @author Megan Porto
 * 
 * 
 * 
 *         This class will read and write to the inventory excel file and update values for 
 *         items accordingly
 */


public class Inventory {
	
	private static String item;
	private static String itemAmount;
	
	
	
	public Inventory(){
		
		
	}

	public static String getItem() {
		return item;
	}


	public static void setItem(String item) {
		Inventory.item = item;
	}
	
	
	public static String getItemAmount() {
		return itemAmount;
	}


	public static void setItemAmount(String itemAmount) {
		Inventory.itemAmount = itemAmount;
	}
	
	/**@author Jean V
	 * This method reads from excel file to obtain inventory info
	 * To be used by InventoryGUI
	 * @param Cell
	 * @return
	 * @throws BiffException
	 * @throws IOException
	 */
	
	public static String getCellContents(String Cell) throws BiffException, IOException{
		
		File inventory = new File("./src/main/Inventory.xls");
		 Workbook inventoryWorkbook1 = Workbook.getWorkbook(inventory);
	     Sheet inventorySheet = inventoryWorkbook1.getSheet(0);
	     Cell cell = inventorySheet.getCell(Cell);
	     String Contents = cell.getContents();
	     setItem(Contents);
	     
	     inventoryWorkbook1.close();
	     
	     return Contents;
		
	     
	     
	}

	
	/**
	 * @author Megan Porto
	 * @param event
	 *            This method takes in the item to be altered and the amount in which it is altered by,
	 *            then it reads the inventory file and updates the value accordingly.
	 * @throws WriteException 
	 */
	
	public static void alterItemAmount(String item, String itemAmount) throws BiffException, IOException, WriteException{
		
		File inventory = new File("./src/main/Inventory.xls");
        
        Workbook inventoryWorkbook1 = Workbook.getWorkbook(inventory);
        WritableWorkbook inventoryWorkbook = Workbook.createWorkbook(new File("./src/main/Inventory.xls"), inventoryWorkbook1);
        //WritableSheet loginSheet1=loginWorkbook.createSheet("First Sheet",0);
        String[] inventorySheetName = inventoryWorkbook.getSheetNames();
        WritableSheet inventorySheet = inventoryWorkbook.getSheet(inventorySheetName[0]);
		
        int i = 1;
        int max = 22;
		
		for (i =1; i <= max; i++){	
			
			String ACellLocation = "A"+i;
			String BCellLocation = "B"+i;
			
		    Cell acell = inventorySheet.getCell(ACellLocation);
		    String acontent = acell.getContents();
		    
		    if (acontent.equalsIgnoreCase(item)){
			
			WritableCell bcell = inventorySheet.getWritableCell(BCellLocation);
			Label c = (Label) bcell;
			c.setString(itemAmount);
			
		    }
			
		}
		
		inventoryWorkbook.write();
		inventoryWorkbook.close();
	}



}

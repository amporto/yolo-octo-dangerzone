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

import jxl.Cell;
import jxl.LabelCell;
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
	
	private String item;
	private static String itemAmount;
	
	public Inventory(){
		
		
	}
	

	public Inventory(String item, String itemAmount){
		
		this.setItem(item);
		this.setItemAmount(itemAmount);
	}


	public String getItem() {
		return item;
	}


	public void setItem(String item) {
		this.item = item;
	}
	
	
	public static String getItemAmount() {
		return itemAmount;
	}


	public void setItemAmount(String itemAmount) {
		this.itemAmount = itemAmount;
	}
	
	/**
	 * @author Megan Porto
	 * @param event
	 *            This method takes in the item to be altered and the amount in which it is altered by,
	 *            then it reads the inventory file and updates the value accordingly.
	 * @throws WriteException 
	 */
	
	public void alterItemAmount(String item, String itemAmount) throws BiffException, IOException, WriteException{
		
		File inventory=new File("./src/main/Inventory.xls");
        
        Workbook inventoryWorkbook1=Workbook.getWorkbook(inventory);
        WritableWorkbook inventoryWorkbook=Workbook.createWorkbook(new File("./src/main/Inventory.xls"), inventoryWorkbook1);
        //WritableSheet loginSheet1=loginWorkbook.createSheet("First Sheet",0);
        String[] inventorySheetName=inventoryWorkbook.getSheetNames();
        WritableSheet inventorySheet=inventoryWorkbook.getSheet(inventorySheetName[0]);
		
		
		
		if (item=="Brewed Coffee"){
			
			WritableCell cell=inventorySheet.getWritableCell("B1");
			Label c=(Label) cell;
			c.setString(itemAmount);
			
		}
		
		if (item=="Espresso"){
			
			WritableCell cell=inventorySheet.getWritableCell("B2");
			Label c=(Label) cell;
			c.setString(itemAmount);
			
		}if (item=="Nonfat Milk"){
			
			WritableCell cell=inventorySheet.getWritableCell("B3");
			Label c=(Label) cell;
			c.setString(itemAmount);
			
		}if (item=="Soymilk"){
			
			WritableCell cell=inventorySheet.getWritableCell("B4");
			Label c=(Label) cell;
			c.setString(itemAmount);
			
		}if (item=="Whole Milk"){
			
			WritableCell cell=inventorySheet.getWritableCell("B5");
			Label c=(Label) cell;
			c.setString(itemAmount);
			
		}if (item=="Whipped Creme"){
			
			WritableCell cell=inventorySheet.getWritableCell("B6");
			Label c=(Label) cell;
			c.setString(itemAmount);
			
		}if (item=="Vanilla Syrup"){
			
			WritableCell cell=inventorySheet.getWritableCell("B7");
			Label c=(Label) cell;
			c.setString(itemAmount);
			
		}if (item=="Caramel Syrup"){
			
			WritableCell cell=inventorySheet.getWritableCell("B8");
			Label c=(Label) cell;
			c.setString(itemAmount);
			
		}if (item=="Hazelnut Syrup"){
			
			WritableCell cell=inventorySheet.getWritableCell("B9");
			Label c=(Label) cell;
			c.setString(itemAmount);
			
		}if (item=="Chocolate Syrup"){
			
			WritableCell cell=inventorySheet.getWritableCell("B10");
			Label c=(Label) cell;
			c.setString(itemAmount);
			
		}if (item=="White Chocolate Syrup"){
			
			WritableCell cell=inventorySheet.getWritableCell("B11");
			Label c=(Label) cell;
			c.setString(itemAmount);
			
		}if (item=="Chai Latte Mix"){
			
			WritableCell cell=inventorySheet.getWritableCell("B12");
			Label c=(Label) cell;
			c.setString(itemAmount);
			
		}if (item=="Black Tea"){
			
			WritableCell cell=inventorySheet.getWritableCell("B13");
			Label c=(Label) cell;
			c.setString(itemAmount);
			
		}if (item=="Earl Grey"){
			
			WritableCell cell=inventorySheet.getWritableCell("B14");
			Label c=(Label) cell;
			c.setString(itemAmount);
			
		}if (item=="Zen"){
			
			WritableCell cell=inventorySheet.getWritableCell("B15");
			Label c=(Label) cell;
			c.setString(itemAmount);
			
		}if (item=="Vanilla Rooibos"){
			
			WritableCell cell=inventorySheet.getWritableCell("B16");
			Label c=(Label) cell;
			c.setString(itemAmount);
			
		}if (item=="Chocolate Cookie"){
			
			WritableCell cell=inventorySheet.getWritableCell("B17");
			Label c=(Label) cell;
			c.setString(itemAmount);
			
		}if (item=="Cranberry Scone"){
			
			WritableCell cell=inventorySheet.getWritableCell("B18");
			Label c=(Label) cell;
			c.setString(itemAmount);
			
		}if (item=="Blueberry Scone"){
			
			WritableCell cell=inventorySheet.getWritableCell("B19");
			Label c=(Label) cell;
			c.setString(itemAmount);
			
		}if (item=="Vanilla Scone"){
			
			WritableCell cell=inventorySheet.getWritableCell("B20");
			Label c=(Label) cell;
			c.setString(itemAmount);
			
		}if (item=="Blueberry Muffin"){
			
			WritableCell cell=inventorySheet.getWritableCell("B21");
			Label c=(Label) cell;
			c.setString(itemAmount);
			
		}if (item=="Brownie"){
			
			WritableCell cell=inventorySheet.getWritableCell("B22");
			Label c=(Label) cell;
			c.setString(itemAmount);
			
		}
		
		
		inventoryWorkbook.write();
		inventoryWorkbook.close();
	}



}

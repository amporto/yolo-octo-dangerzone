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

import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

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
	private double itemAmount;
	
	public Inventory(){
		
		
	}
	

	public Inventory(String item, double itemAmount){
		
		this.setItem(item);
		this.setItemAmount(itemAmount);
	}


	public String getItem() {
		return item;
	}


	public void setItem(String item) {
		this.item = item;
	}
	
	
	public double getItemAmount() {
		return itemAmount;
	}


	public void setItemAmount(double itemAmount) {
		this.itemAmount = itemAmount;
	}
	
	/**
	 * @author Megan Porto
	 * @param event
	 *            This method takes in the item to be altered and the amount in which it is altered by,
	 *            then it reads the inventory file and updates the value accordingly.
	 */
	
	public void alterItemAmount(String item, double itemAmount) throws BiffException, IOException{
		
		File inventory=new File("./src/main/Inventory.xls");
        
        Workbook inventoryWorkbook1=Workbook.getWorkbook(inventory);
        WritableWorkbook inventoryWorkbook=Workbook.createWorkbook(new File("./src/main/Inventory.xls"), inventoryWorkbook1);
        //WritableSheet loginSheet1=loginWorkbook.createSheet("First Sheet",0);
        String[] inventorySheetName=inventoryWorkbook.getSheetNames();
        WritableSheet inventorySheet=inventoryWorkbook.getSheet(inventorySheetName[0]);
		
		
		
	}



}

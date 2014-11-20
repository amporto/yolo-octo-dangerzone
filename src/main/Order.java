/*
 * Course: SE300-01
 * Term: Fall 2014
 * Assignment: Starbucks Final Project
 * Author: Megan Porto
 * Date: 11/12/14
 */

package main;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;



/**
 * @author Megan Porto  
 * @version 1.0
 * @created 11-Nov-2014 7:46:04 PM
 * 
 * This is created when the user places an order and the items are deducted accordingly
 */
public class Order {

	public Inventory m_Inventory;
	public Account m_Account;
	public MenuGUI m_MenuGUI;
	int time = 5;
	private String item;
	private String size;
	

	/**
	 * Parameter-less constructor
	 */
	public Order(){

	}
	
	/**
	 * Creates an order for the given item
	 * @param item - the item the user is ordering
	 */
	public Order(String item, String size) {
	
		this.setItem(item);
		this.setSize(size);
		
		
	}

	
	
	
	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getTime(){
		return time;
	}
	
	public void setTime(int time){
		this.time = time;
	}
	
	
	/**
	 * Performs the action of making an order for non-alterable items 
	 * @param item- the item ordered from the MenuGUI
	 * @param size- the size will be taken in as a string and converted to a double for the amount of stock left 
	 * in the inventory (i.e. tall=1, grande=1.5, venti=2)
	 * The method will use the alterItemAmount method in Inventory to deduct stock accordingly
	 */
	
	
	public void makeOrder(String item, String size) throws BiffException, IOException, WriteException{
		
		File inventory=new File("./src/main/Inventory.xls");
        
        Workbook inventoryWorkbook1=Workbook.getWorkbook(inventory);
        WritableWorkbook inventoryWorkbook=Workbook.createWorkbook(new File("./src/main/Inventory.xls"), inventoryWorkbook1);
        //WritableSheet loginSheet1=loginWorkbook.createSheet("First Sheet",0);
        String[] inventorySheetName=inventoryWorkbook.getSheetNames();
        WritableSheet inventorySheet=inventoryWorkbook.getSheet(inventorySheetName[0]);	
        
        int i;
        for (i=0; i<19; i++){
        	
        	Cell itemName = inventorySheet.getCell(0, i);
            String menuItem = itemName.getContents();
            
            if (menuItem==item){
            	
            	m_Inventory.alterItemAmount(item, size);
            	
            }
            
            
        }
        
        
	}
	
	/**
	 * Performs the action of making an order for alterable items that have milk specifications
	 * @param item  -the item ordered from the MenuGUI
	 * @param size -the size will be taken in as a string and converted to a double for the amount of stock left 
	 * @param milkType -the type of milk (soy, nonfat, whole) will altered in the inventory
	 * The method will use the alterItemAmount method in Inventory to deduct stock accordingly
	 */
	
	public void makeMixedOrder(String item, String size, String milkType) throws BiffException, IOException, WriteException{
		
		File inventory=new File("./src/main/Inventory.xls");
		        
		        Workbook menuWorkbook1=Workbook.getWorkbook(inventory);
		        WritableWorkbook menuWorkbook=Workbook.createWorkbook(new File("./src/main/Menu Items.xls"), menuWorkbook1);
		        //WritableSheet loginSheet1=loginWorkbook.createSheet("First Sheet",0);
		        String[] menuSheetName=menuWorkbook.getSheetNames();
		        WritableSheet menuSheet=menuWorkbook.getSheet(menuSheetName[0]);	
		        
		        int i;
		        for (i=0; i<12; i++){
		        	
		        	Cell itemName = menuSheet.getCell(0, i);
		            String menuItem = itemName.getContents();
		            
		            if (menuItem==item){
		            	
		            	Cell ingredientOne=menuSheet.getCell(1,i);
		            	String ingredient1=ingredientOne.getContents();
		            	Cell ingredientTwo=menuSheet.getCell(2,i);
		            	String ingredient2=ingredientTwo.getContents();
		            	
		            	if (ingredient1!=null && ingredient2!=null){
		            		
		            		m_Inventory.alterItemAmount(ingredient1, size);
		            		m_Inventory.alterItemAmount(ingredient2, size);
		            		m_Inventory.alterItemAmount(milkType, size);
		            	}
		            	
		            	if (ingredient1!=null && ingredient2==null){
		            		
		            		m_Inventory.alterItemAmount(ingredient1, size);
		            		m_Inventory.alterItemAmount(milkType, size);
		            	}
		            	
		            	if (ingredient1==null && ingredient2!=null){
		          
		            		m_Inventory.alterItemAmount(ingredient2, size);
		            		m_Inventory.alterItemAmount(milkType, size);
		            	}
		            	
		            	
		            }
		            
		            
		        }
		        
		        
			}



}//end Order

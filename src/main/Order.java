package main;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;



/**
 * @author Megan Porto & Alex Procaccini 
 * @version 1.0
 * @created 11-Nov-2014 7:46:04 PM
 * 
 * This is created when the user places an order
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
	
	public void makeOrder(String item, String size) throws BiffException, IOException{
		
File inventory=new File("./src/main/Inventory.xls");
        
        Workbook inventoryWorkbook1=Workbook.getWorkbook(inventory);
        WritableWorkbook inventoryWorkbook=Workbook.createWorkbook(new File("./src/main/Inventory.xls"), inventoryWorkbook1);
        //WritableSheet loginSheet1=loginWorkbook.createSheet("First Sheet",0);
        String[] inventorySheetName=inventoryWorkbook.getSheetNames();
        WritableSheet inventorySheet=inventoryWorkbook.getSheet(inventorySheetName[0]);	
        
	}

	/**
	 * Purchases an item 
	 * @param creditCardInfo - the user's credit card information
	 */
	public void purchaseItems(int creditCardInfo){

	}

	/**
	 * Selects the given items 
	 * @param inventory - the inventory list
	 */
	public String[] selectItems(String[] inventory){
		return null;
	}
}//end Order

package main;



/**
 * @author Alex Procaccini
 * @version 1.0
 * @created 12-Oct-2014 7:46:04 PM
 * 
 * This is created when the user places an order
 */
public class Order {

	public Inventory m_Inventory;
	public Account m_Account;
	public MenuGUI m_MenuGUI;
	int time = 5;

	/**
	 * Parameter-less constructor
	 */
	public Order(){

	}
	
	/**
	 * Creates an order for the given item
	 * @param item - the item the user is ordering
	 */
	public Order(String item) {
		
	}

	public void finalize() throws Throwable {

	}
	/**
	 * Checks the availability of an item
	 * @param inventory - the inventory list
	 * @return whether or not the item is available
	 */
	public boolean checkAvailability(String[] inventory){
		return false;
	}
	
	public int getTime(){
		return time;
	}
	
	public void setTime(int time){
		this.time = time;
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

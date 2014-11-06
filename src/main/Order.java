package main;



/**
 * @author Alex Procaccini
 * @version 1.0
 * @created 12-Oct-2014 7:46:04 PM
 */
public class Order {

	public Inventory m_Inventory;
	public Account m_Account;
	public MenuGUI m_MenuGUI;
	int time = 5;

	public Order(){

	}
	
	public Order(String item) {
		
	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param inventory
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
	 * 
	 * @param creditCardInfo
	 */
	public void purchaseItems(int creditCardInfo){

	}

	/**
	 * 
	 * @param inventory
	 */
	public String[] selectItems(String[] inventory){
		return null;
	}
}//end Order


/**
 * @author Proco
 * @version 1.0
 * @created 12-Oct-2014 7:46:04 PM
 */
public class Order {

	public Middleware m_Middleware;
	public Inventory m_Inventory;
	public Account m_Account;
	public MenuGUI m_MenuGUI;

	public Order(){

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
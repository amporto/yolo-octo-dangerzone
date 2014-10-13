

/**
 * @author Proco
 * @version 1.0
 * @created 12-Oct-2014 7:45:55 PM
 */
public class Account {

	private boolean adminStatus;
	private int creditCardInfo;
	private String password;
	private String username;
	public Middleware m_Middleware;

	public Account(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param username
	 */
	public void createNewUser(String username){

	}

	public int getCreditCardInfo(){
		return 0;
	}

	public String getPassword(){
		return "";
	}

	public String getUsername(){
		return "";
	}

	public boolean isAdmin(){
		return false;
	}

	/**
	 * 
	 * @param creditCardInfo
	 */
	public void setCreditCardInfo(int creditCardInfo){

	}

	/**
	 * 
	 * @param password
	 */
	public void setPassword(String password){

	}

	/**
	 * 
	 * @param username
	 */
	public void setUsername(String username){

	}
}//end Account
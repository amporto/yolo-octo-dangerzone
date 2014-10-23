package main;


/**
 * @author Proco
 * @version 1.0
 * @created 12-Oct-2014 7:46:03 PM
 */
public class Middleware {

	public Middleware(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param account
	 */
	public boolean checkLogin(String[] account){
		return false;
	}
}//end Middleware
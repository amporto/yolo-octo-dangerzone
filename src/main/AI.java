package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.Timer;

import jxl.Cell;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;


/**
 * @author Proco
 * @version 1.0
 * @created 12-Oct-2014 7:45:57 PM
 */
public class AI implements Runnable{

	Order order = new Order();
	private static Random randomGenerator;
	private static String[] menuItems;
	
	public AI() throws IOException, BiffException, WriteException{

		File inventory=new File("./src/main/Inventory.xls");
        
        Workbook inventoryWorkbook1=Workbook.getWorkbook(inventory);
        WritableWorkbook inventoryWorkbook=Workbook.createWorkbook(new File("./src/main/Inventory.xls"), inventoryWorkbook1);
        String[] inventorySheetName=inventoryWorkbook.getSheetNames();
        WritableSheet inventorySheet=inventoryWorkbook.getSheet(inventorySheetName[0]);	
        
        int i;
        for (i=0; i<inventorySheet.getRows(); i++){
        	
        	Cell itemName = inventorySheet.getCell(0, i);
            String menuItem = itemName.getContents();
        	menuItems[i] = menuItem;
        	
        }
       
        randomGenerator = new Random();
       
	}
	

	public static String chooseRandomItem(){
		
		int index = randomGenerator.nextInt(menuItems.length);
		String item = menuItems[index];
		return item;
		
	}
	
	static ActionListener actList = new ActionListener(){
		public void actionPerformed(ActionEvent event) {
			
			String RandomItem = chooseRandomItem();
			System.out.println("Subtracted from" + RandomItem);
			
			try {
				
				Order.makeOrder(RandomItem, "1");
				
			} catch (BiffException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (WriteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
	};
	
	static Timer AI = new Timer(10000, actList);
	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		AI.start();
	}

	
}//end AI
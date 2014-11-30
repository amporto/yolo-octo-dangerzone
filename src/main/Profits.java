package main;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Profits {

	
	private String item;
	private String itemAmount;
	
	
	public Profits(){
		
		
	}
	
	public Profits(String item, String itemAmount){
		
		this.item=item;
		this.itemAmount=itemAmount;
		
	}
	
	
	public static void setProfits(String item, String itemAmount) throws BiffException, IOException{
		
		
File inventory = new File("./src/main/Trends.xls");
        
        Workbook inventoryWorkbook1 = Workbook.getWorkbook(inventory);
        WritableWorkbook inventoryWorkbook = Workbook.createWorkbook(new File("./src/main/Trends.xls"), inventoryWorkbook1);
        //WritableSheet loginSheet1=loginWorkbook.createSheet("First Sheet",0);
        String[] inventorySheetName = inventoryWorkbook.getSheetNames();
        WritableSheet inventorySheet = inventoryWorkbook.getSheet(inventorySheetName[0]);
		
        int i = 1;
        int max = 28;
        
        Cell profitsCell=inventorySheet.getCell("E1");
		double profits=Double.parseDouble(profitsCell.getContents());
		
		for (i =1; i <= max; i++){	
			
			
			String ACellLocation = "A"+i;
			String BCellLocation = "B"+i;
			String CCellLocation = "C"+i;
			String DCellLocation = "D"+i;
			
		    Cell acell = inventorySheet.getCell(ACellLocation);
		    String acontent = acell.getContents();
		    
		    Cell bcell1=inventorySheet.getCell(BCellLocation);
		    double bcontent=Double.parseDouble(bcell1.getContents());
		    
		    Cell ccell1=inventorySheet.getCell(CCellLocation);
		    double ccontent=Double.parseDouble(ccell1.getContents());
		    
		    Cell dcell1=inventorySheet.getCell(DCellLocation);
		    double dcontent=Double.parseDouble(dcell1.getContents());
		    
		    
		    if (acontent.equalsIgnoreCase(item)){
			
		    	if (itemAmount=="tall"){
		    		profits=profits+bcontent;
		    	}
		    	
		    	if (itemAmount=="grande"){
		    		profits=profits+ccontent;
		    	}
		    	if (itemAmount=="venti"){
		    		profits=profits+dcontent;
		    	}

			
			
			inventoryWorkbook.write();
			
			
		    }
		
	}
	
		
	}
	
	public double getProfits() throws BiffException, IOException{
		
		File inventory = new File("./src/main/Trends.xls");
		  Workbook inventoryWorkbook1 = Workbook.getWorkbook(inventory);
	        WritableWorkbook inventoryWorkbook = Workbook.createWorkbook(new File("./src/main/Trends.xls"), inventoryWorkbook1);
	        //WritableSheet loginSheet1=loginWorkbook.createSheet("First Sheet",0);
	        String[] inventorySheetName = inventoryWorkbook.getSheetNames();
	        WritableSheet inventorySheet = inventoryWorkbook.getSheet(inventorySheetName[0]);
		
		Cell profitsCell=inventorySheet.getCell("E1");
		double profits=Double.parseDouble(profitsCell.getContents());
		return profits;
		
	}
	
}

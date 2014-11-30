package main;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Trends {

	private String item;
	
	
	public Trends(){
		
	}
	
	public Trends(String item){
		
		this.item=item;
	}
	
	
	public static void setTrends(String item) throws RowsExceededException, WriteException, BiffException, IOException{
		
File inventory = new File("./src/main/Trends.xls");
        
        Workbook inventoryWorkbook1 = Workbook.getWorkbook(inventory);
        WritableWorkbook inventoryWorkbook = Workbook.createWorkbook(new File("./src/main/Trends.xls"), inventoryWorkbook1);
        //WritableSheet loginSheet1=loginWorkbook.createSheet("First Sheet",0);
        String[] inventorySheetName = inventoryWorkbook.getSheetNames();
        WritableSheet inventorySheet = inventoryWorkbook.getSheet(inventorySheetName[0]);
		
        int i = 1;
        int max = 22;
		
		for (i =1; i <= max; i++){	
			
			String ACellLocation = "A"+i;
			String BCellLocation = "B"+i;
			
		    Cell acell = inventorySheet.getCell(ACellLocation);
		    String acontent = acell.getContents();
		    Cell bcell1=inventorySheet.getCell(BCellLocation);
		    int bcontent=Integer.parseInt(bcell1.getContents());
		    
		    
		    if (acontent.equalsIgnoreCase(item)){
			
			//WritableCell bcell = inventorySheet.getWritableCell(BCellLocation);

			Label newStuff = new Label(1, i-1, Integer.toString((bcontent+1)));
			inventorySheet.addCell(newStuff);
			
			inventoryWorkbook.write();

			
		    }
		
	}
	
	}
}

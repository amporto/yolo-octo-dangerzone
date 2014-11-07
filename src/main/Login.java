package main;



import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

import jxl.read.biff.BiffException;


public class Login {

	public static boolean confInfo(String Name, String Password)
      throws BiffException, IOException
   {
	  
	  boolean confName = false;
	  boolean confPass = false;
	  boolean confInfo = false;
		
      Workbook workbook = Workbook.getWorkbook(new File("./src/main/Login Database.xls"));
     
      Sheet sheet = workbook.getSheet(0);
      
      int i;
	  int max = sheet.getRows();
      
      for (i=0; i <= max ; i++){
      
      
      Cell username = sheet.getCell(0, i);
      String USERNAME = username.getContents();
      System.out.println(USERNAME);
      Cell password = sheet.getCell(1, i);
      String PASSWORD = password.getContents();
      System.out.println(PASSWORD);
      
      
      confName = (Name.equals(USERNAME));
      confPass = (Password.equals(PASSWORD));
      
      if ((confName == true) && (confPass == true) ){
    	 confInfo = true;
    	 workbook.close();
    	 return confInfo;
      
      }
      
      if ((i + 1) == max){
    	 workbook.close();
    	 return false;
      }
   }
     
      	 confInfo = false;
    	 workbook.close();
    	 return confInfo;
      
   }

}


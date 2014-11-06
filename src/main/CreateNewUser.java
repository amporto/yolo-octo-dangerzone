package main;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;




       
public class CreateNewUser{
       
       //Declare username, password, and card number to create a new user
       private String username;
       private String password;
       private String cardNum;
       
       
       CreateNewUser(){
              
       }
       
       CreateNewUser(String username, String password, String cardNum){
              
              this.username=username;
              this.password=password;
              this.cardNum=cardNum;
       }
       
       
       //Use getters and setters for username, password, and cardNum
       public String getUsername() {
              return username;
       }
       public void setUsername(String username) {
              this.username = username;
       }
       public String getPassword() {
              return password;
       }
       public void setPassword(String password) {
              this.password = password;
       }
       public String getCardNum() {
              return cardNum;
       }
       public void setCardNum(String cardNum) {
              this.cardNum = cardNum;
       }
       
       
       //Write info to file
       public void newAccount(String username, String password, String cardNum) throws BiffException, IOException, RowsExceededException, WriteException{
              
              
              //Read the file
              File userData=new File("C:\\Users\\spaceman\\workspace\\Starbucks\\src\\main\\Login Database.xls");
              
              Workbook loginWorkbook1=Workbook.getWorkbook(userData);
              WritableWorkbook loginWorkbook=Workbook.createWorkbook(new File("C:\\Users\\spaceman\\workspace\\Starbucks\\src\\main\\Login Database.xls"), loginWorkbook1);
              //WritableSheet loginSheet1=loginWorkbook.createSheet("First Sheet",0);
              String[] loginSheetName=loginWorkbook.getSheetNames();
              WritableSheet loginSheet=loginWorkbook.getSheet(loginSheetName[0]);
              
              
              
              //Figure out next writable row
              
              int nextWritableRow= loginSheet.getRows();
              
              //Write to row
              Label user=new Label(0,nextWritableRow, username);
              Label pass=new Label(1,nextWritableRow, password);
              Label card=new Label(2,nextWritableRow, cardNum);
              
            
              
              loginSheet.addCell(user);
              loginSheet.addCell(pass);
              loginSheet.addCell(card);
              
                     
                     
              
              loginWorkbook.write();
              loginWorkbook.close();     
                     
              }      
       
       		
       
       }

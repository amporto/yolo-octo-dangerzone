package main;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;



/**
 * @author JeanV
 * This class creates the GUI for the inventory as a JPanel
 */
public class InventoryGUI extends JLabel{

	public InventoryGUI() {
		
		try {
			setIcon(new ImageIcon(ImageIO.read(getClass().getResource("207n5z7.jpg"))));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   
		setLayout(new GridLayout(0,1,0,0));
		GridBagConstraints gbc = new GridBagConstraints();
        //gbc.insets = new Insets(2, 2, 2, 2);
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.gridx = 0;
        gbc.gridy = 0;
        
        JButton Update = new JButton("Get Updated Inventory");
		 
		 add(Update, gbc);
		
         Update.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent ev1) {
		
		try {
			
			int i;
			int max = 23;
			
			setLayout(new GridLayout(0,2,0,0));
			
			//Clear for Updates
			removeAll(); 
			
			//Add Item / Quantities
			 for (i = 1; i <= max ; i++){
				 
			String AcellLocation = "A"+i;
			String BcellLocation = "B"+i;
			
			String ITEM = Inventory.getCellContents(AcellLocation);
			String QUANTITY = Inventory.getCellContents(BcellLocation);
			
			JLabel Item = new JLabel(ITEM);
		    Item.setForeground(Color.WHITE);
			
			JLabel Quantity = new JLabel(QUANTITY);
			Quantity.setForeground(Color.WHITE);
			
			 gbc.gridy++;
		     add(Item, gbc);
		     gbc.gridx++;
			 add(Quantity, gbc);
			 
			 add(Update);
			 
			 repaint();
			 }
			 
		} catch (BiffException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
         }
        
		 // add(InventoryHeader);
       
         
			
        /*
        //add(nameLabel, gbc);
		//String QUANTITY = Inventory.getItemAmount();
        
        // Will change hardcoded string value for GETTER
		String QUANTITY = "10";
	    JLabel Quantity = new JLabel(QUANTITY);
	    Quantity.setForeground(Color.WHITE);
	    
		try {
			ITEM2 = Inventory.getCellContents("A2");
		} catch (BiffException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        */
	
        
		
		
         } );
	}
}
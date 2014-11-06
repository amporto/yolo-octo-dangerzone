package main;


import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class CreateNewUserGUI {



public CreateNewUserGUI() {
    EventQueue.invokeLater(new Runnable() {
        @Override
        public void run() {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception ex) {
            }

            JFrame frame = new JFrame("CreateNewUser");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new LoginPane());
            //frame.pack();
            frame.setSize(450,800);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        }
    });
}

public class LoginPane extends JLabel {

    public LoginPane() {
        try {
            setIcon(new ImageIcon(ImageIO.read(getClass().getResource("create new user background.jpg"))));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.EAST;
        gbc.insets = new Insets(2, 2, 2, 2);
        gbc.gridx = 0;
        gbc.gridy = 0;

        JLabel nameLabel = new JLabel("Name: ");
        nameLabel.setForeground(Color.WHITE);
        JLabel passwordLabel = new JLabel("Password: ");
        passwordLabel.setForeground(Color.WHITE);
        JLabel cardNumber=new JLabel("Card Number: ");
        cardNumber.setForeground(Color.WHITE);
        

        add(nameLabel, gbc);
        gbc.gridy++;
        add(passwordLabel, gbc);
        gbc.gridy++;
        add(cardNumber, gbc);

        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx++;
        gbc.gridy = 0;
        final JTextField username=new JTextField(20);
        add(username, gbc);
        gbc.gridy++;
        final JTextField password=new JTextField(20);
        add(password, gbc);
        gbc.gridy++;
        final JTextField cardNum=new JTextField(16);
        add(cardNum, gbc);

        gbc.gridy++;
        gbc.insets = new Insets(10, 2, 2, 2);
        gbc.anchor = GridBagConstraints.EAST;
        JButton createAccount=new JButton("Create Account");
        add(createAccount, gbc);
        
        
        createAccount.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ev1) {
        	
        	String name=username.getText();
        	String pass=password.getText();
        	String card=cardNum.getText();
        	
        	CreateNewUser newUser=new CreateNewUser();
        	try {
				newUser.newAccount(name, pass, card);
				
			} catch (BiffException | WriteException
					| IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        new LoginGUI();
        	
        }       
        
        

        });
        
       
    }

}

}


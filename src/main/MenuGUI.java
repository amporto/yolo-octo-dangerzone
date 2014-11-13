package main;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;



/**
 * @author Alex Procaccini
 * @version 1.0
 * @created 12-Oct-2014 7:46:02 PM
 * 
 * This is the panel where the menu will be displayed. Users can place their orders using this menu.
 */
public class MenuGUI extends JPanel{

	ButtonGroup buttonGroup = new ButtonGroup();
	/**
	 * Constructor for the menu GUI
	 */
	public MenuGUI(){
		BorderLayout menuLayout = new BorderLayout();
		setLayout(menuLayout);
		JRadioButton coffeeButton = new JRadioButton("Coffee");
		coffeeButton.setActionCommand("Coffee");
		JRadioButton teaButton = new JRadioButton("Tea");
		teaButton.setActionCommand("Tea");
		JRadioButton frappachinoButton = new JRadioButton("Frappuchino");
		frappachinoButton.setActionCommand("Frappuchino");
		JRadioButton muffinButton = new JRadioButton("Muffin");
		muffinButton.setActionCommand("Muffin");
		JRadioButton cookieButton = new JRadioButton("Cookie");
		cookieButton.setActionCommand("Cookie");
		JPanel radioPanel = new JPanel(new GridLayout(0, 1));
		buttonGroup.add(coffeeButton);
		buttonGroup.add(teaButton);
		buttonGroup.add(frappachinoButton);
		buttonGroup.add(muffinButton);
		buttonGroup.add(cookieButton);
		radioPanel.add(coffeeButton);
		radioPanel.add(teaButton);
		radioPanel.add(frappachinoButton);
		radioPanel.add(muffinButton);
		radioPanel.add(cookieButton);
		add(radioPanel, BorderLayout.CENTER);
		JLabel question = new JLabel("What would you like to order?");
		add(question, BorderLayout.NORTH);
		JButton orderButton = new JButton("Order");
		orderButton.addActionListener(new OrderListener());
		add(orderButton, BorderLayout.SOUTH);

	}

	public void finalize() throws Throwable {

	}

	/**
	 * Action listener for seeing which button was selected and placing the order
	 */
	class OrderListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			ButtonModel selectedButton = buttonGroup.getSelection();
			Order order;
			if (selectedButton == null){
				JOptionPane.showMessageDialog(null, "Please select a item.");
			}
			else if (selectedButton != null){
				order = new Order(selectedButton.getActionCommand());
				JOptionPane.showMessageDialog(null, "Your order of 1 " + selectedButton.getActionCommand() + " has been placed.\nIt will take " + order.getTime() + " minutes.");
			}
		}
	}
}//end MenuGUI

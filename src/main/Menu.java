package main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML

/**
 * @author Alex Procaccini
 */

public class Menu {
	@FXML
	public void order(ActionEvent event) {
		RadioButton selectedButton = item.getSelectedToggle();
		Order order;
		if (selectedButton == null){
			JOptionPane.showMessageDialog(null, "Please select a item.");
		}
		else if (selectedButton != null){
			order = new Order(selectedButton.getId());
			JOptionPane.showMessageDialog(null, "Your order of 1 " + selectedButton.getActionCommand() + " has been placed.\nIt will take " + order.getTime() + " minutes.");
		}
	}
}
		

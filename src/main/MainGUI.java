package main;

import javax.swing.JFrame;

/**
 * @author Alex Procaccini
 * @version 1.0
 * @created 12-Oct-2014 7:46:01 PM
 */
public class MainGUI extends JFrame {

	// public LoginGUI loginGUI = new LoginGUI();
	// public UserGUI userGUI = new UserGUI();
	// public AdminGUI adminGUI = new AdminGUI();
	public FXInSwing mainMenu = new FXInSwing();

	public MainGUI() {
		setSize(450, 800);
		setTitle("ERAU Starbucks App");
		setVisible(false);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(mainMenu);

	}

	public void finalize() throws Throwable {

	}

	public static void main(String[] args) {
		MainGUI gui = new MainGUI();
	}
}// end MainGUI
package main;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

//import javafx.embed.swing.JFXPanel;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;

import jxl.read.biff.BiffException;

/**
 * @author Jean V This is the constructor for the main Login GUI
 */

public class LoginGUI {
	// hello this is a test
	public static void main(String[] args) {
		new LoginGUI();
	}

	public LoginGUI() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager
							.getSystemLookAndFeelClassName());
				} catch (Exception ex) {
				}

				JFrame frame = new JFrame("Login");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.add(new LoginPane());
				// frame.pack();
				frame.setSize(450, 800);
				frame.setVisible(true);
				frame.setLocationRelativeTo(null);

			}
		});
	}

	/**
	 * @author Jean V This contains the JLabel for the Login GUI
	 */

	public class LoginPane extends JLabel {

		public LoginPane() {

			try {
				setIcon(new ImageIcon(ImageIO.read(getClass().getResource(
						"loginBackground.jpg"))));
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

			add(nameLabel, gbc);
			gbc.gridy++;
			add(passwordLabel, gbc);

			gbc.anchor = GridBagConstraints.WEST;
			gbc.gridx++;
			gbc.gridy = 0;
			final JTextField userName = new JTextField(20);

			add(userName, gbc);
			gbc.gridy++;
			final JTextField passWord = new JTextField(20);
			add(passWord, gbc);

			gbc.gridy++;
			gbc.insets = new Insets(10, 2, 2, 2);
			gbc.anchor = GridBagConstraints.EAST;
			JButton Submit = new JButton("Submit");
			add(Submit, gbc);
			gbc.gridy++;
			JButton createNewUser = new JButton("Create New Account");
			add(createNewUser, gbc);

			Submit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent ev1) {

					String Name = userName.getText();
					System.out.println(Name);
					String Password = passWord.getText();
					System.out.println(Password);
					System.out.println("");

					try {

						boolean confInfo = Login.confInfo(Name, Password);
						boolean confInfoAdmin = Login.confInfoAdmin(Name,
								Password);
						/**
						 * If UserInfo is false - deny access / display
						 * 'Incorrect Info'
						 */

						if (confInfo == false && confInfoAdmin == false) {
							System.out.println("Wrong User Info");
							userName.setText("");
							passWord.setText("");
							JOptionPane.showMessageDialog(null,
									"Incorrect Username or Password");

						}
						/**
						 * If UserInfo is true - allow access to main GUI
						 */
						if (confInfo == true) {
							// Open rest of Project GUI
							// System.out.println("Correct User Info");
							// LoginGUI.frame.dispose();

							/**
<<<<<<< HEAD
							* Unleash the Main GUI
							*/


							new FXInSwing();

							

							//new FXInSwing();

							new MainGUI();
							//new UserGUI();


	               	}
						
						if (confInfoAdmin==true){
							/*
=======
							 * Unleash the Main GUI
							 */
						//	Application.launch (UserGUI.class, null);
							JFXPanel user = new UserGUI();
							//frame.add(user);
/*
>>>>>>> ba8576f2eaa626c362381d375e9a7d4239be7259
*/
							

						}

						if (confInfoAdmin == true) {
							// new AdminGUI();
							new FXInSwing();
						}

					} catch (BiffException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}

			});

			createNewUser.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ev2) {

					new CreateNewUserGUI();

				}

			});

			// CreateNewUser newUser = new CreateNewUser();
			// When new user button is pressed
			/*
			 * try { newUser.newAccount("JeanV", "AIRPOWER", "1444"); } catch
			 * (RowsExceededException e) { // TODO Auto-generated catch block
			 * e.printStackTrace(); } catch (BiffException e) { // TODO
			 * Auto-generated catch block e.printStackTrace(); } catch
			 * (WriteException e) { // TODO Auto-generated catch block
			 * e.printStackTrace(); } catch (IOException e) { // TODO
			 * Auto-generated catch block e.printStackTrace(); }
			 */

		}

	}
}

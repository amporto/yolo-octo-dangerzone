import java.awt.Component;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class ChangeInfoGUI extends Component {

	static JFXPanel jfxPanel = new JFXPanel();

	public ChangeInfoGUI() {

	}

	public class Test {

		private void initAndShowGUI() {
			// This method is invoked on Swing thread
			JFrame frame = new JFrame("FX");
			final JFXPanel fxPanel = new JFXPanel();
			frame.add(fxPanel);
			frame.setVisible(true);

			Platform.runLater(new Runnable() {
				@Override
				public void run() {
					initFX(fxPanel);
				}
			});
		}

		public void initFX(JFXPanel fxPanel) {
			// This method is invoked on JavaFX thread
			Parent root;
			try {
				root = FXMLLoader.load(getClass().getResource(
						"/fxml/ChangeInfoGUI.fxml"));
				Scene scene = new Scene(root);
				jfxPanel.setScene(scene);
			} catch (IOException ex) {
				// Exceptions.printStackTrace(ex);
			}
		}

		
	}



public static void main(String[] args) {
	SwingUtilities.invokeLater(new Runnable() {
		@Override
		public void run() {
			ChangeInfoGUI.Test low = new ChangeInfoGUI.Test();
			low.initAndShowGUI();
		}
	});
}}
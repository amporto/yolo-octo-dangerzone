import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * @author Brandon
 * @version 1.0
 * @created 12-Oct-2014 7:45:58 PM
 */
public class ChangeInfoGUI extends JPanel {
	private String labelPrefix = "Number of button clicks: ";
	private String labelPrefix2 = "Click Increment: ";
	private int numClicks = 0;
	private int clickIncrement = 5;
	JLabel label;
	JLabel label2;
	JButton button;
	JSlider slider;
	static final int SLIDER_MIN = 1;
	static final int SLIDER_MAX = 9;
	static final int SLIDER_INIT = 5;

	public ChangeInfoGUI() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
		button = new JButton("Click Me!");
		button.setMnemonic(KeyEvent.VK_I);
		//button.addActionListener(new ClickCountListener());
		button.setAlignmentX(Component.CENTER_ALIGNMENT);
		button.setFont(new Font("serif", Font.PLAIN, 25));

		slider = new JSlider(SLIDER_MIN, SLIDER_MAX, SLIDER_INIT);
		slider.setMajorTickSpacing(1);
		slider.setMinorTickSpacing(1);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		//slider.addChangeListener(new IncrementListener());

		// Turn on labels at major tick marks.
		label = new JLabel(labelPrefix + "0 ");
		label.setAlignmentX(Component.CENTER_ALIGNMENT);
		label.setFont(new Font("serif", Font.PLAIN, 25));

		label2 = new JLabel(labelPrefix2 + "5 ");
		label2.setAlignmentX(Component.CENTER_ALIGNMENT);
		label2.setFont(new Font("serif", Font.PLAIN, 25));

		add(Box.createVerticalGlue());
		add(slider);
		add(Box.createVerticalGlue());
		add(label2);
		add(Box.createVerticalGlue());
		add(button);
		add(Box.createVerticalGlue());
		add(label);
		add(Box.createVerticalGlue());
	}

	public static void main(String[] args) {

		JFrame frame = new JFrame("Swing Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ChangeInfoGUI app = new ChangeInfoGUI();
		frame.setContentPane(app);

		frame.setVisible(true);
		frame.setSize(450, 800);
		frame.validate();
	}

	public abstract class ClickCountListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			numClicks += clickIncrement;
			label.setText(labelPrefix + numClicks);
		}
	}

	public abstract class IncrementListener implements ChangeListener {

		public void stateChanged(ChangeEvent e) {
			clickIncrement = slider.getValue();
			label2.setText(labelPrefix2 + clickIncrement);
		}
	}

	public void finalize() throws Throwable {

	}
}// end ChangeInfoGUI
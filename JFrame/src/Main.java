import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {

	public static void main(String[] args) {

		// JFrame = a GUI window to add component to
		ImageIcon image = new ImageIcon("logo.png");

		Border border = BorderFactory.createLineBorder(Color.GREEN);
		ImageIcon image1 = new ImageIcon("ptrlpmp.png");
		JFrame frame = new JFrame();// Create a frame
		JLabel label = new JLabel();
		label.setText(" THIS IS PETROL PUMP");

		label.setIcon(image1);
		label.setHorizontalTextPosition(JLabel.CENTER);// set text LEFT,CENTER,
		label.setVerticalTextPosition(JLabel.TOP); // RIGHT of image icon
		label.setVerticalAlignment(JLabel.TOP);// vertical position
		label.setForeground(Color.GREEN);// new color RGB value or hex color
		label.setFont(new Font(" MV BOLI", Font.PLAIN, 20));
		frame.setTitle("J Frame ");
		frame.setSize(500, 500);// sets the x-dimension, and y- dimension of
		// frame
		label.setBorder(border);

		label.setIconTextGap(100); // -25 set gap of text to image
		label.setBackground(Color.BLACK);
		label.setOpaque(true);// display back ground
		frame.setResizable(false);// prevent frame from being resize
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);// make frame visible
		frame.add(label);
		frame.pack();// last line only
		frame.setIconImage(image.getImage());
		frame.getContentPane().setBackground(new Color(123, 50, 255)); //
		// Color.GREEN
		// //
		// can
		// also
		// use
		// hexadecimal

		// new Color(255,255,255)
	}
}

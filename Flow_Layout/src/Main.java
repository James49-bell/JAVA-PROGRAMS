import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {

		// Layout manager = Define the natural layout for components within a
		// container

		// FLow layout = places components in a row, sized at their preferred
		// size.
		// If the horizontal space in the container is too small,
		// the flow layout class uses the next available row.

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(new FlowLayout());// () -> FLowLayout.center
		frame.setVisible(true);

		JPanel panel = new JPanel();

		panel.setPreferredSize(new Dimension(250, 250));
		panel.setBackground(Color.LIGHT_GRAY);

		panel.setLayout(new FlowLayout());
		panel.add(new JButton("1"));
		panel.add(new JButton("2"));
		panel.add(new JButton("3"));
		panel.add(new JButton("4"));
		panel.add(new JButton("5"));
		panel.add(new JButton("6"));
		panel.add(new JButton("7"));
		panel.add(new JButton("8"));

		frame.add(panel);
	}

}

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		// JOptionPane = pop up a standard dialog box that prompts users for a
		// value or informs them of something.

		// ++++++++++++++++++++++++++++++++
		//
		// JOptionPane.showMessageDialog(null, "this is some useless info ",
		// "Title", JOptionPane.PLAIN_MESSAGE);
		// JOptionPane.showMessageDialog(null, "this is some useless info ",
		// "Title", JOptionPane.INFORMATION_MESSAGE);
		// JOptionPane.showMessageDialog(null, "this is some useless info ",
		// "Title", JOptionPane.QUESTION_MESSAGE);
		// while (true)
		// JOptionPane.showMessageDialog(null, "this is some useless info ",
		// "Title", JOptionPane.WARNING_MESSAGE);

		// JOptionPane.showConfirmDialog(null, " are you human", " you ",
		// JOptionPane.YES_NO_CANCEL_OPTION);

		// String name = JOptionPane.showInputDialog(" what is you name");
		// System.out.println(name);

		JOptionPane.showOptionDialog(null, " you are awsome", null,
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.INFORMATION_MESSAGE, null, null, 0);
		//

	}
}

import javax.swing.JFrame;

public class Example {

	JFrame mainFrame;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CheckboxPanel cbPanel = new CheckboxPanel();
		JFrame mainFrame = new JFrame();
		cbPanel = new CheckboxPanel();

		mainFrame.setVisible(true);
		mainFrame.setSize(400, 400);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.add(cbPanel);

	}

}

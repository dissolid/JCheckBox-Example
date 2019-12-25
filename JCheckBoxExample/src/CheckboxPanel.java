import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CheckboxPanel extends JPanel implements ActionListener {

	JCheckBox cb1, cb2;
	JButton btn1;

	public CheckboxPanel() {
		// TODO Auto-generated constructor stub
		super();
		btn1 = new JButton("Tamam");
		btn1.addActionListener(this);

		cb1 = new JCheckBox("Hello");
		cb2 = new JCheckBox("World!");

		add(cb1);
		add(cb2);
		add(btn1);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getActionCommand().equals("Tamam")) {
			if (cb1.isSelected() && !cb2.isSelected()) {
				JOptionPane.showMessageDialog(this, cb1.getText());

			} else if (cb2.isSelected() && !cb1.isSelected()) {
				JOptionPane.showMessageDialog(this, cb2.getText());

			} else if (cb1.isSelected() && cb2.isSelected()) {
				JOptionPane.showMessageDialog(this, cb1.getText() + " " + cb2.getText());
			} else {
				JOptionPane.showMessageDialog(this, "Please select one or more item.", "Warning",
						JOptionPane.ERROR_MESSAGE);

			}

		}

	}

}

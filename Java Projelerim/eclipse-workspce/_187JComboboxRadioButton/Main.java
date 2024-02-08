import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.LinkedHashSet;
import java.util.Set;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.DefaultComboBoxModel;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Java", "Python", "Php", "C++"}));
		comboBox.setMaximumRowCount(4);
		comboBox.setBounds(123, 87, 188, 22);
		contentPane.add(comboBox);
		
		JButton select = new JButton("Select");
		select.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				/*if(java_radio.isSelected()) {
					language.add(java_radio.getText());
				}
				else {
					language.remove(java_radio.getText());
				}
				if(php_radio.isSelected()) {
					language.add(php_radio.getText());
				}
				else {
					language.remove(php_radio.getText());
				}
				if(python_radio.isSelected()) {
					language.add(python_radio.getText());
				}
				else {
					language.remove(python_radio.getText());
				}
				if(c_radio.isSelected()) {
					language.add(c_radio.getText());
				}
				else {
					language.remove(c_radio.getText());
				}*/
				String message = "Selected Language : \n";
				message += comboBox.getSelectedItem();
				JOptionPane.showMessageDialog(select, message);
			}
		});
		select.setBounds(156, 157, 122, 23);
		contentPane.add(select);
		
		
		
		
	}
}

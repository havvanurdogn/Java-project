import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.security.MessageDigest;
import java.awt.event.ActionEvent;

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
		
		JLabel messagetxt = new JLabel("");
		messagetxt.setBounds(64, 45, 305, 14);
		contentPane.add(messagetxt);
		
		JLabel lblNewLabel_1 = new JLabel("User Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(64, 70, 99, 14);
		contentPane.add(lblNewLabel_1);
		
		JList userlist = new JList();
		userlist.setModel(new AbstractListModel() {
			String[] values = new String[] {};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		userlist.setBounds(64, 95, 305, 157);
		contentPane.add(userlist);
		
		DefaultListModel model = new DefaultListModel();
		userlist.setModel(model);
		
		JButton add = new JButton("Add User");
		add.addActionListener(new ActionListener() {
			int num = 0;
			public void actionPerformed(ActionEvent e) {
				messagetxt.setText("");
				String answer = JOptionPane.showInputDialog("User Name : ");
				if(answer != null) {
					if(answer.trim().equals("")) {
						messagetxt.setText("Please enter a valid name.");
					}
					else {
						model.addElement(answer);
						messagetxt.setText("User added successfully.");
						num ++ ;
					}
				}
				else {
					messagetxt.setText("Progress is canceled.");
				}
			}
		});
		add.setBounds(64, 11, 127, 23);
		contentPane.add(add);
		
		JButton remove = new JButton("Remove User");
		remove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				messagetxt.setText("");
				int selectedindex = userlist.getSelectedIndex();
				if(selectedindex == -1) {
					if(model.getSize() == 0) {
						messagetxt.setText("User list has no user.");
					}
					else {
						messagetxt.setText("Please select a row to remove.");
					}
				}
				else {
					Object selected = model.getElementAt(selectedindex);
					model.removeElement(selected);
					messagetxt.setText("User " + selected + " removed successfully.");
				}
			}
		});
		remove.setBounds(242, 11, 127, 23);
		contentPane.add(remove);
		
		
	}

}

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class RegisterPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField userNametxt;
	private JPasswordField passwordtxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterPage frame = new RegisterPage();
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
	public RegisterPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 431, 194);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 64, 64));
		panel.setBounds(10, 11, 395, 95);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel usernametxt = new JLabel("User Name : ");
		usernametxt.setForeground(new Color(255, 255, 255));
		usernametxt.setFont(new Font("Tahoma", Font.BOLD, 14));
		usernametxt.setBounds(35, 11, 123, 26);
		panel.add(usernametxt);
		
		userNametxt = new JTextField();
		userNametxt.setBounds(184, 11, 141, 25);
		panel.add(userNametxt);
		userNametxt.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password : ");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(35, 48, 123, 26);
		panel.add(lblNewLabel_1);
		
		passwordtxt = new JPasswordField();
		passwordtxt.setBounds(184, 47, 141, 26);
		panel.add(passwordtxt);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 128, 192));
		panel_1.setBounds(10, 106, 395, 38);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton register = new JButton("Register");
		register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName = userNametxt.getText();
				String password = new String (passwordtxt.getPassword());
				if(userName.equals("") || password.equals("")) {
					JOptionPane.showMessageDialog(register, "User Name Field or Password Field Cannot Leave Blank.");
					userNametxt.setText("");
					passwordtxt.setText("");
				}
				else {
					ArrayList<User> user_list = Main.getUserList();
					user_list.add(new User(userName, password));
					setVisible(false);
				}
				
			}
		});
		register.setFont(new Font("Tahoma", Font.PLAIN, 14));
		register.setForeground(new Color(0, 64, 64));
		register.setBackground(new Color(255, 255, 128));
		register.setBounds(131, 11, 132, 23);
		panel_1.add(register);
	}

}

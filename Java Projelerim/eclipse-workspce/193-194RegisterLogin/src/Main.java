import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class User{
	private String userName;
	private String password;
	public User(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}

public class Main extends JFrame {

	
	private static ArrayList<User> userList = new ArrayList<User>();
	
	public static ArrayList<User> getUserList() {
		return userList;
	}
	public static void setUserList(ArrayList<User> userList) {
		Main.userList = userList;
	}

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField usernametxt;
	private JPasswordField passwordtxt;

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
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 0));
		panel.setForeground(new Color(0, 128, 0));
		panel.setBounds(10, 11, 414, 161);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Name : ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(58, 60, 118, 24);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password : ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(58, 95, 118, 24);
		panel.add(lblNewLabel_1);
		
		usernametxt = new JTextField();
		usernametxt.setFont(new Font("Tahoma", Font.PLAIN, 14));
		usernametxt.setBounds(210, 64, 146, 20);
		panel.add(usernametxt);
		usernametxt.setColumns(10);
		
		passwordtxt = new JPasswordField();
		passwordtxt.setFont(new Font("Tahoma", Font.PLAIN, 14));
		passwordtxt.setBounds(210, 99, 146, 20);
		panel.add(passwordtxt);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 128, 64));
		panel_1.setForeground(new Color(0, 0, 128));
		panel_1.setBounds(10, 183, 414, 67);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton register = new JButton("Register");
		register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterPage registerp = new RegisterPage();
				registerp.setVisible(true);
				
			}
		});
		register.setBounds(29, 22, 125, 23);
		panel_1.add(register);
		
		JButton login = new JButton("Login");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName = usernametxt.getText();
				String password = new String (passwordtxt.getPassword());
				if(userList.size() == 0) {
					JOptionPane.showMessageDialog(login, "Any user not found!");
					usernametxt.setText("");
					passwordtxt.setText("");
				}
				else {
					for(User user : userList) {
						if(user.getUserName().equals(userName) && user.getPassword().equals(password)) {
							JOptionPane.showMessageDialog(login, "Welcome, " + userName + " !");
							System.exit(0);
							return;
						}
					}
					JOptionPane.showMessageDialog(login, "User has not found:::\nPlease sign up!");
					usernametxt.setText("");
					passwordtxt.setText("");
				}
			}
		});
		login.setBounds(260, 22, 125, 23);
		panel_1.add(login);
	}
}

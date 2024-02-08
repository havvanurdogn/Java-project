import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LogInPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField passwordtxt;
	private JTextField usertxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogInPage frame = new LogInPage();
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
	public LogInPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton login = new JButton("Log In");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName = usertxt.getText();
				String password = new String(passwordtxt.getText());
				String message;
				if(userName.equals("thomas.edison") && password.equals("12345")) {
					message = "Welcome , " + userName ;
				}
				else if(!userName.equals("thomas.edison") && password.equals("12345")) {
					message = "UserName is wrong.\nPlease try again";
				}
				else if(userName.equals("thomas.edison") && !password.equals("12345")) {
					message = "Password is wrong.\nPlease try again";
				}
				else {
					message = "UserName and Password are wrong.\nPlease try again.";
				}
				
				if(message.equals("Welcome , " + userName)) {
					
					JOptionPane.showMessageDialog(login, message);
					System.exit(0);
				}
				else {
					JOptionPane.showMessageDialog(login, message);
				}
				usertxt.setText("");
				passwordtxt.setText("");
			}
		});
		login.setFont(new Font("Tahoma", Font.PLAIN, 12));
		login.setBounds(127, 140, 191, 40);
		contentPane.add(login);
		
		passwordtxt = new JPasswordField();
		passwordtxt.setBounds(127, 79, 191, 20);
		contentPane.add(passwordtxt);
		
		usertxt = new JTextField();
		usertxt.setBounds(127, 32, 191, 20);
		contentPane.add(usertxt);
		usertxt.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("User Name : ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 34, 107, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(23, 81, 107, 14);
		contentPane.add(lblNewLabel_1);
	}
}

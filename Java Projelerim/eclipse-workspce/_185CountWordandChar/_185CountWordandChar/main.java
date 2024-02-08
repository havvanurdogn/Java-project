package _185CountWordandChar;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
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
	public main() {
		setFont(new Font("Tahoma", Font.PLAIN, 12));
		setTitle("Frequecy Word and Character");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		textField = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.WEST, textField, 38, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, textField, -70, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField, -38, SpringLayout.EAST, contentPane);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel wordNum = new JLabel("Number of Word : ");
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField, 6, SpringLayout.SOUTH, wordNum);
		sl_contentPane.putConstraint(SpringLayout.WEST, wordNum, 38, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, wordNum, 10, SpringLayout.NORTH, contentPane);
		wordNum.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(wordNum);
		
		JLabel charNum = new JLabel("Number of Character : ");
		sl_contentPane.putConstraint(SpringLayout.NORTH, charNum, 0, SpringLayout.NORTH, wordNum);
		sl_contentPane.putConstraint(SpringLayout.WEST, charNum, 75, SpringLayout.EAST, wordNum);
		charNum.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(charNum);
		
		JButton count = new JButton("Count Word and Character");
		count.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText();
				int numword = 0 ;
				int numchar = 0 ;
				for(int i = 0 ; i < text.length() ; i++) {
					if(text.charAt(i) != ' ') {
						numchar++;
					}
				}
				String[] wordarr = text.split(" ");
				for(String s : wordarr) {
					numword++ ;
				}
				
				wordNum.setText("Number of Word : " + numword);
				charNum.setText("Number of Character : " + numchar);
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, count, 19, SpringLayout.SOUTH, textField);
		sl_contentPane.putConstraint(SpringLayout.WEST, count, 122, SpringLayout.WEST, contentPane);
		count.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(count);
	}
}

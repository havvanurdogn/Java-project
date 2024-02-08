import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.DropMode;

public class Main extends JFrame {

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
		
		textField = new JTextField();
		textField.setBounds(10, 25, 414, 172);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton filec = new JButton("Choose a File");
		filec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser();
				int i = fc.showOpenDialog(filec);
				if(i == JFileChooser.APPROVE_OPTION) {
					File file = fc.getSelectedFile();
					String fin = "";
					try(Scanner read = new Scanner(new BufferedReader(new FileReader(file)))){
						
						while(read.hasNext()) {
							fin += read.nextLine() + "\n";
						}
						textField.setText(fin);
						
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		filec.setFont(new Font("Tahoma", Font.PLAIN, 13));
		filec.setBounds(53, 208, 128, 23);
		contentPane.add(filec);
		
		JButton colorc = new JButton("Choose a Color");
		colorc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Color color = JColorChooser.showDialog(colorc, "Please choose a color:", Color.RED);
				textField.setForeground(color);
			}
		});
		colorc.setFont(new Font("Tahoma", Font.PLAIN, 13));
		colorc.setBounds(242, 208, 128, 23);
		contentPane.add(colorc);
	}
}

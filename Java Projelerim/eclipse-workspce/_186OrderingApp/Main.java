import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.util.LinkedHashMap;
import java.util.Map;
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
		setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 12));
		setTitle("Ordering Application");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCheckBox waterCheck = new JCheckBox("Water - 0.25$");
		waterCheck.setBounds(145, 150, 103, 23);
		waterCheck.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(waterCheck);
		
		JCheckBox noodleCheck = new JCheckBox("Vegetable Noodle - 2.30$");
		noodleCheck.setBounds(145, 98, 167, 23);
		noodleCheck.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(noodleCheck);
		
		JCheckBox sushiCheck = new JCheckBox("Sushi - 4$");
		sushiCheck.setBounds(145, 72, 79, 23);
		sushiCheck.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(sushiCheck);
		
		JCheckBox saladCheck = new JCheckBox("Salad - 1.25$");
		saladCheck.setBounds(145, 124, 97, 23);
		saladCheck.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(saladCheck);
		
		JButton chooseButton = new JButton("Choosing Order");
		
		Map<String, Float> orders = new LinkedHashMap<String, Float>();
		
		
		chooseButton.addActionListener(new ActionListener() {
			public void showOrder() {
				String message = "";
				float amount = 0;
				if(orders.isEmpty()) {
					message = "Not Found The Order.";
				}
				else {
					message = "Orders : \n";
					for(Map.Entry<String, Float> entry : orders.entrySet()) {
						message += entry.getKey() + "\n";
						amount += entry.getValue();
						}
					message += "Amount : " + amount;
					}
				JOptionPane.showMessageDialog(chooseButton, message);
			}
			public void actionPerformed(ActionEvent e) {
				if(sushiCheck.isSelected()) {
					orders.put("Sushi", (float) 4.0);
				}
				else {
					orders.remove("Sushi", (float) 4.0);
				}
				if(saladCheck.isSelected()) {
					orders.put("Salad", (float) 1.25);
				}
				else {
					orders.remove("Salad", (float) 1.25);
				}
				if(waterCheck.isSelected()) {
					orders.put("Water", (float) 0.25);
				}
				else {
					orders.remove("Water", (float) 0.25);
				}
				if(noodleCheck.isSelected()) {
					orders.put("Vegetable Noodle", (float) 2.30);
				}
				else {
					orders.remove("Vegetable Noodle", (float) 2.30);
				}
				showOrder();
			}
		});
		chooseButton.setBounds(140, 191, 154, 32);
		chooseButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(chooseButton);
		
		JLabel lblNewLabel = new JLabel("MENU : ");
		lblNewLabel.setBounds(145, 42, 79, 23);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel);
		
		
	}

}

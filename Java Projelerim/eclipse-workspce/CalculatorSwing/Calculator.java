import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField firstNum;
	private JTextField secondNum;
	private JTextField result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel firstNtxt = new JLabel("First number : ");
		firstNtxt.setFont(new Font("Tahoma", Font.PLAIN, 12));
		firstNtxt.setBounds(59, 29, 117, 27);
		contentPane.add(firstNtxt);
		
		JLabel secondNtxt = new JLabel("Second number :");
		secondNtxt.setFont(new Font("Tahoma", Font.PLAIN, 12));
		secondNtxt.setBounds(59, 57, 117, 32);
		contentPane.add(secondNtxt);
		
		JLabel resultxt = new JLabel("Result : ");
		resultxt.setFont(new Font("Tahoma", Font.PLAIN, 12));
		resultxt.setBounds(59, 100, 46, 14);
		contentPane.add(resultxt);
		
		firstNum = new JTextField();
		firstNum.setFont(new Font("Tahoma", Font.PLAIN, 12));
		firstNum.setBounds(186, 33, 86, 20);
		contentPane.add(firstNum);
		firstNum.setColumns(10);
		
		secondNum = new JTextField();
		secondNum.setFont(new Font("Tahoma", Font.PLAIN, 12));
		secondNum.setBounds(186, 64, 86, 20);
		contentPane.add(secondNum);
		secondNum.setColumns(10);
		
		result = new JTextField();
		result.setEditable(false);
		result.setFont(new Font("Tahoma", Font.PLAIN, 12));
		result.setBounds(186, 98, 86, 20);
		contentPane.add(result);
		result.setColumns(10);
		
		JButton sum = new JButton("+");
		sum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fnum = Integer.valueOf(firstNum.getText());
				int snum = Integer.valueOf(secondNum.getText());
				result.setText(String.valueOf(fnum + snum));
			}
		});
		sum.setFont(new Font("Tahoma", Font.PLAIN, 12));
		sum.setBounds(59, 164, 89, 23);
		contentPane.add(sum);
		
		JButton substract = new JButton("-");
		substract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fnum = Integer.valueOf(firstNum.getText());
				int snum = Integer.valueOf(secondNum.getText());
				result.setText(String.valueOf(fnum - snum));
			}
		});
		substract.setFont(new Font("Tahoma", Font.PLAIN, 12));
		substract.setBounds(186, 165, 89, 23);
		contentPane.add(substract);
		
		JButton multiply = new JButton("x");
		multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fnum = Integer.valueOf(firstNum.getText());
				int snum = Integer.valueOf(secondNum.getText());
				result.setText(String.valueOf(fnum * snum));
			}
		});
		multiply.setFont(new Font("Tahoma", Font.PLAIN, 12));
		multiply.setBounds(59, 198, 89, 23);
		contentPane.add(multiply);
		
		JButton divison = new JButton("/");
		divison.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fnum = Integer.valueOf(firstNum.getText());
				int snum = Integer.valueOf(secondNum.getText());
				result.setText(String.valueOf((double)fnum / snum));
			}
		});
		divison.setFont(new Font("Tahoma", Font.PLAIN, 12));
		divison.setBounds(186, 199, 89, 23);
		contentPane.add(divison);
	}
}

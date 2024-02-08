
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Deneme2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton buton;
	private int say = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Deneme2 frame = new Deneme2();
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
	public Deneme2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 563, 125);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		buton = new JButton("Tıkla");
		buton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				say ++ ;
				System.out.println("You have pressed the button " + say +" times.");
			}
		});
		buton.setBackground(UIManager.getColor("Button.disabledShadow"));
		buton.setFont(new Font("Courier New", Font.BOLD, 11));
		contentPane.add(buton);
	}

}

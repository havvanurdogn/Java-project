import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import javax.swing.Timer;
import javax.swing.JButton;
import java.awt.event.ActionListener;

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
		
		setTitle("File Downloading Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setStringPainted(true);
		progressBar.setBounds(82, 58, 269, 36);
		contentPane.add(progressBar);
		
		JButton btnNewButton = new JButton("Download");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Timer timer = new Timer(50,null);
				timer.addActionListener(new ActionListener() {
					int num = 0 ;
					public void actionPerformed(ActionEvent e) {
						num ++;
						progressBar.setValue(num);
						if(progressBar.getValue() == 100) {
							//JOptionPane.showMessageDialog(btnNewButton, "File Downloaded Successfuly!");
							timer.stop();
							setVisible(false);
							LastPage lastp = new LastPage();
							lastp.setVisible(true);
							
						}
						
					}
					
				});
				timer.start();
				
			}
		});
		btnNewButton.setBounds(153, 159, 127, 23);
		contentPane.add(btnNewButton);
	}
}

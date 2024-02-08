import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Rectangle;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.event.ActionEvent;

public class WebPagePrep extends JFrame {
	
	private int num = 0;

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFile;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WebPagePrep frame = new WebPagePrep();
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
	public WebPagePrep() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnTkla = new JButton("Tıkla\r\n");
		btnTkla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*num++;
				System.out.println("The button have been clicked for " + num + " times.");*/
				String internetAddress = textFile.getText();
				Desktop desk = Desktop.getDesktop();
				try {
					desk.browse(new URI(internetAddress));
				} catch (IOException | URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnTkla.setLocation(163, 164);
		btnTkla.setAutoscrolls(true);
		btnTkla.setAlignmentX(Component.RIGHT_ALIGNMENT);
		btnTkla.setSize(new Dimension(107, 23));
		contentPane.add(btnTkla);
		
		textFile = new JTextField();
		textFile.setBounds(81, 116, 241, 20);
		contentPane.add(textFile);
		textFile.setColumns(10);
	}

}
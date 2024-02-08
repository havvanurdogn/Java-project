import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class StokUygulamasi extends JFrame {

	private JPanel contentPane;
	private JTextField tf_urun_ismi;
	private JTextField tf_fiyat;
	private JTable urun_tablosu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StokUygulamasi frame = new StokUygulamasi();
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
	public StokUygulamasi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 582, 411);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Urun Ismi :");
		lblNewLabel.setBounds(75, 31, 85, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Kategori : ");
		lblNewLabel_1.setBounds(75, 56, 85, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Fiyat : ");
		lblNewLabel_2.setBounds(75, 81, 85, 14);
		contentPane.add(lblNewLabel_2);
		
		tf_urun_ismi = new JTextField();
		tf_urun_ismi.setBounds(170, 28, 86, 20);
		contentPane.add(tf_urun_ismi);
		tf_urun_ismi.setColumns(10);
		
		JComboBox cb_kategori = new JComboBox();
		cb_kategori.setModel(new DefaultComboBoxModel(new String[] {"Kultur Sanat", "Yemek", "Elektronik"}));
		cb_kategori.setBounds(170, 52, 86, 22);
		contentPane.add(cb_kategori);
		
		tf_fiyat = new JTextField();
		tf_fiyat.setBounds(170, 78, 86, 20);
		contentPane.add(tf_fiyat);
		tf_fiyat.setColumns(10);
		
		JLabel mesaj_yazisi = new JLabel("New label");
		mesaj_yazisi.setHorizontalAlignment(SwingConstants.CENTER);
		mesaj_yazisi.setForeground(new Color(255, 0, 0));
		mesaj_yazisi.setBounds(44, 109, 319, 38);
		contentPane.add(mesaj_yazisi);
		
		urun_tablosu = new JTable();
		urun_tablosu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				DefaultTableModel model = (DefaultTableModel) urun_tablosu.getModel();
				
				int secili_row = urun_tablosu.getSelectedRow();
				
				tf_urun_ismi.setText(model.getValueAt(secili_row, 0).toString());
				cb_kategori.setSelectedItem(model.getValueAt(secili_row, 1));
				tf_fiyat.setText(model.getValueAt(secili_row, 2).toString());
				
			}
		});
		urun_tablosu.setModel(new DefaultTableModel(
			new Object[][] {
				{"Urun Ismi", "Kategori", "Fiyat"},
			},
			new String[] {
				"Urun Ismi", "Kategori", "Fiyat"
			}
		));
		urun_tablosu.setBounds(116, 183, 335, 178);
		contentPane.add(urun_tablosu);
		
		JButton ekle_butonu = new JButton("Urun Ekle");
		ekle_butonu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mesaj_yazisi.setText("");
				DefaultTableModel model = (DefaultTableModel) urun_tablosu.getModel();
				
				if(tf_urun_ismi.getText().trim().equals("")) {
					
					mesaj_yazisi.setText("Urun ismi bos birakilamaz...");
				}
				else {
					
					Object[] eklencek = {tf_urun_ismi.getText(),cb_kategori.getSelectedItem().toString(),tf_fiyat.getText()};
					
					model.addRow(eklencek);
				}
			}
		});
		ekle_butonu.setBounds(321, 31, 152, 39);
		contentPane.add(ekle_butonu);
		
		JButton guncelle_butonu = new JButton("Urun Guncelle");
		guncelle_butonu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mesaj_yazisi.setText("");
				DefaultTableModel model = (DefaultTableModel) urun_tablosu.getModel();
				
				int secili_row = urun_tablosu.getSelectedRow();
				
				if(secili_row == -1) {
					
					if(urun_tablosu.getRowCount() == 0) {
						
						mesaj_yazisi.setText("Urun tablosu su anda bos.");
					}
					else {
						
						mesaj_yazisi.setText("Lutfen guncellemek istediginiz urunu secin...");
					}			
				}
				else {
					
					model.setValueAt(tf_urun_ismi.getText(), secili_row, 0);
					model.setValueAt(cb_kategori.getSelectedItem().toString(), secili_row, 1);
					model.setValueAt(tf_fiyat.getText(), secili_row, 2);
			
					
					mesaj_yazisi.setText("Urun basariyla guncellendi.");
				}
				
				
			}
		});
		guncelle_butonu.setBounds(321, 77, 152, 23);
		contentPane.add(guncelle_butonu);
		
		JButton sil_butonu = new JButton("Urun Sil");
		sil_butonu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model = (DefaultTableModel) urun_tablosu.getModel();
				
				int secili_row = urun_tablosu.getSelectedRow();
				
				if(secili_row == -1) {
					
					if(urun_tablosu.getRowCount() == 0) {
						
						mesaj_yazisi.setText("Urun tablosu su anda bos.");
									
					}
					else {
						
						mesaj_yazisi.setText("Lutfen silmek istediginiz urunu seciniz.");
					}
				}
				else {
					
					model.removeRow(secili_row);
					
					mesaj_yazisi.setText("Urun basariyla silindi...");
				}
			}
		});
		sil_butonu.setBounds(321, 117, 152, 23);
		contentPane.add(sil_butonu);
	}
}
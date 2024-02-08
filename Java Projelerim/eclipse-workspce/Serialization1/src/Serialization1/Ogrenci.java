package Serialization1;

import java.io.Serializable;

public class Ogrenci implements Serializable{
	
	private String isim;
	private String bolum;
	private int id;
	
	public Ogrenci(String isim, String bolum, int id) {
		this.isim = isim;
		this.bolum = bolum;
		this.id = id;
	}

	public String toString() {
		String bilgiler = "Ogrenci Adi : " + isim +
						  "\nOgrenci Numarasi : " + id +
						  "\nOgrenci Bolumu : " + bolum + "\n";
		return bilgiler;
	}
	
	

}

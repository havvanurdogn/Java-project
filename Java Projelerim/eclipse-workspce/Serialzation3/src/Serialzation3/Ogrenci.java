package Serialzation3;

import java.io.Serializable;

public class Ogrenci implements Serializable{
	
	private String isim;
	private String bolum;
	private transient int id;
	
	private static int ogrenciGrubu  ;
	
	public static int getOgrenciGrubu() {
		return ogrenciGrubu;
	}
	
	public static void setOgrenciGrubu(int ogrenciGrubu) {
		Ogrenci.ogrenciGrubu = ogrenciGrubu;
	}

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

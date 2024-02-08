package oop_atm;

public class Hesap {
	
	private String kullanici_adi;
	private String parola;
	private float bakiye;


	public Hesap(String kullanici_adi, String parola, float bakiye) {
		this.kullanici_adi = kullanici_adi;
		this.parola = parola;
		this.bakiye = bakiye;
	}


	public String getKullanici_adi() {
		return kullanici_adi;
	}


	public void setKullanici_adi(String kullanici_adi) {
		this.kullanici_adi = kullanici_adi;
	}


	public String getParola() {
		return parola;
	}


	public void setParola(String parola) {
		this.parola = parola;
	}


	public float getBakiye() {
		return bakiye;
	}


	public void setBakiye(float bakiye) {
		this.bakiye = bakiye;
	}
	
	public void ParaYatirma(float tutar) {
		this.bakiye = bakiye + tutar;
		System.out.println("Yeni bakiyeniz : "+bakiye);
	}
	
	public void ParaCekme(float tutar) {
		if(bakiye<tutar) {
			System.out.println("Bakiyeniz Yetersiz...");
		}
		else {
			this.bakiye = bakiye - tutar;
			System.out.println("Yeni bakiyeniz : "+bakiye);
		}
	}


}

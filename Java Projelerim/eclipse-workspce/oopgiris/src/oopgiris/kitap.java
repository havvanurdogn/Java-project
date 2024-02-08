package oopgiris;

public class kitap {
	private int sayfa_sayisi;
	private String adi;
	private String yazari;
	private String yayinevi;
	
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public String getAdi() {
		return this.adi;
	}
	public void setYazari(String yazari) {
		this.yazari = yazari;
	}
	public String getYazari() {
		return this.yazari;
	}
	public void setYayinevi(String yayinevi) {
		this.yayinevi = yayinevi;
	}
	public String getYayinevi() {
		return this.yayinevi;
	}
	public void setSayfa_sayisi(int sayfa_sayisi) {
		if(sayfa_sayisi < 0) {
			System.out.println("Sayfa sayisi 0'dan kucuk olamaz.");
		}
		else {
			this.sayfa_sayisi = sayfa_sayisi;
		}
	}
	public int getSayfa_sayisi() {
		return this.sayfa_sayisi;
	}

}

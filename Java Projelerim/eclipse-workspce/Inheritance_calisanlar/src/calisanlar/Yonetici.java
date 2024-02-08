package calisanlar;

public class Yonetici extends Calisan{
	private int sorumlu_kisi;

	public Yonetici(String ad ,String soyad ,int id , int sorumlu_kisi) {
		super(ad,soyad,id);
		this.sorumlu_kisi = sorumlu_kisi;
		
	}

	
	public void bilgileriGoster() {
		
		super.bilgileriGoster();
		System.out.println("Yoneticinin sorumlu oldugu kisi sayisi : "+sorumlu_kisi);
		
	}
	
	public void zamYap( int zam_miktari) {
		
		System.out.println(getAd() + " calisanlara "+zam_miktari+" tl zam yapiyor.");
	}

}

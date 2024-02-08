package Inheritance ;

public class cicek {
	
	private int boy;
	private int yaprak_sayisi;
	private String tur;
	
	public cicek(int boy , int yaprak_sayisi , String tur) {
		this.boy = boy;
		this.yaprak_sayisi = yaprak_sayisi;
		this.tur = tur;
	}
	
	public int getBoy() {
		return boy;
	}
	public void setBoy(int boy) {
		this.boy = boy;
	}
	
	public int getYaprak_sayisi() {
		return yaprak_sayisi;
	}
	public void setYaprak_sayisi(int yaprak_sayisi) {
		this.yaprak_sayisi = yaprak_sayisi;
	}
	
	public String getTur() {
		return tur;
	}
	public void setTur(String tur) {
		this.tur = tur;
	}
	
	public void yaprakDokulmesi(int yaprak_sayisi) {
		yaprak_sayisi --;
		System.out.println("Yaprak dokuluyor...\nKalan yaprak sayisi : "+yaprak_sayisi);
	}
	
	public void bilgileriGoster() {
		System.out.println("Boy : "+boy);
		System.out.println("Yaprak sayisi : "+yaprak_sayisi);
		System.out.println("Turu : "+tur);
	}

}

package oop_idman;

public class Idman {
	
	private  int burpee_sayisi;
	private int pushup_sayisi;
	private int situp_sayisi;
	private int squat_sayisi;
	
	public Idman(int burpee_sayisi, int pushup_sayisi, int situp_sayisi, int squat_sayisi) {
		
		this.burpee_sayisi = burpee_sayisi;
		this.pushup_sayisi = pushup_sayisi;
		this.situp_sayisi = situp_sayisi;
		this.squat_sayisi = squat_sayisi;
	}
	
	public int getBurpee_sayisi() {
		return burpee_sayisi;
	}
	public void setBurpee_sayisi (int burpee_sayisi) {
		this.burpee_sayisi = burpee_sayisi;
	}
	
	public int getPushup_sayisi() {
		return pushup_sayisi;
	}
	public void setPushup_sayisi(int pushup_sayisi) {
		this.pushup_sayisi = pushup_sayisi;
	}
	
	public int getSitup_sayisi() {
		return situp_sayisi;
	}
	public void setSitup_sayisi(int situp_sayisi) {
		this.situp_sayisi = situp_sayisi;
	}
	
	public int getSquat_sayisi() {
		return squat_sayisi;
	}
	public void setSquat_sayisi(int squat_sayisi) {
		this.squat_sayisi = squat_sayisi;
	}
	
	public void hareketYap(String hareket_turu , int sayi) {
		if(hareket_turu.equals("Burpee")) {
			burpeeYap(sayi);
		}
		else if(hareket_turu.equals("Pushup")) {
			pushupYap(sayi);
		}
		else if(hareket_turu.equals("Situp")) {
			situpYap(sayi);
		}
		else if(hareket_turu.equals("Squat")) {
			squatYap(sayi);
		}
		else {
			System.out.println("Gecersiz hareket turu...");
		}
	}
	
	public void burpeeYap(int sayi) {
		if(burpee_sayisi == sayi) {
			System.out.println("Yapacak burpee kalmadi.");
			
		}
		if(burpee_sayisi < sayi) {
			System.out.println("Tebrikler gerekenden fazla burpee yaptiniz.");
			burpee_sayisi = 0;
			System.out.println("Kalan burpee sayisi : "+burpee_sayisi);
		}
		else {
			burpee_sayisi -= sayi;
			System.out.println("Kalan burpee sayisi : "+burpee_sayisi);
		}
	}
	public void pushupYap( int sayi) {
		if(pushup_sayisi == sayi) {
			System.out.println("Yapacak pushup kalmadi.");
			
		}
		if(pushup_sayisi < sayi) {
			System.out.println("Tebrikler gerekenden fazla pushup yaptiniz.");
			pushup_sayisi = 0;
			System.out.println("Kalan pushup sayisi : "+pushup_sayisi);
		}
		else {
			pushup_sayisi -= sayi;
			System.out.println("Kalan pushup sayisi : " + pushup_sayisi);
		}
	}
	public void situpYap( int sayi) {
		if(situp_sayisi == sayi) {
			System.out.println("Yapacak situp kalmadi.");
			
		}
		if(situp_sayisi < sayi) {
			System.out.println("Tebrikler gerekenden fazla situp yaptiniz.");
			situp_sayisi = 0;
			System.out.println("Kalan situp sayisi : "+situp_sayisi);
		}
		else {
			situp_sayisi -= sayi;
			System.out.println("Kalan situp sayisi : " + situp_sayisi);
		}
	}
	public void squatYap( int sayi) {
		if(squat_sayisi == sayi) {
			System.out.println("Yapacak squat kalmadi.");
			
		}
		if(squat_sayisi < sayi) {
			System.out.println("Tebrikler gerekenden fazla squat yaptiniz.");
			squat_sayisi = 0;
			System.out.println("Kalan squat  sayisi : "+squat_sayisi);
		}
		else {
			squat_sayisi -= sayi;
			System.out.println("Kalan squat sayisi : " + squat_sayisi);
		}
	}
	
	public boolean idmanBittiMi() {
		return (burpee_sayisi == 0) &&  (pushup_sayisi == 0)&& (situp_sayisi == 0) && (squat_sayisi == 0);
	}
	

}

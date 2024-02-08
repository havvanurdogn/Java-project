package oop_atm;

public class Main {

	public static void main(String[] args) {
		Atm atm = new Atm();
		Hesap hesap = new Hesap("havvanurdogan","8520",5000);
		atm.calis(hesap);
		
		System.out.println("Programdan cikiliyor...");

	}

}

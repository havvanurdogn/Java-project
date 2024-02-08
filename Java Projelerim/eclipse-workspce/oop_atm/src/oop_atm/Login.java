package oop_atm;
import java.util.Scanner;
public class Login {
	
	public boolean login (Hesap hesap) {
		Scanner read = new Scanner(System.in);
		String kullanici_adi;
		String parola;
		System.out.print("Kullanici adini giriniz : ");
		kullanici_adi = read.nextLine();
		System.out.print("Parolayi giriniz : ");
		parola = read.nextLine();
		
		if(hesap.getKullanici_adi().equals(kullanici_adi) && hesap.getParola().equals(parola)) {
			return true;
		}
		else return false ;
	}

}

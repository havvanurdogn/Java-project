package oop_atm;
import java.util.Scanner;
public class Atm {
	
	public void calis(Hesap hesap) {
		Scanner read = new Scanner(System.in);
		Login login = new Login();
		System.out.println("******************************************");
		System.out.println("Bankamiza Hosgeldiniz...");
		System.out.println("******************************************");
		System.out.println("Kullanici Girisi");
		System.out.println("******************************************");
		int giris_hakki = 3;
		while(true) {
			if(login.login(hesap)) {
			     System.out.println("Giris Basarili");
			     break;
			}
			else {
				System.out.println("Hatali giris yaptiniz.");
				giris_hakki --;
				System.out.println("Kalan giris hakkiniz : " + giris_hakki);
			}
			if(giris_hakki == 0 ) {
				System.out.println("Giris hakkiniz bitti...");
				return;
			}
			
		}
		String islemler = "1.Bakiye Sorgulama\n"
				        + "2.Para Yatirma\n"
				        + "3.Para Cekme\n"
				        + "Cikmak icin q'ya basiniz.";
		System.out.println("******************************************");
		System.out.println(islemler);
		System.out.println("******************************************");
		
		while(true) {
			System.out.print("Lutfen yapmak istediginiz islemi seciniz:");
			String islem = read.nextLine();
			if(islem.equals("q")) {
				break;
			}
			else if(islem.equals("1")) {
				System.out.println("Bakiyeniz : " + hesap.getBakiye());
			}
			else if(islem.equals("2")) {
				System.out.print("Lutfen yatirmak istediginiz tutari giriniz:");
				float tutar = read.nextFloat();
				read.nextLine();
				hesap.ParaYatirma(tutar);
				
			}
			else if(islem.equals("3")) {
				System.out.print("Lutfen cekmek istediginiz tutari giriniz : ");
				float tutar = read.nextFloat();
				read.nextLine();
				hesap.ParaCekme(tutar);
			}
			else {
				System.out.println("Gecersiz islem...");
			}
		}
		
		
		
	}

}

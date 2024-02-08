package calisanlar;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Calisanlar Sistemine Hosgeldiniz...");
		String islemler = "Islemler : \n"
				        + "1.Yazilimci Islemleri\n"
				        + "2.Yonetici Islemleri\n"
				        + "Cikmak icin q'ya basiniz.";
		System.out.println("**********************************************");
		System.out.println(islemler);
		System.out.println("**********************************************");
		while(true) {
			System.out.print("Islemi giriniz:");
			String islem = read.nextLine();
			
			if(islem.equals("q")) {
				System.out.println("Sistemden cikiliyor...");
				break;
			}
			
			else if(islem.equals("1")) {
				System.out.println("Yazilimci Islemlerine Hosgeldiniz...");
				Yazilimci yazilimci = new Yazilimci("Sabiha","Gokcen",789,"Java , C , PHP");
				String yazilimci_islem = "Islemler : \n"
						               + "1.Format Atma Islemleri\n"
						               + "2.Bilgileri Goster\n"
						               + "Cikmak icin q'ya basiniz.";
			    System.out.println("**********************************************");
				System.out.println(yazilimci_islem);
				 System.out.println("**********************************************");
				 
				 while(true) {
					 System.out.print("Islemi giriniz : ");
					 String y_islem = read.nextLine();
					 
					 if(y_islem.equals("q")) {
						 System.out.println("Yazilimci Islemlerinden Cikiliyor...");
						 break;
					 }
					 
					 else if(y_islem.equals("1")) {
						 System.out.println("Format atmak istediginiz isletim sistemini giriniz : ");
						 String isletim_sistemi = read.nextLine();
						 yazilimci.formatAt(isletim_sistemi);
					
					 }
					 
					 else if(y_islem.equals("2")) {
						 System.out.println("Yazilimci bilgileri gosteriliyor...");
						 yazilimci.bilgileriGoster();
					 }
					 
					 else {
						 System.out.println("Gecersiz Yazilimci Islemi...");
					 }
				 }
			}
			
			else if(islem.equals("2")) {
				System.out.println("Yonetici Islemlerine Hosgeldiniz...");
				Yonetici yonetici = new Yonetici("Selim","Yavuz",456,40);
				String yonetici_islem = "Islemler : \n"
						              + "1.Zam Yapma Islemleri\n"
						              + "2.Bilgileri Goster\n"
						              + "Cikmak icin q'ya basiniz.";
				 System.out.println("**********************************************");
				 System.out.println(yonetici_islem);
				 System.out.println("**********************************************");
				 while (true) {
					 System.out.println("Islemi giriniz : ");
					 String y_islem = read.nextLine();
					 
					 if(y_islem.equals("q")) {
						 System.out.println("Yonetici Sisteminden Cikiliyor...");
						 break;
					 }
					 
					 else if(y_islem.equals("1")) {
						 System.out.println("Zam yapmak istediginiz miktari giriniz : ");
						 int zam_miktari = read.nextInt();
						 read.nextLine();
						 yonetici.zamYap(zam_miktari);
					 }
					 
					 else if(y_islem.equals("2")) {
						 System.out.println("Yonetici bilgileri gosteriliyor...");
						 yonetici.bilgileriGoster();
						 
					 }
					 
					 else {
						 System.out.println("Gecersiz Yonetici Islemi...");
					 }
				 }
			}
			
			else System.out.println("Gecersiz islem...");
		}

	}

}

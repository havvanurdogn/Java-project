package array;
import java.util.Scanner;
public class SarkiciListesiTest {
	
	private static SarkiciListele sarkicilar = new SarkiciListele();
	private static Scanner read = new Scanner(System.in); 
	
	public static void IslemleriGoruntule() {
		String islemler = "\t 0.Islemleri Goruntule \n"
				+"\t 1.Sarkici Listesini Goruntule \n"
				+"\t 2.Sarkici Ekle \n"
				+"\t 3.Sarkici Cikar \n"
				+"\t 4.Sarkici Guncelle \n"
				+"\t 5.Sarkici Ara \n"
				+"\t 6.Uygulamadan Cik ";
		System.out.println("\t Islemler : ");
		System.out.println(islemler);
		System.out.println("\t______________________________________________________________________");
	}
	
	public static void ListeGoruntule() {
		sarkicilar.sarkici_yazdir();
	}
	
	public static void Ekle() {
		String isim;
		System.out.print("Lutfen listenize eklemek istediginiz sarkicinin adini giriniz :");
		isim =read.nextLine();
		sarkicilar.sarkici_ekle(isim);
	}
	
	public static void Cikar() {
		System.out.print("Lutfen listeden cikarmak istediginiz sarkicinin adini giriniz:"); 
		String isim = read.nextLine();
		sarkicilar.sarkici_sil(isim);
	}
	
	public static void Guncelle() {
		System.out.print("Guncellemek istediginiz sarkicinin sirasini giriniz : ");
		int sira = read.nextInt();
		read.nextLine();
		System.out.print("Guncellemek istediginiz yeni sarkicinin adini giriniz : ");
		String isim = read.nextLine();
		sarkicilar.sarkici_guncelle(isim, (sira-1));
	}
	
	public static void Ara() {
		System.out.print("Aramak istediginiz sarkicinin adini giriniz : ");
		String isim = read.nextLine();
		sarkicilar.sarkici_ara(isim);
	}
	public static void main(String [] args) {
		System.out.println("\t Sarkici Listeleme Uygulamasina Hos Geldiniz...");
		System.out.println("\t______________________________________________________________________");
		int islem;
		boolean cikis = false ;
		IslemleriGoruntule();
		while(!cikis) {
			
			System.out.print("Lutfen yapmak istediginiz islemin numarasini giriniz : ");
			islem = read.nextInt();
			read.nextLine();
			
			switch(islem) {
			case 0 :
				IslemleriGoruntule();
				break;
			case 1 :
				ListeGoruntule();
				break;
			case 2 :
				Ekle();
				break;
			case 3 : 
				Cikar();
				break;
			case 4 :
				Guncelle();
				break;
			case 5 : 
				Ara();
				break;
			case 6 :
				System.out.println("Uygulamadan Cikiliyor.");
				cikis = true;
				break;
			default : 
				System.out.println("Gecersiz islem...\nLutfen gecerli bir islem numarasi giriniz.");
				break;
				
			}
		}
		
		
	}

}

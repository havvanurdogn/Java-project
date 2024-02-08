package HafizaOyunuKaydet;
import java.io.File;
import java.util.Scanner;
public class HafizaOyunu {
	private static Kartlar[][] kartlar = new Kartlar[4][4];
	
	public static void kayittanAl() {
		Scanner read = new Scanner(System.in);
		File file = new File("kayit2.bin");
		
		if(file.exists()) {
			System.out.print("Kaydedilmis bir oyununuz bulunmakta kayittan devam etmek ister misiniz?(yes or no)");
			String cevap2 = read.nextLine();
			if(cevap2.equals("yes")) {
				kartlar = OyunKayit.kayittanAl();
				return;
			}
			
		}
		kartlar[0][0] = new Kartlar('E');
		kartlar[0][1] = new Kartlar('A');
		kartlar[0][2] = new Kartlar('B');
		kartlar[0][3] = new Kartlar('F');
		kartlar[1][0] = new Kartlar('G');
		kartlar[1][1] = new Kartlar('A');
		kartlar[1][2] = new Kartlar('D');
		kartlar[1][3] = new Kartlar('H');
		kartlar[2][0] = new Kartlar('F');
		kartlar[2][1] = new Kartlar('C');
		kartlar[2][2] = new Kartlar('D');
		kartlar[2][3] = new Kartlar('H');
		kartlar[3][0] = new Kartlar('E');
		kartlar[3][1] = new Kartlar('G');
		kartlar[3][2] = new Kartlar('B');
		kartlar[3][3] = new Kartlar('C');
		
	}
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		kayittanAl();
		
		
		while(OyunBittiMi() == false) {
			
			OyunTahtasi();
			
			System.out.print("Cikis yapmak istiyor musunuz? (yes or no)");
			String cevap = read.nextLine();
			if(cevap.equals("yes")) {
				System.out.print("Oyununuzu kaydetmek istiyor musunuz? (yes or no)");
				String cevap1 = read.nextLine();
				if(cevap1.equals("yes")) {
					OyunKayit.oyunuKaydet(kartlar);
				}
				else {
					System.out.println("Oyun kaydedilemedi.");
				}
				System.out.println("Oyundan Cikiliyor...");
				break;
			}
			
			
			TahminEt();
		}
		
		
	}
	
	
	public static boolean OyunBittiMi() {
		for(int i = 0 ; i < 4 ; i++) {
			for(int j = 0 ; j < 4 ; j++) {
				if(kartlar[i][j].isTahmin() == false) {
					return false;
				}
			}
		}
		return true;
	}
	
	
	public static void TahminEt() {
		Scanner read = new Scanner(System.in);
		System.out.print("Birinci tahmini giriniz(i ve j sayilarini birer bosluk birakarak giriniz)  : ");
		int i1 = read.nextInt();
		int j1 = read.nextInt();
		
		kartlar[i1][j1].setTahmin(true);
		OyunTahtasi();
		
		System.out.print("Ikinci tahmini giriniz(i ve j sayilarini birer bosluk birakarak giriniz)  : ");
		int i2 = read.nextInt();
		int j2 = read.nextInt();
		
		if(kartlar[i1][j1].getDeger() == kartlar[i2][j2].getDeger()) {
			
			kartlar[i2][j2].setTahmin(true);
			OyunTahtasi();
			System.out.println("Tebrikler! Dogru Tahmin.");
		}
		else {
			
			kartlar[i1][j1].setTahmin(false);
			System.out.println("Yanlis Tahmin...");
			OyunTahtasi();
		}
	}
	
	
	public static void OyunTahtasi() {
		for(int i = 0 ; i < 4 ; i++) {
			System.out.println("----------------------------");
			for(int j = 0; j < 4 ; j++) {
				
				if(kartlar[i][j].isTahmin()) {
					System.out.print(" | "+kartlar[i][j].getDeger()+" |  ");
				}
				else {
					System.out.print(" |   |  ");
				}
			}
			System.out.println();
		}
		System.out.println("----------------------------");
	}

}

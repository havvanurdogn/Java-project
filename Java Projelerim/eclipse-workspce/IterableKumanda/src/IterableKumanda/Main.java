package IterableKumanda;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		System.out.println("KUMANDA PROGRAMINA HOS GELDINIZ:::");
		Scanner read = new Scanner(System.in);
		String islemler = "Islemler : \n"
				        + "1. Kanallari Goster\n"
				        + "2. Kanal Ekle\n"
				        + "3. Kanal Sil\n"
				        + "4. Kanal Sayisini Goster\n"
				        + "5. Kanal Ac\n"
				        + "Cikis icin q'ya basiniz...\n";
		Kumanda kumanda = new Kumanda();
		while(true) {
			System.out.println("*********************************************");
			System.out.print(islemler);
			System.out.println("*********************************************");
			System.out.print("Lutfen yapmak istediginiz islemin numarasini giriniz : ");
			String islem = read.nextLine();
			
			if(islem.equals("q")) {
				System.out.println("Programdan cikiliyor...");
				break;
			}
			
			else if (islem.equals("1")) {
				kumanda.kanallari_goster();
			}

			else if (islem.equals("2")) {
				System.out.print("Lutfen eklemek istediginiz kanalin adini yaziniz : ");
				String kanal = read.nextLine();
				kumanda.kanal_ekle(kanal);
			}

			else if (islem.equals("3")) {
				System.out.print("Lutfen silmek istediginiz kanalin adini yaziniz : ");
				String kanal = read.nextLine();
				kumanda.kanal_sil(kanal);
			}

			else if (islem.equals("4")) {
				System.out.println("Kanal sayisi : "+kumanda.kanal_sayisi());
			}
			
			else if (islem.equals("5")) {
				kumanda.kanallari_goster();
				System.out.print("Lutfen acmak istediginiz kanalin numarasini giriniz : ");
				int kanalNo = read.nextInt();
				read.nextLine();
				kanalNo--;
				kumanda.kanal_ac(kanalNo);
				
			}
			
			else {
				System.out.println("Gecersiz Islem...");
			}
			
		}
	}

}

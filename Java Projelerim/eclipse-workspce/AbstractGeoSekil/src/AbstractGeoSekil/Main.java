package AbstractGeoSekil;
import java.util.*;
//import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
     
		Scanner read = new Scanner(System.in);
		
		String islemler = "Islemler : \n"
		              +"1. Ucgenin Alanini Hesapla \n"
				      +"2. Karenin Alanini Hesapla \n"
		              +"3. Dairenin Alanini Hesapla \n"
				      +"Cikis yapmak icin q'ya basiniz.";
		Sekil sekil = null;
		
		System.out.println("ALAN HESAPLAMA UYGULAMASINA HOS GELDINIZ :::");
		
		while(true) {
			System.out.println("*********************************************");
			System.out.println(islemler);
			System.out.println("*********************************************");

			System.out.print("Lutfen yapmak istediginiz islemi giriniz : ");
			String islem = read.nextLine();
			
			if(islem.equals("q")) {
				System.out.println("Sistemden cikis yapiliyor...");
				break;
			}
			else if(islem.equals("1")) {
				System.out.print("Lutfen ucgenin kenarlarini sirasiyla giriniz(ornek : 1 1 1) : ");
				int a = read.nextInt();
				int b = read.nextInt();
				int c = read.nextInt();
				read.nextLine();
				sekil = new Ucgen("Ucgen1",a,b,c);
				sekil.alanHesaplama();
			}
			else if(islem.equals("2")) {
				System.out.print("Lutfen karenin kenarini giriniz : ");
				int kenar = read.nextInt();
				read.nextLine();
				sekil = new Kare("Kare1",kenar);
				sekil.alanHesaplama();
			}
			else if(islem.equals("3")) {
				System.out.print("Lutfen dairenin yaricapini giriniz : ");
				int yaricap = read.nextInt();
				read.nextLine();
				sekil = new Daire("Daire1",yaricap);
				sekil.alanHesaplama();
			}
			else {
				System.out.println("Gecersiz islem...");
			}
		}
		
	}

}

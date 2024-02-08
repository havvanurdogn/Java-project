package InnerClassesExample;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		String islemler = "Islemler : \n"
						+ "1. Daire Alani Hesaplama\n"
						+ "2. Ucgenin Cevresini Hesaplama\n"
						+ "3. Iki Vektorun Ic Carpimlarini Hesaplama\n"
						+ "Cikis icin q'ya basiniz.";
		System.out.println("MATEMATIK VE FIZIK PROBLEMLERI HESAPLAMA PROGRAMINA HOS GELDINIZ :::");
		
		while(true) {
			System.out.println("***********************************************************************");
			System.out.println(islemler);
			System.out.println("***********************************************************************");
			System.out.print("Lutfen yapmak istediginiz islemi giriniz : ");
			String islem = read.nextLine();
			
			if(islem.equals("q")) {
				System.out.println("Programdan cikiliyor...\nHOSCA KALIN. IYI GUNLER...");
				break;
			}
			else if(islem.equals("1")) {
				System.out.print("Lutfen dairenin yaricapini giriniz : ");
				int yaricap = read.nextInt();
				read.nextLine();
				Problem.Matematik.daireAlani(yaricap);
			}
			else if(islem.equals("2")) {
				System.out.println("Lutfen hesaplamak istediginiz ucgenin kenarlarini sirasiyla giriniz.");
				System.out.print("Kenar 1 :");
				int a = read.nextInt();
				System.out.print("Kenar 2 :");
				int b = read.nextInt();
				System.out.print("Kenar 3 :");
				int c = read.nextInt();
				read.nextLine();
				Problem.Matematik.ucgenCevre(a, b, c);
			}
			else if(islem.equals("3")) {
				Vec vec1 = new Vec("Vektor 1");
				Vec vec2 = new Vec("Vektor 2");
				Problem.Fizik.icCarpim(vec1, vec2);
			}
			else {
				System.out.println("Gecersiz Islem...");
			}
		}
	}

}

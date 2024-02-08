package calisma;
import java.util.Scanner;
public class atm {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("****************************");
		String islem = "1.Bakiye Ogrenme\n"
				+"2.Para Cekme\n"
				+"3.Para Yatirma\n"
				+"Cikmak icin q'a basiniz.";
		System.out.println(islem);
		System.out.println("****************************");
		int bakiye=2000;
		while(true) {
			System.out.print("Islemi giriniz:");
			String i=read.nextLine();
			if(i.equals("q")) {
				System.out.println("Cikis yapiliyor...");
				break;
			}
			else if(i.equals("1")) {
				System.out.println("Bakiyeniz: "+bakiye);
			}
			else if(i.equals("2")) {
				System.out.print("Lutfen cekmek istediginiz tutari giriniz:");
				int x=read.nextInt();
				read.nextLine();
				if(x>bakiye) System.out.println("Yetersiz bakiye...\nBakiyeniz: "+bakiye);
				else {
					bakiye -=x;
					System.out.println("Yeni bakiyeniz: "+bakiye);
				}
			}
			else if(i.equals("3"))
			{
				System.out.print("Lutfen yatirmak istediginiz tutari giriniz:");
				int y=read.nextInt();
				read.nextLine();
				bakiye += y;
				System.out.println("Yeni bakiyeniz: "+bakiye);
			}
			else {
				System.out.println("Gecersiz islem:::");
			}
				
		}
		

	}

}

package StaticOlmayanInner;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		Matematik.Factorial factorial = new Matematik().new Factorial();
		Matematik.Asal asal = new Matematik().new Asal();
		Matematik.Alan.DaireAlan daireAlan = new Matematik().new Alan().new DaireAlan();
		
		factorial.faktoriyel();
		
		System.out.print("Lutfen bir sayi giriniz : ");
		int sayi = read.nextInt();
		if(asal.asal_mi(sayi)) {
			System.out.println(sayi+" sayisi asaldir.");
		}
		else {
			System.out.println(sayi+" sayisi asal degildir.");
		}
		
		daireAlan.alan_hesapla();
		
	}

}

package oopgiris;
import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		kitap kitap1 = new kitap();
		int syf;
		System.out.print("lutfen kitabin sayfa sayisini giriniz:");
		syf = read.nextInt() ;
		kitap1.setSayfa_sayisi(syf);
		System.out.println("Kitabin sayfa sayisi: "+kitap1.getSayfa_sayisi());

	}

}

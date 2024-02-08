package Inheritance;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		cicek cicek1 = new cicek(20,12,"Lale");
		Papatya papatya = new Papatya(5,10,"Papatya","Beyaz");
		papatya.bilgileriGoster();
		//cicek1.yaprakDokulmesi(12);

	}

}

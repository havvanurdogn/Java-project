package oop_idman;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Idman programina hosgeldiniz...");
		String idmanlar = "Gecerli Idmanlar...\n"
				        + "Burpee\n"
				        + "Pushup\n"
				        + "Situp\n"
				        + "Squat\n";
		System.out.println(idmanlar);
		System.out.println("Bir idman olusturunuz...");
		System.out.print("Burpee sayisi : ");
		int burpee_sayisi = read.nextInt();
		System.out.print("Pushup sayisi : ");
		int pushup_sayisi = read.nextInt();
		System.out.print("Situp sayisi : ");
		int situp_sayisi = read.nextInt();
		System.out.print("Squat sayisi : ");
		int squat_sayisi = read.nextInt();
		
		read.nextLine();
		
		Idman idman = new Idman(burpee_sayisi,pushup_sayisi,situp_sayisi,squat_sayisi);
		while(idman.idmanBittiMi() == false) {
			System.out.print("Hareket turunu giriniz(Burpee,Pushup,Situp,Squat) : ");
			String tur = read.nextLine();
			System.out.print("Kac tane yapacaginizi giriniz : ");
			int sayi = read.nextInt();
			read.nextLine();
			idman.hareketYap(tur, sayi);
		}
		System.out.println("Idmaniniz sona erdi.\nIyi gunler...");
		

	}

}

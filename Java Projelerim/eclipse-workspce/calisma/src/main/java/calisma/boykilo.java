package calisma;
import java.util.Scanner;
public class boykilo {
	public static void main(String[]args)
	{
		float boy,kilo,indeks;
		Scanner read= new Scanner(System.in);
		System.out.println("Vucut indeksi hesapla.");
		System.out.println("Lutfen boyunuzu giriniz(m):");
		boy=read.nextFloat();
		System.out.println("Lutfen kilonuzu giriniz:");
		kilo=read.nextFloat();
		indeks=kilo/(boy*boy);
		System.out.println("Vucut indeksiniz: "+indeks);
		
	}

}

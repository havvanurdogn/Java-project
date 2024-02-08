package DosyadanNotOkuma;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	
	
	
public static String harfNotuHesaplama( int vize1 , int vize2 , int finalnot) {
		
		String cikti;
		double harfNotu = (vize1 * 3 / 10.0 ) + (vize2 * 3 / 10.0) + (finalnot * 4 / 10.0);
		
		if(harfNotu >= 90) {
			return cikti = "AA";
		}
		if(harfNotu >= 85) {
			return cikti = "BA";
		}
		if(harfNotu >= 80) {
			return cikti = "BB";
		}
		if(harfNotu >= 75) {
			return cikti = "CB";
		}
		if(harfNotu >= 70) {
			return cikti = "CC";
		}
		if(harfNotu >= 65) {
			return cikti = "DC";
		}
		if(harfNotu >= 60) {
			return cikti = "DD";
		}
		if(harfNotu >= 55) {
			return cikti = "FD";
		}
		else {
			return cikti = "FF";
		}
		
		
	}

	public static void main(String[] args) {
		
		try(Scanner read = new Scanner(new FileReader("dosya.txt"));
			FileWriter writer = new FileWriter("harfNotu.txt")){
			
			while(read.hasNextLine()) {
				String ogrenciBilgisi = read.nextLine();
				String[] array = ogrenciBilgisi.split(",");
				
				int vize1 = Integer.valueOf(array[1]);
				int vize2 = Integer.valueOf(array[2]);
				int finalnot = Integer.valueOf(array[3]);
				
				writer.write("Isim : " + array[0] + " || Harf Notu : " + harfNotuHesaplama(vize1, vize2, finalnot) + "\n");
				
				String harfNot = harfNotuHesaplama(vize1 , vize2 , finalnot);
				
				
			}
			
			
			
			
		} 
		catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadi...");
		} 
		catch (IOException e1) {
			System.out.println("Dosya olusturulurken hata olustu...");
		}
		
	}

}

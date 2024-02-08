package DosyadanNotOkuma;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class But {
	
public static void buteGirebilecekOgr( String isim , String harfNotu ) {
		
		
		if(harfNotu.equals("FF") || harfNotu.equals("FD") || harfNotu.equals("DD") || harfNotu.equals("DC")) {
			System.out.println(isim);
		}
		
		
	}

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
		
		try(Scanner read2 = new Scanner(new FileReader("dosya.txt"))){
			
			System.out.println("Bute Girmeye Hak Kazanan Ogrenciler : ");
			while(read2.hasNextLine()) {
				String ogrenciBilgisi = read2.nextLine();
				String[] array = ogrenciBilgisi.split(",");
				
				int vize1 = Integer.valueOf(array[1]);
				int vize2 = Integer.valueOf(array[2]);
				int finalnot = Integer.valueOf(array[3]);
				
				String harfNot = harfNotuHesaplama(vize1 , vize2 , finalnot);
				
				buteGirebilecekOgr(array[0], harfNot);
				
				
			}
		} 
		catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadi...");
		}
	}

}

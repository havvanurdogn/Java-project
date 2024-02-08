package MP3Kopyalama;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	private static ArrayList<Integer> icerik = new ArrayList<Integer>();
	
	public static void dosyaOku() {
		
		try {
			FileInputStream fis = new FileInputStream("sarki.mp3");
			int deger;
			while((deger = fis.read()) != -1) {
				icerik.add(deger);
			}
		} 
		catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadi...");
		} 
		catch (IOException e) {
			System.out.println("Dosya okunurken hata olustu...");
		}
		
	}
	
	public static void kopyala(String dosyaIsmi) {
		
		try {
			FileOutputStream fos = new FileOutputStream(dosyaIsmi);
			
			for(int deger : icerik) {
				fos.write(deger);
			}
			
		} 
		catch (FileNotFoundException e) {
			System.out.println("Dosya olusturulamadi...");
		} 
		catch (IOException e) {
			System.out.println("Dosya olusturulurken hata olustu...");
		}
		
	}
	
	public static void main(String[] args) {
		
		long baslangic = System.currentTimeMillis();
		dosyaOku();
		kopyala("sarki2.mp3");
		//kopyala("sarki3.mp3");
		long bitis = System.currentTimeMillis();
		
		System.out.println("Sarkinin kopyalanmasi "+((bitis - baslangic) / 1000)+" saniye surdu.");
		
	}
}

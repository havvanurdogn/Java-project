package ThreadMp3Copy;

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
		dosyaOku();
		
		
		Thread t1 = new Thread(new Runnable() {
			
			public void run() {
				kopyala("sarki2.mp3");
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			public void run() {
				kopyala("sarki3.mp3");
			}
		});
		
		Thread t3 = new Thread(new Runnable() {
			
			public void run() {
				kopyala("sarki4.mp3");
			}
		});
		
		
		Thread t4 = new Thread(new Runnable() {
	
			public void run() {
				kopyala("sarki5.mp3");
			}
		});
		Thread t5 = new Thread(new Runnable() {
	
			public void run() {
				kopyala("sarki6.mp3");
			}
		});	
		Thread t6 = new Thread(new Runnable() {
	
			public void run() {
				kopyala("sarki7.mp3");
			}
		});
		Thread t7 = new Thread(new Runnable() {
	
			public void run() {
				kopyala("sarki8.mp3");
			}
		});
		Thread t8 = new Thread(new Runnable() {
		
			public void run() {
				kopyala("sarki9.mp3");
			}
		});
		Thread t9 = new Thread(new Runnable() {
		
			public void run() {
				kopyala("sarki10.mp3");
			}
		});
		Thread t10 = new Thread(new Runnable() {
		
			public void run() {
				kopyala("sarki11.mp3");
			}
		});
		
		long baslangic = System.currentTimeMillis();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
			t6.join();
			t7.join();
			t8.join();
			t9.join();
			t10.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long bitis = System.currentTimeMillis();
		
		System.out.println("Sarkinin kopyalanmasi "+((bitis - baslangic) / 1000)+" saniye surdu.");
		
	}
}

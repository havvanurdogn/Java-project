package FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("dosya.txt");
			
			int deger,sayac = 1;
			String s = "\n";
			
			fis.skip(5);
			
			while((deger = fis.read()) != -1) {
				
				if((char) deger == ' ') {
					s += "\n";
				}
				else {
					s += (char) deger;
				}
				
				
			}
			System.out.println(" 5 Karakter sonraki Dosya icerigi : "+s);
			
			/*while((deger = fis.read()) != -1) {
				if((char) deger == ' ') {
					sayac ++;
				}
			}
			System.out.println("Dosyada "+sayac+" adet kelime bulunuyor.");*/
		} 
		catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadi...");
		} 
		
		catch (IOException e) {
			System.out.println("Dosya okunurken hata olustu...");
		}
        finally {
			 
				try {
					if(fis != null) {
					fis.close();
					}
				} 
				catch (IOException e) {
					System.out.println("Dosya kapatilirken sorun olustu...");
				}
			
		}
		
	}

}

package HafizaOyunuKaydet;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

public class OyunKayit {
	
	public static void oyunuKaydet(Kartlar[][] kartlar) {
		
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("kayit2.bin"))){
			
			System.out.println("Oyun Kaydediliyor...");
			out.writeObject(kartlar);
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadi.");
		} catch (IOException e) {
			System.out.println("IO Exception hatasi olustu.");
		}
		
	}
	
	public static Kartlar[][] kayittanAl(){
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("kayit2.bin"))){
			
			Kartlar[][] cikti = (Kartlar[][]) in.readObject();
			return cikti;
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadi.");
		} catch (IOException e) {
			System.out.println("IO Exception hatasi olustu.");
		} catch (ClassNotFoundException e) {
			System.out.println("Sinif bulunamadi.");
		}
		
		return null;
	}

}

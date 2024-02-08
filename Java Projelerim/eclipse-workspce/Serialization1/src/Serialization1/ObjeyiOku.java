package Serialization1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjeyiOku {

	public static void main(String[] args) {
		
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("ogrenci.bin"))){
			
			Ogrenci ogrenci1 = (Ogrenci) in.readObject();
			Ogrenci ogrenci2 = (Ogrenci) in.readObject();
			
			System.out.println("*******************************");
			System.out.print(ogrenci1);
			System.out.println("*******************************");
			System.out.print(ogrenci2);
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadi....");
		} catch (IOException e) {
			System.out.println("Dosya acilirken IOException olustu...");
		} catch (ClassNotFoundException e) {
			System.out.println("Sinif bulunamadi...");
		}

	}

}

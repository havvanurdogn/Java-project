package Serialzation3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjeyiYaz {

	public static void main(String[] args) {
		
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrenci.bin"))){
			
			Ogrenci ogrenci1 = new Ogrenci("Kenan Evren", "Siyasi Bilimler", 52364);
			Ogrenci.setOgrenciGrubu(100);
			out.writeObject(ogrenci1);
			
			
			
		
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadi...");
		} catch (IOException e) {
			System.out.println("Dosya acilirken IOException olustu...");
		}

	}

}

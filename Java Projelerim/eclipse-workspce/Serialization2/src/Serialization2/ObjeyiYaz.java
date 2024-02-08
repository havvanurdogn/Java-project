package Serialization2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjeyiYaz {

	public static void main(String[] args) {
		
		Ogrenci ogrenci1 = new Ogrenci("Kenan Evren", "Siyasi Bilimler", 52364);
		Ogrenci ogrenci2 = new Ogrenci("Bilge Kahraman", "Ekonomi", 75456);
		Ogrenci ogrenci3 = new Ogrenci("Mustafa Murat", "Bilgisayar Muhendisligi", 14579);
		
		Ogrenci[] ogrenciArray = {ogrenci1,ogrenci2,ogrenci3};
		ArrayList<Ogrenci> ogrenciList = new ArrayList<Ogrenci>(Arrays.asList(ogrenciArray));
		
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrenciler.bin"))){
			
			
			out.writeObject(ogrenciArray);
			out.writeObject(ogrenciList);
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadi...");
		} catch (IOException e) {
			System.out.println("Dosya acilirken IOException olustu...");
		}

	}

}

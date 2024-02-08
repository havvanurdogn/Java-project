package Serialization2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjeyiOku {

	public static void main(String[] args) {
		
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("ogrenciler.bin"))){
			
			Ogrenci[] ogrenciArray = (Ogrenci[]) in.readObject();
			ArrayList<Ogrenci> ogrenciList = (ArrayList<Ogrenci>) in.readObject();
			
			System.out.println("*******************************************");
			for(Ogrenci o : ogrenciArray) {
				System.out.println(o);
				System.out.println("--------------------------------");
			}
			
			System.out.println("*******************************************");
			for(Ogrenci o : ogrenciList) {
				System.out.println(o);
				System.out.println("--------------------------------");
			}
			System.out.println("******************************************");
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadi....");
		} catch (IOException e) {
			System.out.println("Dosya acilirken IOException olustu...");
		} catch (ClassNotFoundException e) {
			System.out.println("Sinif bulunamadi...");
		}

	}

}

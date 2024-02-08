package FileReaderBufferedReaderandWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("ogrenciler.txt"))){
			
			writer.write("Orhan Tasli,Matematik Muhendisligi \n");
			writer.write("Kenan Yalcin,Insaat Muhendisligi \n");
			writer.write("Ali Cabbar,Bilgisayar Muhendisligi \n");
			writer.write("Sumeyye Orhan,Bilgisayar Muhendisligi \n");
			writer.write("Ayse Yilmaz,Bilgisayar Muhendisligi \n");
			writer.write("Fatma Dogan,Makine Muhendisligi \n");
			writer.write("Deniz Sozeri,Elektrik Muhendisligi \n");
			
			
		}
		catch(IOException ex) {
			System.out.println("Dosya olusturulurken hata olustu...");
		}
		
		int i = 1;
		
		try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("ogrenciler.txt")))){
			
			while(scanner.hasNextLine()) {
				
				/*System.out.println(i + ". satir : " + scanner.nextLine());
				i++;*/
				
				String ogrenciBilgisi = scanner.nextLine();
				String[] array = ogrenciBilgisi.split(",");
				
				if(array[1].equals("Bilgisayar Muhendisligi ")) {
					
					System.out.println(array[0]);
				}
			}
			
			
			
		}
		catch(IOException ex) {
			System.out.println("Dosya okunurken hata olustu...");
		}

	}

}

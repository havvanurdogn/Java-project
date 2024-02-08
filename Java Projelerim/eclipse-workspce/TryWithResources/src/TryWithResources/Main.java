package TryWithResources;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		try(FileWriter writer = new FileWriter("diller.txt");){
			
			Scanner read = new Scanner(System.in);
			String dil;
			System.out.println("Cikis icin 'q' giriniz...");
			
			while(true) {
				
				System.out.print("Lutfen bir dil giriniz : ");
				dil = read.nextLine();
				if(dil.equals("q")) {
					System.out.println("Programdan cikiliyor...\nDosyanizi kontrol etmeyi unutmayin!");
					break;
				}
				writer.write(dil + "\n");
			}
			
			
		}
		catch(IOException ex){
			System.out.println("Dosya olusturulurken hata olustu...");
		}
		
		
	}

}

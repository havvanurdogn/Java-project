package FileWriterr;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		FileWriter writer = null;
		
		try {
			writer = new FileWriter("dosya.txt");
			
			writer.write("Şemsiye Pasajında Yağmur Yağıyordu.\nAli Ağa Çiftliğine Giderken Islandı.\n");
			
		} 
		catch (IOException e) {
			System.out.println("Dosya olusturulurken hata olustu...");
		}
		
		finally {
			if(writer != null) {
				try {
					writer.close();
				} 
				catch (IOException e) {
					System.out.println("Dosya kapatilirken hata olustu...");
				}
			}
		}
		
	}

}

package FileOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		
		try {
		 fos = new FileOutputStream("dosya.txt");
			
		 /*byte[] array = {56,87,99,85,96};
		 fos.write(array);
			fos.write(66);*/
		 String s = "Java Programlama Diline Hos Geldiniz...";
		 byte[] s_array = s.getBytes();
		 fos.write(s_array);
		
		} 
		catch (FileNotFoundException e) {
			System.out.println("Dosya olusturulamadi...");
			
		} 
		
		catch (IOException e) {
			System.out.println("Dosya yazilirken hata olustu...");
		}
		
		finally {
			try {
				fos.close();
			} 
			catch (IOException e) {
				System.out.println("Dosya kapatilamadi...");
			}
		}

	}

}

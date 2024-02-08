package KendiExceptionumuzuOlusturma;
import java.io.IOException;
import java.util.Scanner;
public class Main {

	public static void mekan_kontrol(int yas) throws IOException {
		if(yas < 18 ) {
			throw new InvalideAgeException("Invalide Age");
		}
		else {
			System.out.println("Mekana Hos Geldiniz...");
		}
	}
	public static void main(String[] args) throws IOException{
		Scanner read = new Scanner(System.in);
		
		System.out.print("Lutfen yasinizi giriniz : ");
		int yas = read.nextInt();
		
		try {
			mekan_kontrol(yas);
		}
		catch(InvalideAgeException ex) {
			//System.out.println(ex);
			ex.printStackTrace();
		}
		
	}

}

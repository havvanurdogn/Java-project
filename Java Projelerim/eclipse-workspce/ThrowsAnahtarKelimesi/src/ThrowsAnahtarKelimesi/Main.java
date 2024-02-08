package ThrowsAnahtarKelimesi;
import java.io.IOException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws IOException{
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Lutfen yasinizi giriniz : ");
		
		int yas = read.nextInt();
		
		//mekan_kontrol(yas);
		
		try {
			mekan_kontrol(yas);
		}
		catch(IOException e){
			System.out.println("18 yasindan kucukler mekana giremez...");
		}
		finally {
			System.out.println("Bu bir yas kontrol uygulamasidir.");
		}
		
		System.out.println("Burasi calisiyor.");
		
	}
	
	public static void mekan_kontrol(int yas) throws IOException {
		if(yas < 18) {
			throw new IOException();
		}
		else {
			System.out.println("Mekana Hos Geldiniz...");
		}
	}

}

package ThrowAnahtarKelimesi;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Lutfen yasinizi giriniz : ");
		
		int yas = read.nextInt();
		
		try {
			mekan_kontrol(yas);
		}
		catch(NumberFormatException e){
			System.out.println("18 yasindan kucukler mekana giremez...");
		}
		finally {
			System.out.println("Bu bir yas kontrol uygulamasidir.");
		}
		
		
	}
	
	public static void mekan_kontrol(int yas) {
		if(yas < 18) {
			throw new NumberFormatException();
		}
		else {
			System.out.println("Mekana Hos Geldiniz...");
		}
	}

}

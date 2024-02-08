package HesapMakinesiException;
import java.util.InputMismatchException;
import java.util.Scanner;

class CarpmaException extends Exception{

	public void printStackTrace() {
		System.out.println("Iki sayi da cok buyuk. Lutfen daha kucuk sayilar giriniz.");
	}
	
}


public class Main {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		System.out.println("Hesap Makinesi Uygulamasina Hos Geldiniz!");
		System.out.println("***********************************");
		String islemler = "Islemler : \n"
						+ "1.Toplama Islemi\n"
						+ "2.Cikarma Islemi\n"
						+ "3.Carpma Islemi\n"
						+ "4.Bolme Islemi";
						
		int a ,b ;
		System.out.println(islemler);
		System.out.println("***********************************");
		System.out.print("Lutfen yapmak istediginiz islemi giriniz : ");
		String islem = read.nextLine();
		try {
		switch(islem) {
			case "1" : 
				System.out.print("Birinci Sayi : ");
				a = read.nextInt();
				System.out.print("Ikinci Sayi : ");
				b = read.nextInt();
				System.out.println("Islemin sonucu : "+(a+b));
				break;
			
					 
			case "2" : 
				System.out.print("Birinci Sayi : ");
				a = read.nextInt();
				System.out.print("Ikinci Sayi : ");
				b = read.nextInt();
				System.out.println("Islemin sonucu : "+(a-b));
			
			
			case "3" : 
				System.out.print("Birinci Sayi : ");
				a = read.nextInt();
				System.out.print("Ikinci Sayi : ");
				b = read.nextInt();
				if(a > 10000 && b > 10000) {
					throw new CarpmaException();
				}
				System.out.println("Islemin sonucu : "+(a*b));
			
			
			case "4" : 
				System.out.print("Birinci Sayi : ");
				a = read.nextInt();
				System.out.print("Ikinci Sayi : ");
				b = read.nextInt();
				System.out.println("Islemin sonucu : "+(a/b));
			
			
			default : 
				System.out.println("Hatali islem...");
			
				
			
			
			}
		}
		catch(InputMismatchException ex) {
			System.out.println("Lutfen sayilari istenilen formatta giriniz.");
		}
		catch(ArithmeticException ex) {
			System.out.println("Bir sayi sifira bolunemez.");
		}
		catch(CarpmaException ex) {
			ex.printStackTrace();
		}
	}

}

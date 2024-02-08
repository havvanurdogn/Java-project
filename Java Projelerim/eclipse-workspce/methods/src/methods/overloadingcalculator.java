package methods;
import java.util.Scanner;
public class overloadingcalculator {
	public static int toplama(int a,int b) {
		return a+b;
	}
	public static int toplama(int a,int b,int c) {
		return a+b+c;
	}
	public static double bolme(double a,double b) {
		return a/b;
	}
	public static int cikartma(int a,int b) {
		return a-b;
	}
	public static int carpma(int a,int b) {
		return a*b;
	}
	public static int carpma(int a,int b, int c) {
		return a*b*c;
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String islemler = "1.Toplama islemi\n"
				+"2.Cikarma islemi\n"
				+"3.Carpma islemi\n"
				+"4.Bolme islemi\n"
				+"Cikmak icin q'a basiniz...";
		System.out.println("***************************************");
		System.out.println(islemler);
		System.out.println("***************************************");
		while(true) {
			System.out.print("Lutfen islem giriniz:");
			String islem = read.nextLine();
			if(islem.equals("q")) {
				System.out.println("Programdan cikiliyor...");
				break;
			}
			else if(islem.equals("1")) {
				System.out.print("Lutfen kac deger kullanacaginizi giriniz(2 veya 3):");
				int kacsayi = read.nextInt();
				if(kacsayi==2)
				{
					System.out.print("a:");
					int a =read.nextInt();
					System.out.print("b:");
					int b =read.nextInt();
					read.nextLine();
					System.out.println("Sonuc : "+toplama(a,b));
				}
				else if(kacsayi==3) {
					System.out.print("a:");
					int a =read.nextInt();
					System.out.print("b:");
					int b =read.nextInt();
					System.out.print("c:");
					int c =read.nextInt();
					read.nextLine();
					System.out.println("Sonuc : "+toplama(a,b,c));
				}
				else {
					System.out.println("Girdiginiz sayi icin metod bulunmuyor.");
				}
			}
			else if(islem.equals("2")) {
				System.out.print("a:");
				int a =read.nextInt();
				System.out.print("b:");
				int b =read.nextInt();
				read.nextLine();
				System.out.println("Sonuc : "+cikartma(a,b));
				
			}
			else if(islem.equals("3")) {
				System.out.print("Lutfen kac deger kullanacaginizi giriniz(2 veya 3):");
				int kacsayi = read.nextInt();
				if(kacsayi==2)
				{
					System.out.print("a:");
					int a =read.nextInt();
					System.out.print("b:");
					int b =read.nextInt();
					read.nextLine();
					System.out.println("Sonuc : "+carpma(a,b));
				}
				else if(kacsayi==3) {
					System.out.print("a:");
					int a =read.nextInt();
					System.out.print("b:");
					int b =read.nextInt();
					System.out.print("c:");
					int c =read.nextInt();
					read.nextLine();
					System.out.println("Sonuc : "+carpma(a,b,c));
				}
				else {
					System.out.println("Girdiginiz sayi icin metod bulunmuyor.");
				}
			}
			else if(islem.equals("4")) {
				System.out.print("a:");
				double a =read.nextDouble();
				System.out.print("b:");
				double b =read.nextDouble();
				read.nextLine();
				System.out.println("Sonuc : "+(double)bolme(a,b));
			}
			else {
				System.out.println("Gecersiz islem...");
			}
			
			
		}

	}

}

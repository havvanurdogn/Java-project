package GenericExample;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String islemler = "Islemler : \n"
						+ "1. Sayisal Birincisini Hesapla\n"
						+ "2. Esit Agirlik Birincisini Hesapla\n"
						+ "Cikis icin q'ya basiniz.";
		System.out.println("YKS BIRINCISI HESAPLAMA PROGRAMINA HOS GELDINIZ:::");
		while(true) {
			System.out.println("******************************************************");
			System.out.println(islemler);
			System.out.println("******************************************************");
			System.out.print("Lutfen yapmak istediginiz islemi giriniz : ");
			String islem = read.nextLine();
			
			if(islem.equals("q")) {
				System.out.println("Programdan cikiliyor...");
				break;
			}
			else if(islem.equals("1")) {
				System.out.print("Birinci Ogrencinin ismi : ");
				String isim1 = read.nextLine();
				System.out.print("Turkce neti : ");
				int turkce1 = read.nextInt();
				System.out.print("Matematik neti : ");
				int matematik1 = read.nextInt();
				System.out.print("Fizik neti : ");
				int fizik1 = read.nextInt();
				System.out.print("Edebiyat neti : ");
				int edebiyat1 = read.nextInt();
				read.nextLine();
				
				// Ikinci ogrenci
				System.out.print("Ikinci Ogrencinin ismi : ");
				String isim2 = read.nextLine();
				System.out.print("Turkce neti : ");
				int turkce2 = read.nextInt();
				System.out.print("Matematik neti : ");
				int matematik2 = read.nextInt();
				System.out.print("Fizik neti : ");
				int fizik2 = read.nextInt();
				System.out.print("Edebiyat neti : ");
				int edebiyat2 = read.nextInt();
				read.nextLine();
				
				//Ucuncu ogrenci
				System.out.print("Ucuncu Ogrencinin ismi : ");
				String isim3 = read.nextLine();
				System.out.print("Turkce neti : ");
				int turkce3 = read.nextInt();
				System.out.print("Matematik neti : ");
				int matematik3 = read.nextInt();
				System.out.print("Fizik neti : ");
				int fizik3 = read.nextInt();
				System.out.print("Edebiyat neti : ");
				int edebiyat3 = read.nextInt();
				read.nextLine();
				
				Sayisal s3 = new Sayisal(turkce3, matematik3, fizik3, edebiyat3, isim3);
				Sayisal s2 = new Sayisal(turkce2, matematik2, fizik2, edebiyat2, isim2);
				Sayisal s1 = new Sayisal(turkce1, matematik1, fizik1, edebiyat1, isim1);
				Sayisal b1 = birinci(s1, s2, s3);
				
				System.out.println("Sayisal Birincisi Olan Ogrencinin Ismi : "+b1.getIsim());
				System.out.println("Puani : "+b1.puanHesaplama());
				
				
				
			}
			else if(islem.equals("2")) {
				
				System.out.print("Birinci Ogrencinin ismi : ");
				String isim1 = read.nextLine();
				System.out.print("Turkce neti : ");
				int turkce1 = read.nextInt();
				System.out.print("Matematik neti : ");
				int matematik1 = read.nextInt();
				System.out.print("Fizik neti : ");
				int fizik1 = read.nextInt();
				System.out.print("Edebiyat neti : ");
				int edebiyat1 = read.nextInt();
				read.nextLine();
				
				// Ikinci ogrenci
				System.out.print("Ikinci Ogrencinin ismi : ");
				String isim2 = read.nextLine();
				System.out.print("Turkce neti : ");
				int turkce2 = read.nextInt();
				System.out.print("Matematik neti : ");
				int matematik2 = read.nextInt();
				System.out.print("Fizik neti : ");
				int fizik2 = read.nextInt();
				System.out.print("Edebiyat neti : ");
				int edebiyat2 = read.nextInt();
				read.nextLine();
				
				//Ucuncu ogrenci
				System.out.print("Ucuncu Ogrencinin ismi : ");
				String isim3 = read.nextLine();
				System.out.print("Turkce neti : ");
				int turkce3 = read.nextInt();
				System.out.print("Matematik neti : ");
				int matematik3 = read.nextInt();
				System.out.print("Fizik neti : ");
				int fizik3 = read.nextInt();
				System.out.print("Edebiyat neti : ");
				int edebiyat3 = read.nextInt();
				read.nextLine();
				
				EsitAgirlik ea3 = new EsitAgirlik(turkce3, matematik3, fizik3, edebiyat3, isim3);
				EsitAgirlik ea2 = new EsitAgirlik(turkce2, matematik2, fizik2, edebiyat2, isim2);
				EsitAgirlik ea1 = new EsitAgirlik(turkce1, matematik1, fizik1, edebiyat1, isim1);
				EsitAgirlik b2 = birinci(ea1, ea2, ea3);
				
				System.out.println("Esit Agirlik Birincisi Olan Ogrencinin Ismi : "+b2.getIsim());
				System.out.println("Puani : "+b2.puanHesaplama());
				
			}
			else {
				System.out.println("Gecersiz islem...");
			}
		}
		
		
	}
	public static <E extends Aday> E birinci (E e1 , E e2 , E e3){
		if(e1.puanHesaplama() >e2.puanHesaplama() && e1.puanHesaplama() >e3.puanHesaplama()) {
			return e1;
		}
		if(e2.puanHesaplama() >e1.puanHesaplama() && e2.puanHesaplama() >e3.puanHesaplama()) {
			return e1;
		}
		if(e3.puanHesaplama() > e2.puanHesaplama() && e3.puanHesaplama() > e1.puanHesaplama()) {
			return e1;
		}
		
		return e2;
	}

}

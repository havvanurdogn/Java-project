package ExceptionPrapagation;

public class Main {

	public static void ucuncuFonksiyon() {
		//try {
			int a = 20 / 0;
		/*}
		catch(ArithmeticException ex){
			System.out.println("bir sayi sifira bolunemez...");
		}*/
	}
	public static void ikinciFonksiyon() {
		//try {
		ucuncuFonksiyon();
		/*}
		catch(ArithmeticException ex) {
			System.out.println("bir sayi sifira bolunemez...");
		}*/
	}
	public static void birinciFonksiyon() {
		try {
			ikinciFonksiyon();
		}
		catch(ArithmeticException ex) {
			System.out.println("bir sayi sifira bolunemez...");
		}
	}
	public static void main(String[] args) {
		birinciFonksiyon();
		
		//iç içe geçmiş metotlar stackleri kullanır.
		//eğer metotun en içinde hata varsa bir üst metotlar veya hata çıkaran metotlar try-catch bloğunu kullanabilir.
	}

}

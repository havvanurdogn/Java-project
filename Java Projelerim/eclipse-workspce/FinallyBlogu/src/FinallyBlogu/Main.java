package FinallyBlogu;

public class Main {

	public static void main(String[] args) {
		
		try {
			//String isim = null;
			//Integer.parseInt(isim);
			
			int a = 20 / 0 ; 
			
		}
		
		catch(NumberFormatException n) {
			System.out.println("Herhangi bir deger donmuyor...");
		}
		
		finally {
			System.out.println("Herhangi bir deger donmese de , farkli bir exception hatasi da olsa bu blok calisir.");
		}
		
		System.out.println("Eger try-catch hatayi yakalayamazsa burasi calismaz...");
		System.out.println("Eger calisiyorsa yakalamis demektir.");
		
	}

}

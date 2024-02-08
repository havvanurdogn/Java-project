package PolyMorphism;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Beyblade uretim programina hos geldiniz!");
		System.out.println("Cikis icin q'ya basiniz...");
		
		while(true) {
			
			System.out.println("Hangi Beyblade'i uretmek istersiniz?");
			String islem = read.nextLine();
			
			if(islem.equals("q")) {
				System.out.println("Programdan cikiliyor...");
				break;
			}
			else {
				BeybladeFabrikasi fabrika = new BeybladeFabrikasi();
				Beyblade beyblade = fabrika.beybladeUret(islem);
				
				if(beyblade == null) {
					System.out.println("Lutfen gecerli bir beyblade ismi giriniz.");
				}
				
				else {
					beyblade.bilgileri_goster();
					beyblade.saldir();
					beyblade.KutsalCanavarOrtayaCikar();
				}
			}
			
			
		}
	}

}

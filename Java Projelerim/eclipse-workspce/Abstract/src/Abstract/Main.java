package Abstract;

public class Main {

	public static void main(String[] args) {

		Kare kare1 = new Kare("Kare" , 5 );
		Daire daire1 = new Daire("Daire" , 2);
		Sekil sekil1 = new Sekil("Dikdortgen") {
			
			
			void alaniHesapla() {
				int uzunKenar = 5 , kisaKenar = 3;
				System.out.println(getIsim()+" 'in alani : "+(kisaKenar * uzunKenar));
			}
		};
		sekil1.alaniHesapla();
		
		daire1.alaniHesapla();
		kare1.alaniHesapla();
		
	}

}

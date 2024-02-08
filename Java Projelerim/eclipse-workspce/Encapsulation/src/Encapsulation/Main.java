package Encapsulation;

public class Main {

	public static void main(String[] args) {
		/*Abone abone = new Abone();
		abone.bakiye = 200;
		abone.isim = "Goerge Orwell";
		abone.sehir = "Istanbul";
		
		abone.bilgileri_goster();
		abone.bakiye_ogren();*/
		
		
		GelismisAbone abone = new GelismisAbone("George Orwell", 140, "Istanbul");
		abone.bakiye_ogren();
		abone.bilgileri_goster();

	}

}

package PolyMorphism;

public class BeybladeFabrikasi {

	public Beyblade beybladeUret(String beyblade_turu) {
		
		if(beyblade_turu.equals("Dragon")) {
			return new Dragon("Takao", 800, 300, "Mavi Ejderha", "Kutsal canavarla konusma");
		}
		else if(beyblade_turu.equals("Dranza")) {
			return new Dranza("Kai", 600, 400, "Kirmizi Anka Kusu");
		}
		else if(beyblade_turu.equals("Drayga")) {
			return new Drayga("Rei", 800, 250, "Beyaz Kaplan");
		}
		else if(beyblade_turu.equals("Draciel")) {
			return new Draciel("Max", 400, 1000, "Kara Kaplumbaga");
		}
		else return null;
	}
}

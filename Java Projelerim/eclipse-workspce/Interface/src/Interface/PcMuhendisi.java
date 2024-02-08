package Interface;

public class PcMuhendisi implements IMuhendis{

	
	private boolean askerlik;
	private boolean sicil;
	
	
	public PcMuhendisi( boolean askerlik, boolean sicil) {
		
		this.askerlik = askerlik;
		this.sicil = sicil;
	}


	public void askerlikDurumu() {
		if(askerlik) {
			System.out.println("Askerligini yapmistir.");
		}
		else {
			System.out.println("Askerligini yapmamistir.");
		}
	}

	
	public void adliSicil() {
		if(sicil) {
			System.out.println("Adli sicil kaydi bulunuyor.");
		}
		else {
			System.out.println("Adli sicil kaydi bulunmuyor.");
		}
	}

	
	public String mezuniyetNotu(double derece) {
		return "Universite ortalamasi : "+derece;
	}

	
	public void isTecrubesi(String[] array) {
		System.out.println("Bilgisayar Muhendisi Olarak Calistigi Yerler : ");
		for(int i = 0 ;i < array.length ; i++) {
			System.out.println(array[i]);
		}
	}
	

	
}

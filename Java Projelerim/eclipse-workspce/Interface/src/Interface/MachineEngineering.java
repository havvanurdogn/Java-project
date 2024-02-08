package Interface;

public class MachineEngineering implements IMuhendis , ICalisma {

	private boolean askerlik;
	private boolean sicil;
	
	
	public MachineEngineering ( boolean askerlik, boolean sicil) {
		
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
		return "Universite not ortalamasi : "+derece;
	}

	
	public void isTecrubesi(String[] array) {
		if(array.length == 0) {
			System.out.println("Herhangi bir is tecrubesi bulunmuyor.");
		}
		else {
			System.out.println("Makine Muhendisi olarak calistigi yerler : ");
			for(int i = 0 ; i < array.length ; i++) {
				System.out.println(array[i]);
			}
		}
	}
	public void referansGetir(String[] arr) {
		if(arr.length == 0) {
			System.out.println("Herhangi bir referansi yoktur.");
		}
		else {
			System.out.println("Referanslari  : ");
			for(int i = 0 ; i < arr.length ; i++) {
				System.out.println(arr[i]);
			}
		}
	}
	public void calis() {
		System.out.println("Makina Muhendisi calisiyor.");
	}
	
	
	
	

}

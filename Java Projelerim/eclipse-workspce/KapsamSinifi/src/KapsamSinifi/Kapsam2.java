package KapsamSinifi;

public class Kapsam2 {
	private int privateDegisken = 30;
	public Kapsam2 (){
		System.out.println("Degisken degeri : "+privateDegisken);
	}
	
	public void kontrol() {
		System.out.println("Kontroller saglaniyor...");
	}
	
	public class DahiliSinif {
		private int privateDegisken = 20;
		/*private*/ int a = 2;
		public void carp() {
			int privateDegisken = 10;
			
			for(int i = 1 ; i < 6 ; i++) {
				System.out.println(i+"*"+this.privateDegisken+" = "+ i * this.privateDegisken);
			}
					
		}
	}
	
	
	
}

package KapsamSinifi;

public class Kapsam {
	private int privateDegisken = 30;
	public Kapsam (){
		System.out.println("Degisken degeri : "+privateDegisken);
	}
	
	public void carp() {
		int privateDegisken = 10;
		
		for(int i = 1 ; i < 6 ; i++) {
			System.out.println(i+"*"+privateDegisken+" = "+ i * privateDegisken);
		}
				
	}
	
}

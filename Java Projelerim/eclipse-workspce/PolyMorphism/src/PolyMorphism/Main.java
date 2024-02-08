package PolyMorphism;

public class Main {

	class Hayvan{
		private String isim;
		
		
		public Hayvan(String isim) {
			this.isim = isim;
		}
		
		
		public String getIsim() {
			return isim;
		}
		public void setIsim(String isim) {
			this.isim = isim;
		}
		
		
		public String ses_cikarma() {
			return this.getIsim() + " ses cikariyor.";
		}
	}
	
	class Kedi extends Hayvan{
		
		
		public String ses_cikarma() {
			
			return this.getIsim() + " miyavliyor.";
		}

		public Kedi(String isim) {
			super(isim);
		}
		
	}
	
	class Kopek extends Hayvan{
		public Kopek (String isim) {
			super(isim);
		}
		public String ses_cikarma() {
			return this.getIsim() + " havliyor.";
  		}
	}
	
	public static void main(String[] args) {
		
		Main main = new Main();
		Hayvan hayvan = main.new Kedi("Mirmir");
		Hayvan hayvan2 = main.new Kopek("Karabas");
		System.out.println(hayvan.ses_cikarma());
		//System.out.println(hayvan2.ses_cikarma());

	}

}

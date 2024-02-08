package AnonimInnerClass;

public class Main {

	public static void main(String[] args) {
		
		IOgrenci ogrenci1 = new IOgrenci() {
			
			public void derse_gir() {
				System.out.println("Derse giriliyor...");
			}
			
			public void ders_calis() {
				System.out.println("Ders calisiliyor...");
			}
		};
		
		ogrenci1.ders_calis();
		ogrenci1.derse_gir();
		
		System.out.println("*****************************************");
		
		AOgrenci ogrenci2 = new AOgrenci("Oya Gul" , 411) {
			
			void kayit_yaptir() {
				System.out.println(getNumara() + " numarali "+getIsim()+" adli ogrencinin kaydi yaptiriliyor...");
			}
		};
		
		ogrenci2.kayit_yaptir();
		ogrenci2.selamla();
		
	}
	public static abstract class AOgrenci{
		private String isim;
		private int numara;
		
		public AOgrenci(String isim, int numara) {
			this.isim = isim;
			this.numara = numara;
		}

		public String getIsim() {
			return isim;
		}

		public void setIsim(String isim) {
			this.isim = isim;
		}

		public int getNumara() {
			return numara;
		}

		public void setNumara(int numara) {
			this.numara = numara;
		}
		
		abstract void kayit_yaptir();		
		
		private void selamla() {
			System.out.println("Merhaba!");
		}
		
	}
	
	public interface IOgrenci{
		void ders_calis();
		void derse_gir();
	}

}

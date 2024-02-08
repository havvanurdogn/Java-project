package Encapsulation;

public class GelismisAbone {
	private String isim;
	private int bakiye = 120 ;
	private String sehir;
	
	public GelismisAbone(String isim , int bakiye , String sehir) {
		this.isim = isim;
		if( bakiye >= 0 && bakiye <= 120  ) {
			this.bakiye = bakiye;
		}
		
		this.sehir = sehir;
	}
	
	/*public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public int getBakiye() {
		if(this.bakiye >= 0 && this.bakiye <= 120) {
			return bakiye;
		}
		else {
			this.bakiye = 120;
			return bakiye;
		}
	}
	public void setBakiye(int bakiye) {
		if(this.bakiye >= 0 && this.bakiye <= 120) {
			this.bakiye =bakiye;
		}
		else {
			this.bakiye = 120;
		}
	}
	public String getSehir() {
		return sehir;
	}
	public void setSehir(String sehir) {
		this.sehir = sehir;
	}*/
	
	public void dogalgaz_kullan(int miktar) {
		if(this.bakiye < miktar) {
			System.out.println("Yetersiz bakiye.Lutfen bakiye yukleyiniz.");
		}
		else {
			this.bakiye -= miktar;
			if(this.bakiye == 0) System.out.println("Bakiyeniz bitmistir.Lutfen yukleyiniz.Bakiye limiti = 120");
			else System.out.println("Kalan bakiyeniz : "+this.bakiye);
		}
		
	}
	public void bakiye_ogren() {
		System.out.println("Bakiyeniz : "+this.bakiye);
	}
	public void bilgileri_goster() {
		System.out.println("Isim : "+this.isim);
		System.out.println("Bakiye : "+this.bakiye);
		System.out.println("Sehir : "+this.sehir);
	}

	
	
	
	
	
	
	
	
	
	

}

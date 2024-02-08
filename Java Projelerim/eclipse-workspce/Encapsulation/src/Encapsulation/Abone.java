package Encapsulation;

public class Abone {
	public String isim;
	public int bakiye;
	public String sehir;
	
	public void dogalgaz_kullan(int miktar) {
		if(this.bakiye < miktar) {
			System.out.println("Yetersiz bakiye.Lutfen bakiye yukleyiniz.");
		}
		else {
			this.bakiye -= miktar;
			if(this.bakiye == 0) System.out.println("Bakiyeniz bitmistir.Lutfen yukleyiniz.Bakiye limiti = 120");
			else System.out.println("Kalan bakiyeniz : "+bakiye);
		}
		
	}
	public void bakiye_ogren() {
		System.out.println("Bakiyeniz : "+bakiye);
	}
	public void bilgileri_goster() {
		System.out.println("Isim : "+isim);
		System.out.println("Bakiye : "+bakiye);
		System.out.println("Sehir : "+sehir);
	}

}

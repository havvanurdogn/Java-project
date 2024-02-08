package FinalAnahtarKelimesi;

public class FinalTest {

	public final int obje_sayisi  ;
	public String isim;
	public static int say = 0;
	public FinalTest( String isim) {
		say++;
		this.obje_sayisi = say;
		this.isim = isim;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public static int getSay() {
		return say;
	}
	
	
	
	
}

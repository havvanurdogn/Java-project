package Abstract;

public class Kare extends Sekil{
	
	private int kenar;
	
	public Kare(String isim , int kenar) {
		super(isim);
		this.kenar = kenar;
	}
	
	public void alaniHesapla() {
		System.out.println(getIsim() + " 'in alani : "+(kenar*kenar));
	}
	

}

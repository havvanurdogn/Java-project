package AbstractGeoSekil;

public class Kare extends Sekil{
	private int kenar;

	public Kare(String isim, int kenar) {
		super(isim);
		this.kenar = kenar;
	}

	public void alanHesaplama() {
		System.out.println(getIsim()+" in alani : "+(kenar*kenar));
	}
	

}

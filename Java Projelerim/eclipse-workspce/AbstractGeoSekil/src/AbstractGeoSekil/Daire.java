package AbstractGeoSekil;

public class Daire extends Sekil{
	private int yaricap;

	public Daire(String isim, int yaricap) {
		super(isim);
		this.yaricap = yaricap;
	}

	public void alanHesaplama() {
		System.out.println(getIsim()+" in alani : "+(Math.PI * yaricap * yaricap));
	}
	

}

package GenericMethod;

public class Sayisal extends Aday{

	public Sayisal(int turkce, int matematik, int fizik, int edebiyat) {
		super(turkce, matematik, fizik, edebiyat);
	}

	public int puanHesaplama() {
		
		return getEdebiyat()*1 + getFizik()*4 + getMatematik()*4 + getTurkce()*4;
	}
}

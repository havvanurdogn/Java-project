package GenericExample;

public class EsitAgirlik extends Aday{

	public EsitAgirlik(int turkce, int matematik, int fizik, int edebiyat , String isim) {
		super(turkce, matematik, fizik, edebiyat , isim);
	}

	public int puanHesaplama() {
		
		return getEdebiyat()*4 + getFizik()*1 + getMatematik()*4 + getTurkce()*4;
	}

}

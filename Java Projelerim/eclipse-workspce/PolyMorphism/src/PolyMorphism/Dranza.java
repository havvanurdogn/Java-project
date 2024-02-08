package PolyMorphism;

public class Dranza extends Beyblade{
	
	private String kutsal_canavar;
	
	public Dranza (String beybladeci , int saldiri_gucu ,int donus_hizi ,String kutsal_canavar) {
		super(beybladeci,saldiri_gucu,donus_hizi);
		this.kutsal_canavar = kutsal_canavar;
	}
	
	public String getKutsal_canavar() {
		return kutsal_canavar;
	}
	public void setKutsal_canavar(String kutsal_canavar) {
		this.kutsal_canavar = kutsal_canavar;
	}

	
	public void KutsalCanavarOrtayaCikar() {
		System.out.println(getBeybladeci()+" "+kutsal_canavar+"'i ortaya cikariyor.");
		System.out.println(getBeybladeci()+"'in saldirisi : Alev kilici.");
	}

	public void bilgileri_goster() {
		super.bilgileri_goster();
		System.out.println("Kutsal canavarin adi : "+getKutsal_canavar());
	}
	
	

}

package PolyMorphism;

public class Draciel extends Beyblade{
	
	private String kutsal_canavar;
	
	public Draciel(String beybladeci , int saldiri_gucu , int donus_hizi,String kutsal_canavar) {
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
		System.out.println(getBeybladeci()+"'ni savunmasi : Kale Savunmasi");
	}

	public void bilgileri_goster() {
		super.bilgileri_goster();
		System.out.println("Kutsal canavar adi : "+getKutsal_canavar());
	}
	

}

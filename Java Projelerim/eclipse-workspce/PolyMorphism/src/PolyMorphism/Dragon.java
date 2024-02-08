package PolyMorphism;

public class Dragon extends Beyblade {
	
	private String kutsal_canavar;
	private String gizli_yetenek;
	
	public Dragon(String beybladeci , int saldiri_gucu , int donus_hizi ,String kutsal_canavar ,String gizli_yetenek) {
		super(beybladeci,saldiri_gucu,donus_hizi);
		this.kutsal_canavar = kutsal_canavar;
		this.gizli_yetenek =gizli_yetenek; 
	}
	
	public String getKutsal_canavar() {
		return kutsal_canavar;
	}
	public void setKutsal_canavar(String kutsal_canavar) {
		this.kutsal_canavar = kutsal_canavar;
	}
	public String getGizli_yetenek() {
		return gizli_yetenek;
	}
	public void setGizli_yetenek(String gizli_yetenek) {
		this.gizli_yetenek = gizli_yetenek ;
	}

	public void KutsalCanavarOrtayaCikar() {
		System.out.println(getBeybladeci()+" "+kutsal_canavar+"'i ortaya cikariyor.");
		System.out.println(getBeybladeci()+"");
	}
	
	public void bilgileri_goster() {
		super.bilgileri_goster();
		System.out.println("Kutsal canavar : "+getKutsal_canavar());
		System.out.println("Gizli yetenek : "+getGizli_yetenek());
	}

	
}

package PolyMorphism;

public class Beyblade {
	
	private String beybladeci;
	private int saldiri_gucu;
	private int donus_hizi;
	
	public Beyblade (String beybladeci , int saldiri_gucu , int donus_hizi) {
		this.beybladeci = beybladeci;
		this.donus_hizi = donus_hizi;
		this.saldiri_gucu =saldiri_gucu;
	}
	
	
	public String getBeybladeci() {
		return beybladeci;
	}
	public void setBeybladeci(String beybladeci) {
		this.beybladeci = beybladeci;
	}
	
	
	public int getSaldiri_gucu() {
		return saldiri_gucu;
	}
	public void setSaldiri_gucu(int saldiri_gucu) {
		this.saldiri_gucu = saldiri_gucu;
	}
	
	
	public int getDonus_hizi() {
		return donus_hizi;
	}
	public void setDonus_hizi(int donus_hizi) {
		this.donus_hizi = donus_hizi;
	}
	
	public void KutsalCanavarOrtayaCikar() {
		System.out.println("Bu karakterin Kutsal Canavari yoktur.");
	}
	
	public void saldir() {
		System.out.println(getBeybladeci()+" "+saldiri_gucu+" ve "+donus_hizi+" ile saldiriyor.");
	}
	
	public void bilgileri_goster() {
		System.out.println("Beyblade adi : "+getBeybladeci());
		System.out.println("Donus hizi : "+getDonus_hizi());
		System.out.println("Saldiri gucu : "+getSaldiri_gucu());
	}

}

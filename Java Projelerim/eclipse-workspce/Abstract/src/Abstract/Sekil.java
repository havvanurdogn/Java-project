package Abstract;

public abstract class Sekil {
	
	private String isim;
	
	public Sekil(String isim) {
		this.isim = isim;
	}
	
	public String getIsim() {
		return this.isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	public void isminiSoyle(String isim) {
		System.out.println("Sekilin ismi "+isim+" dir.");
	}
	
	abstract void alaniHesapla();
	
	

}

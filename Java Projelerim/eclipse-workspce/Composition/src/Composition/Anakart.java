package Composition;

public class Anakart {
	
	private String uretici;
	private String model;
	private String isletim_sistemi;
	private int yuva_sayisi;
	
	public Anakart(String uretici , String model ,String isletim_sistemi ,int yuva_sayisi) {
		this.isletim_sistemi = isletim_sistemi;
		this.model = model;
		this.uretici = uretici;
		this.yuva_sayisi = yuva_sayisi;
	}
	
	public String getUretici() {
		return uretici;
	}
	public void setUretici(String uretici) {
		this.uretici=uretici;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getIsletim_sistemi() {
		return isletim_sistemi;
	}
	public void setIsletim_sistemi(String isletim_sistemi) {
		this.isletim_sistemi = isletim_sistemi;
	}
	
	public int getYuva_sayisi() {
		return yuva_sayisi;
	}
	public void setYuva_sayisi(int yuva_sayisi) {
		this.yuva_sayisi = yuva_sayisi;
	}
	
	public void isletim_sistemi_yukle(String isletim_sistemi) {
		this.isletim_sistemi = isletim_sistemi;
		System.out.println("Isletim sistemi yuklendi : "+isletim_sistemi);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

package Static;

public class Seyirci {
	
	private String isim;
	public static int seyirci_sayisi = 0 ;

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public Seyirci(String isim) {
		this.isim = isim;
		this.seyirci_sayisi = seyirci_sayisi;
		seyirci_sayisi ++ ;
	}

	
	
	

}

package array;

public class ForEachDeneme {
	private String isim;
	
	public ForEachDeneme(String isim) {
		this.isim = isim;
	}
	
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	public void yazdir() {
		System.out.println(getIsim());
	}
	

}

package Inheritance;

public class Papatya extends cicek {
	
	private String yaprak_rengi;
	
	public Papatya(int boy , int yaprak_sayisi , String tur ,String yaprak_rengi) {
		super(boy,yaprak_sayisi,tur);
		this.yaprak_rengi = yaprak_rengi;
	}
	public void bilgileriGoster() {
		super.bilgileriGoster();
		System.out.println("Yaprak rengi : "+yaprak_rengi);
	}
	

}

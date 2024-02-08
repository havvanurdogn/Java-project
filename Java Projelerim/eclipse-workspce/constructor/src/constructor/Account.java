package constructor;

public class Account {
	private String hesap_no;
	private String hesap_sahibi;
	private double bakiye;
	private String email;
	private String telefonNo;
	
	public Account () {
		System.out.println("Merhaba! Nasilsiniz?");
	}
	public Account (double bakiye) {
		this.bakiye = 0.0;
		System.out.println("Bakiye bilgisi bulunmuyor...");
	}
	public Account (String hesap_no,String hesap_sahibi,double bakiye,String email,String telefonNo) {
		this.hesap_no = hesap_no;
		this.hesap_sahibi = hesap_sahibi;
		this.bakiye = bakiye;
		this.email = email;
		this.telefonNo = telefonNo;
	}
	
	
	
	public void setHesap_no(String hesap_no) {
		this.hesap_no = hesap_no;
	}
	public String getHesap_no() {
		return this.hesap_no;
	}
	public void setHesap_sahibi(String hesap_sahibi) {
		this.hesap_sahibi = hesap_sahibi;
	}
	public String getHesap_sahibi() {
		return this.hesap_sahibi;
	}
	public void setBakiye(double bakiye) {
		this.bakiye = bakiye;
	}
	public double getBakiye() {
		return this.bakiye;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return this.email;
	}
	public void setTelefonNo(String telefonNo) {
		this.telefonNo = telefonNo;
	}
	public String getTelefonNo() {
		return this.telefonNo;
	}
	public void bilgileri_sirala() {
		System.out.println("Hesap no: "+ this.hesap_no);
		System.out.println("Hesap Sahibinin Adi Soyadi: "+this.hesap_sahibi);
		System.out.println("Hesabin Bakiyesi: "+this.bakiye);
		System.out.println("Hesap Sahibinin Email Adresi: "+this.email);
		System.out.println("Hesap Sahibinin Telefon Numarasi: "+this.telefonNo);
	}
	

}

package YurtDisiException;
import java.util.Scanner;

class HarcException extends Exception {

	public void printStackTrace() {
		System.out.println("Yatirdiginiz harc tutari yeterli degildir.");
	}
	
}

class SiyasiYasakException extends Exception{

	public void printStackTrace() {
		System.out.println("Siyasi yasaginiz bulundugu icin yurt disina cikamazsiniz.");
	}
	
}

class VizeKontrolException extends Exception{

	
	public void printStackTrace() {
		System.out.println("Gideceginiz ulke icin vizeniz bulunmamakta...");
	}
	
}


public class Yolcu {

	private int harc;
	private boolean siyasiYasak ;
	private boolean vize;
	
	public Yolcu() {
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Lutfen yurtdisi harcinizi yatiriniz. Tutari giriniz :");
		this.harc = read.nextInt();
		read.nextLine();
		
		System.out.print("Herhangi bir siyasi yasaginiz bulunuyor mu ? (evet ya da hayir yaziniz.)");
		String cevap1 = read.nextLine();
		if(cevap1.equals("evet")) {
			this.siyasiYasak = false;
		}
		else {
			this.siyasiYasak = true;
		}
		
		System.out.print("Gideceginiz ulkeye ait vizeniz bulunuyor mu? (evet ya da hayir yaziniz.)");
		String cevap2 = read.nextLine();
		if(cevap2.equals("evet")) {
			this.vize = true;
		}
		else {
			this.vize = false;
		}
		
	}
	
	public void harcKontrolu() throws HarcException{
		if(harc < 15) {
			throw new HarcException();
		}
		else {
			System.out.println("Harc odeme isleminiz basariyla tamamlanmistir.");
			
		}
		
	}

	
	public void siyasiYasakKontrolu() throws SiyasiYasakException{
		if(!siyasiYasak) {
			throw new SiyasiYasakException();
		}
		else {
			System.out.println("Herhangi bir siyasi yasak bulunamamistir.");
			
		}
		
	}

	public void vizeKontrolu() throws VizeKontrolException{
		if(vize) {
			System.out.println("Vize isleminiz basariyla tamamlanmistir.");
		}
		else {
			throw new VizeKontrolException();
		}
	}
}

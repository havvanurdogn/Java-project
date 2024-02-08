package Interface;
import java.util.Scanner;
public class Yolcu implements IYurtDisi{

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
	
	public boolean harcKontrolu() {
		if(harc < 15) {
			System.out.println("Yatirdiginiz harc tutari yeterli degildir.");
			return false;
		}
		else {
			System.out.println("Harc odeme isleminiz basariyla tamamlanmistir.");
			return true;
		}
		
	}

	
	public boolean siyasiYasakKontrolu() {
		if(!siyasiYasak) {
			System.out.println("Siyasi yasaginiz bulundugu icin yurt disina cikamazsiniz.");
			return false;
		}
		else {
			System.out.println("Herhangi bir siyasi yasak bulunamamistir.");
			return true;
		}
		
	}

	public boolean vizeKontrolu() {
		if(vize) {
			System.out.println("Vize isleminiz basariyla tamamlanmistir.");
			return true;
		}
		else {
			System.out.println("Gideceginiz ulke icin vizeniz bulunmamakta...");
			return false;
		}
	}
}

package YurtDisiException;

public class YurtDisiMain {

	public static void main(String[] args) throws InterruptedException {

		
		System.out.println("Sabiha Gokcen Havalimanina Hos Geldiniz!");
		String sartlar = "Yurtdisina cikmak icin gereken sartlar : \n"
				+"1)Harc bedelinizi eksiksiz yatiriniz : 15 TL\n"
				+"2)Herhangi bir siyasi yasaginizin bulunmamasi gerekiyor.\n"
				+"3)Gideceginiz ulkeye ait vizenizin bulunmasi gerekiyor.";
		String mesaj = "Yurtdisina cikmak icin sartlarin hepsini saglamaniz gereklidir";
		System.out.println("*********************************************************");
		System.out.println(mesaj);
		while(true) {
			System.out.println("*********************************************************");
			System.out.println(sartlar);
			System.out.println("*********************************************************");
			
			Yolcu yolcu = new Yolcu();
			
			System.out.println("Harc bedeli kontrol ediliyor...");
			Thread.sleep(3000);
			
			try {
				yolcu.harcKontrolu();
			}
			catch(HarcException ex) {
				ex.printStackTrace();
				continue;
			}
			
			System.out.println("Siyasi yasak kontrol ediliyor...");
			Thread.sleep(3000);
			try {
				yolcu.siyasiYasakKontrolu();
			}
			catch(SiyasiYasakException ex) {
				ex.printStackTrace();
				continue;
			}
			
			System.out.println("Vize kontrol ediliyor...");
			Thread.sleep(3000);
			
			try {
				yolcu.vizeKontrolu();
			}
			catch(VizeKontrolException ex) {
				ex.printStackTrace();
				continue;
			}
			
			
			System.out.println("Gereken sartlari sagladiniz.Yurt disina cikabilirsiniz.\nIYI YOLCULUKLAR!");
			break;
		}
		
	}

}

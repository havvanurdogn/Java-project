package PriorityQueueAcilServis;

public class Hasta implements Comparable<Hasta>{
	private String isim;
	private String hastalik;
	
	private int oncelik;

	public Hasta(String isim, String hastalik) {
		this.isim = isim;
		this.hastalik = hastalik;
		
		if(this.hastalik.equals("Apandisit")) {
			oncelik = 3;
		}
		else if(this.hastalik.equals("Yanik")) {
			oncelik = 2;
		}
		else if(this.hastalik.equals("Bas agrisi")) {
			oncelik = 1;
		}
		else {
			oncelik = 0;
		}
	}
	
	public String toString() {
		String bilgiler = "Hasta Adi : "+isim
						+ "\nSikayet : "+hastalik
						+ "\nOncelik : "+oncelik;
		return bilgiler;
	}

	public int compareTo(Hasta hasta) {
		if(this.oncelik > hasta.oncelik) {
			return -1;
		}
		else if(this.oncelik < hasta.oncelik) {
			return 1;
		}
		return 0;
	}
	
	

}

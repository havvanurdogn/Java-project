package array;
import java.util.ArrayList;
public class SarkiciListele {
	private ArrayList<String> sarkici_listesi = new ArrayList<String>();
	
	public void sarkici_yazdir() {
		System.out.println("Listenizde "+sarkici_listesi.size()+" adet sarkici bulunmakta.");
		System.out.println("Iste sarkici listeniz:");
		for(int i = 0; i < sarkici_listesi.size() ; i++) {
			System.out.println((i+1) +". Sarkici : "+sarkici_listesi.get(i));
		}
	}
	
	public void sarkici_ekle(String isim) {
		sarkici_listesi.add(isim);
		System.out.println(isim+" adli sarkici listenize eklendi.");
	}
	
	public void sarkici_sil(String isim) {
		int sira  = sarkici_listesi.indexOf(isim);
		sarkici_listesi.remove(sira);
		System.out.println(isim+"adli sarkici listenizden cikarildi.");
	}
	public void sarkici_guncelle(String isim, int sira) {
		sarkici_listesi.set(sira, isim);
		System.out.println("Sarkici listeniz guncellendi");
	}
	public void sarkici_ara(String isim) {
		int sira = sarkici_listesi.indexOf(isim);
		if(sira >= 0) {
			System.out.println("Aradiginiz sarkici listenizde "+(sira+1)+". sirada.");
		}
		else {
			System.out.println("Aradiginiz sarkici listenizde bulunamadi.");
		}
	}
	

}

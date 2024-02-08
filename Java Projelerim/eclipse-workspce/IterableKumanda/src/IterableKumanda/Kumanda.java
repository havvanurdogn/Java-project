package IterableKumanda;
import java.util.ArrayList;
import java.util.Iterator;

public class Kumanda implements Iterable<String>{
	
	class KumandaIterator implements Iterator<String>{

		private int index;
		public boolean hasNext() {
			if(index < kanallarListesi.size()) {
				return true;
			}
			return false;
		}

		public String next() {
			String kanal = kanallarListesi.get(index);
			index++;
			return kanal;
		}
		
	}

	private ArrayList<String> kanallarListesi = new ArrayList<String>(); 
	
	public void kanallari_goster() {
		if(kanallarListesi.size() == 0) {
			System.out.println("Herhangi bir kanal bulunmamaktadir.");
		}
		else {
			System.out.println("Kanallar : ");
			for(String s: kanallarListesi) {
				System.out.println(s);
			}
		}
		
	}
	
	public void kanal_ekle(String kanal) {
		kanallarListesi.add(kanal);
	}
	
	public void kanal_sil(String kanal) {
		if (kanallarListesi.contains(kanal)) {
			kanallarListesi.remove(kanal);
		}
		else {
			System.out.println("Kanal bulunamadi.");
		}
	}
	
	public void kanal_ac(int kanalNo) {
		if( kanalNo <= kanallarListesi.size()) {
			System.out.println(kanallarListesi.get(kanalNo)+" kanali aciliyor...");
		}
		else {
			System.out.println((kanalNo+1)+" numarali kanal bulunmamaktadir."); 
		}
	}
	
	public int kanal_sayisi() {
		return kanallarListesi.size();
	}

	
	public Iterator<String> iterator() {
		return new KumandaIterator();
	}

	
	
	
}

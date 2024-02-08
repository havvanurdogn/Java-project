package IterableSinifiOlusturma;
import java.util.ArrayList;
import java.util.Iterator;
public class Radyo implements Iterable<String>{
	
	private ArrayList<String> kanallarListesi = new ArrayList<String>();
	
	public Radyo(String [] kanallar) {
		for(String s : kanallar) {
			kanallarListesi.add(s);
		}
	}
	
	public class RadyoIterator implements Iterator<String>{
		private int index = 0;
		
		public boolean hasNext() {
			if(index < kanallarListesi.size()) {
				return true;
			}
			return false;
		}

		public String next() {
			String kanal = kanallarListesi.get(index);
			index ++ ;
			return kanal;
		}

		public void remove() {
			kanallarListesi.remove(index);
		}

		
		
	}

	public Iterator iterator() {
		return new RadyoIterator();
	}
	
	
	

}

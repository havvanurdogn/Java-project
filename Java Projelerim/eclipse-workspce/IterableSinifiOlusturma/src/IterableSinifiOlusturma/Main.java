package IterableSinifiOlusturma;
import java.util.Iterator;
public class Main {

	public static void main(String[] args) {
		String[] kanallar = {"KralFM","POPMusic","45Radyo","IZMIRIM"}; 
		
		Radyo radyo = new Radyo(kanallar);
		
		for(String s : radyo) {
			System.out.println(s);
		}
		System.out.println("***************************");
		Iterator<Radyo> iterator =  radyo.iterator();
		System.out.println(iterator.next());
		iterator.remove();
		
		System.out.println("***************************");
		for(String s : radyo) {
			System.out.println(s);
		}

	}

}

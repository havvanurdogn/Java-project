package LinkedList;
import java.util.LinkedList;
public class LinkedList_Tanim {

	public static void LinkedList_yazdir(LinkedList<String> gidilecek_yerler) {
		for(String s : gidilecek_yerler) {
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		
		LinkedList<String> gidilecek_yerler = new LinkedList<String>(); 
		
		gidilecek_yerler.add("okul");
		gidilecek_yerler.add("eczane");
		gidilecek_yerler.add("spor salonu");
		gidilecek_yerler.add("hastane");
		gidilecek_yerler.add("muze");
		
		LinkedList_yazdir(gidilecek_yerler);

	}

}

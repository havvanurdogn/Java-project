package CollectionFramework;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
public final class LinkedListt {

	public static void main(String[] args) {
		
		LinkedList<Integer> linkedlist = new LinkedList<Integer>();
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		
		zamanlayici("ArrayList", arraylist);
		zamanlayici("LinkedList", linkedlist);

	}
	
	public static void zamanlayici(String veriTipi , List<Integer> list) {
		long baslangic;
		long bitis;
		
		baslangic = System.currentTimeMillis();
		for(int i = 0 ; i < 100000 ; i++) {
			list.add(0,i);
		}
		bitis = System.currentTimeMillis();
		
		System.out.println(veriTipi +" "+( bitis - baslangic )+" ms");
	}

}

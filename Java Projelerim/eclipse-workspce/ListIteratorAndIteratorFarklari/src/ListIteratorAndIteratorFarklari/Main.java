package ListIteratorAndIteratorFarklari;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.ListIterator;
public class Main {

	public static void main(String[] args) {
		/*List<String> list = new ArrayList<String>();
		Set<String> set = new HashSet<String>();
		
		list.add("Rodya");
		list.add("Sonya");
		list.add("Dunya");
		list.add("Lujin");
		
		set.add("Rodya");
		set.add("Sonya");
		set.add("Dunya");
		set.add("Lujin");
		
		Iterator<String> iterator1 = list.iterator();
		Iterator<String> iterator2 = set.iterator();
		
		while(iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		System.out.println("***************************************");
		
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}*/
		
		List<String> list = new ArrayList<String>();
		
		list.add("Rodya");
		list.add("Sonya");
		list.add("Dunya");
		list.add("Lujin");
		
		ListIterator<String> iterator = list.listIterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("***************************************");
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
		
		while(iterator.hasNext()) {
			String value = iterator.next();
			if(value.equals("Lujin")) {
				iterator.remove();
			}
		}
		
		System.out.println("***************************************");
		
		for(String s : list) {
			System.out.println(s);
		}
		

	}

}

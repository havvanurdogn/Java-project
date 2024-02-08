package CollectionFramework;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;
import java.util.LinkedHashSet;
public class SetMain {

	public static void main(String[] args) {
		/*Set<String> set1  =  new HashSet<String>() ;
		Set<String> set2  =  new LinkedHashSet<String>() ;
		Set<String> set3  =  new TreeSet<String>() ;
		
		set1.add("Java");
		set1.add("CSS");
		set1.add("React");
		set1.add("Python");
		set1.add("Go");
		
		set2.add("Java");
		set2.add("CSS");
		set2.add("React");
		set2.add("Python");
		set2.add("Go");
		
		set3.add("Java");
		set3.add("CSS");
		set3.add("React");
		set3.add("Python");
		set3.add("Go");
		
		System.out.println("**************************************");
		System.out.println("HashSet : ");
		for(String s : set1) {
			System.out.println(s);
		}
		
		System.out.println("**************************************");
		System.out.println("LinkedHashSet : ");
		for(String s : set2) {
			System.out.println(s);
		}
		
		System.out.println("**************************************");
		System.out.println("TreeSet : ");
		for(String s : set3) {
			System.out.println(s);
		}*/
		
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
		
		set1.add("Java");
		set1.add("C++");
		set1.add("React");
		set1.add("JavaScript");
		set1.add("Python");
		
		set2.add("Go");
		set2.add("React");
		set2.add("C#");
		
		Set<String> fark = new HashSet<String>(set2);
		
		System.out.println(fark.removeAll(set1));
		System.out.println(fark);
		
		Set<String> kesisim = new HashSet<String>(set1);
		
		/*System.out.println(kesisim.retainAll(set2));
		System.out.println(kesisim);*/
	}

}

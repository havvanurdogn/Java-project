package CollectionFramework;
import java.util.ArrayList;
import java.util.List;
public class ArrayListt {
	public static void main(String[] args) {
		
		List<String> arr = new ArrayList<String>(); 
		
		arr.add("Java");
		arr.add("React");
		arr.add("Python");
		arr.add("C++");
		
		arr.remove(0);
		
		//System.out.println(arr.get(0));
		
		for(String s : arr) {
			System.out.println(s);
		}
		
	}
}

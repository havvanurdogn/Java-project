package array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArrayListOgrenimi {
	public static void yazdir(ArrayList<String> a) {
		for(int i = 0 ; i < a.size() ; i++) {
			System.out.println(a.get(i));
		}
	}
	

	public static void main(String[] args) {
		ArrayList<String> arraylist = new ArrayList<String>();
		
		String str = "Hello";
		char ch[] = str.toCharArray();
		ArrayList<Character> arr = new ArrayList<Character>();
		for(int i = 0 ; i < ch.length ; i++) {
			arr.add(ch[i]);
		}
		boolean b = arr.get(0).equals('o');
		arraylist.add("Madrigal");
		arraylist.add("Dolu Kadehi Ters Tut");
		arraylist.add("YuzYuzeyken Konusuruz");
		arraylist.add("Model");
		arraylist.add("Seksendort");
		
		//arraylist.remove(3);
		
		//arraylist.add(0, "Ikilem");
		
		//System.out.println(arraylist.indexOf("Model"));
		
		//arraylist.set(0, "Sebnem Ferah");
		
		/*for(int i =  0 ; i < arraylist.size() ; i++) {
			System.out.println(arraylist.get(i));
		}*/
		 //String a = arraylist.get(0);
		 //System.out.println(a);
		
		yazdir(arraylist);

	}

}

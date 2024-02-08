package array;
import java.util.ArrayList;
public class AutoboxingAndUnboxing {

	public static void main(String[] args) {
		
		/*Wrapper Class
		
		boolean = Boolean
		double  = Double
		int     = Integer
		short   = Short
		long    = Long
		char    = Char
		float   = Float
		byte    = Byte*/
		
		ArrayList<String> arraylist = new ArrayList<String>();
		
		ArrayList<Integer> arraylist2 = new ArrayList<Integer>();
		
		//Wrapper Classında bulunan tüm veri tipleri icin ayni islem uygulanır.
		//String için uygulanmaz çünkü string bir classtır. Diğerleri ise ilkel veri tipidir.
		
		for(int i = 0 ; i < 10 ; i++) {
			arraylist2.add(i*3); // Autoboxing => arraylist2.add(Integer.valueOf(i*3))
		}
		
		for(int i = 0 ; i < arraylist2.size() ; i++) {
			System.out.println(arraylist2.get(i)); // Unboxing => arraylist2.get(i).intValue());
		}
		

	}

}

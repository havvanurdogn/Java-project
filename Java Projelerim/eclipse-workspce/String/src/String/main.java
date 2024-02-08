package String;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		String s1 = "java";
		char ch[] = {'h','e','l','l','o'};
		String s2 = new String(ch);
		String s3 = new String(" example");
		System.out.println(s1);
		System.out.println(s2);
		
		
		
		//concatenation
		
		
		System.out.println(s3);
		String s4 = s1.concat(s3);
		String s5 = "hello".concat(" world");
		String s6 = s1+s3;
		String s7 = "hello" + " world";
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		
		
		// comparesion
		
		System.out.println(s1.compareTo(s7));
		System.out.println(s1==s2);
		System.out.println(s1.equals(s7));
		
		//substring
		
		System.out.println(s6.substring(6));
		System.out.println(s6.substring(0, 6));
		
		
		//length(String)
		
		int x = s1.length();
		System.out.println(x);
		
		
		//charAt(int index) and contain
 		
		char ch1 = s1.charAt(2);
		System.out.println(ch1);
		boolean b1 = s6.contains(s1);
		boolean b2 = s6.contains(s7);
		boolean b3 = s6.contains("book");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		
		/*getChars(int main_start_index , int main_end_index , char[] copy , int copy_start_index);
		 that function helps to copy paste String to char[].
		 */
		
		String s8 = "The name of book is Romeo and Juliet.";
		char ch2[] = new char [100];
		s8.getChars(20, 36, ch2, 0);
		System.out.println(ch2);
		
		
		//indexOf("character from String") return int
		
		
		System.out.println(s8.indexOf("is"));
		
		
		
		//replace()
		
		
		
		String replace_string1 = s8.replace("Romeo and Juliet", "Alice Harikalar Diyarinda");
		System.out.println(replace_string1);
		String replace_string2 = s8.replace(".", "?");
		System.out.println(replace_string2);
		
		
		// toCharArray()
		
		
		char ch3[] = s1.toCharArray();
		for(int i = 0 ; i<s1.length() ; i++) {
			System.out.print(ch3[i]+".");
		}
		System.out.println();
		ArrayList<Character> ch33 = new ArrayList<Character>();
		
		
		// startswith(String)  endswith(String)
		
		
		
		// toLowerCase toUpperCase
		
		
		
		//Integer.parseInt(String) => String şeklindeki sayıyı integer veri tipine çevirmeyi sağlar.
		
		/*String str = new String("78963");
		int z = Integer.parseInt(str);
		System.out.println(z);*/
		
		
		// String.valueOf(int) => int şeklindeki sayıyı String veri tipine çevirir.
		
		
		
		int z = 78963;
		String str = String.valueOf(z);
		System.out.println(str.charAt(2));
		
		

	}

}

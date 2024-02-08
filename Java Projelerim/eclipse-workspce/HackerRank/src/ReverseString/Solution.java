package ReverseString;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Solution {

    static boolean isAnagram(String a, String b) {
    	if(a.length() == b.length()) {
    		a = a.toLowerCase();
    		b = b.toLowerCase();
    		int flag = 1;
    		
    		Map<Character, Integer> treeMap1 = new TreeMap<Character, Integer>();
    		Map<Character, Integer> treeMap2 = new TreeMap<Character, Integer>();
    		
    		for(int i = 0 ; i < a.length() ; i++) {
    			
    			char temp1 = a.charAt(i);
    			char temp2 = b.charAt(i);
    			
    			if(treeMap1.containsKey(temp1)) treeMap1.replace(temp1, treeMap1.get(temp1) + 1);
    			else treeMap1.put(temp1, 1);
    			
    			if(treeMap2.containsKey(temp2)) treeMap2.replace(temp2, treeMap2.get(temp2) + 1);
    			else treeMap2.put(temp2, 1);
    			
    		}
    		
    		for(int i = 0 ; i < a.length() ; i++) {
    			char temp = a.charAt(i);
    			if(treeMap1.containsKey(temp) && treeMap2.containsKey(temp)) {
    				if(treeMap1.get(temp) != treeMap2.get(temp)) flag = -1;
    			}
    		}
    		
    		if(flag == -1) return false;
    		else return true;
    	}
        return false;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
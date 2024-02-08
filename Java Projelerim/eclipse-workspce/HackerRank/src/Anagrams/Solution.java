package Anagrams;

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        
        if(a.length() == b.length()) {
        	char [] array1 = new char[50];
            char [] array2 = new char[50];
        	
        	for(int i = 0 ; i < a.length() ; i++) {
        		
            	array1[i] = a.charAt(i);
            	array2[i] = b.charAt(i);
            	
            }
        	
        	for(int i = 0 ; i < a.length() ; i++) {
        		char temp = array1[i];
        		
        		for()
        	}
        }
        
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

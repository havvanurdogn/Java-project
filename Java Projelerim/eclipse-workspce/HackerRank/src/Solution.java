import java.util.Scanner;
public class Solution {
    public static String getSmallestAndLargest(String s, int k) {
    	String smallest = "";
        String largest = "";
        String[] array = new String[s.length() - k + 1];
        String temp= "";
        
        for(int i = 0 ; i < array.length ; i++) {
            if(i == array.length - 1) array[i] = s.substring(i);
            else  array[i] = s.substring(i, i+k);
            System.out.println(array[i]);
        }
        /*for(int i = 0 ;i < array.length ; i++) {
        	for(int j = 0 ; j < array.length - i - 1 ;i++) {
        		if(array[j].compareTo(array[j+1]) > 0) {
                    temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
        	}
        }*/
        
        
        
        smallest = array[0];
        largest = array[array.length - 1];
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
package array;
import java.util.ArrayList;
class Solution {
    public static int singleNumber(int[] nums) {
        int i = 0 , j = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(i = 0; i < nums.length ; i++){
            list.add(nums[i]);
        }
        
        for(i = 0; i < list.size() ; i++){
            for(j = 0; j < list.size() ; j++){
                if( i == j);
                else {
                    if(list.get(i) == list.get(j)){
                    	if(i<j) {
                    		list.remove(i);
                        	list.remove(j-1);
                    	}
                    	else {
                    		list.remove(i);
                    		list.remove(j);
                    	}
                    }
                }
            }
        }
        for(i = 0 ;i < list.size() ; i++) {
        	System.out.println(list.get(i));
        }
        int a = list.get(0);
        return a;
    }
    public static void main(String [] args) {
    	int [] nums = {2,2,1};
    	
    	System.out.println(nums.length);
    	singleNumber(nums);
    	//System.out.println(singleNumber(nums));
    }
}


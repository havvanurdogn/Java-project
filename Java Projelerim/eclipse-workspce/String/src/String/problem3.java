package String;

public class problem3 {

	public static void main(String[] args) {
		
	    String s1 = "Ali and Ayse come.";
	    
	    char ch1[] = s1.toCharArray();
	    
	    int i,j=0;
	    
	    for(i=0;i<s1.length();i++)
	    {
	    	
	    	if(ch1[i]==' ') {
	    		System.out.println(s1.substring(j, i));
	    		j=i;
	    	}
	    	
	    }

	}

}

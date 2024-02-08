package String;

public class problem1 {

	public static void main(String[] args) {
		
		String s1 = "Ali and Ayse had coffee and water by hand.";
		
		int i,k,count=0;
		
		char c1[] = s1.toCharArray();
		
		for(i=0;i<s1.length();i++) {
			if(c1[i]=='a')
				if(c1[i+1]=='n')
					if(c1[i+2]=='d')
						if((c1[i-1]==' ')&&(c1[i+3]==' '))
							count++;
		}
		System.out.println(count);
		
		boolean b1 = s1.contains("and");
		
		if(b1 == true) System.out.println("It contains.");
		else System.out.println("It do not contain.");
		
		String s2 = "Ali and Ayse had coffe and water by hand.";
		
		boolean b2 = s1.equals(s2);
		if(b2==true) System.out.println("They are equals.");
		else System.out.println("They are not equals.");

	}

}

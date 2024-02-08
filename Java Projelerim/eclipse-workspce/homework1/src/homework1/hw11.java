package homework1;
public class hw11 {
	public static void main(String[] args) {
		System.out.println("This program cumpute the sum of the first 100 prime numbers.");
		int i=2,f=0,j,p=0,sum=0;
		while(p<=100) {
			f=0;
			for(j=1;j<=i;j++) {
				if(i%j==0) f++;
			}
			if(f<3) {
				sum += i;
				p++;
			}
			i++;
		}
		System.out.println("sum is "+sum);	
	}
}

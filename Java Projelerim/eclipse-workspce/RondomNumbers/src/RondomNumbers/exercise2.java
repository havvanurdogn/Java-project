package RondomNumbers;
//import java.util.Random;
public class exercise2 {

	public static void main(String[] args) {
		//Random random = new Random();
		int i,stu,count=0;
		int [] arr = new int [100];
		for(i=0;i<100;i++) {
			stu = (int)(Math.random()*(25-17)+17) + 1 ;
			arr[i] = stu;
			if(stu == 25) 
				count++;
			
		}
		System.out.println("Count is "+count);
		
		for(i=0;i<100;i++) {
			System.out.println(arr[i]);
		}

	}

}

package RondomNumbers;
import java.util.Random;
public class exercise1 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int i;
		for(i=0;i<20;i++) {
			int dice1 = random.nextInt(6);
			dice1 = dice1+1;
			int dice2 = random.nextInt(6);
			dice2 = dice2+1;
			System.out.println(dice1+"   "+dice2);
		}
		
		
		

	}

}

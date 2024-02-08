package RondomNumbers;
import java.util.Random;
public class main {

	public static void main(String[] args) {
		Random rndm = new Random();
		int num = rndm.nextInt(100);
		num = num+1;
		System.out.println(num);

	}

}

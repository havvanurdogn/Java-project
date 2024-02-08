package StaticInner;
import java.util.Scanner;
public class Matematik {

	private static double PI = Math.PI;
	
			
	public static class Alan{
		public static void daireAlan() {
			Scanner read =  new Scanner(System.in);
			System.out.print("Lutfen dairenin yaricapini giriniz : ");
			int yaricap = read.nextInt();
			System.out.println("Dairenin alani : "+(yaricap * yaricap * PI ));
		}
	}
}

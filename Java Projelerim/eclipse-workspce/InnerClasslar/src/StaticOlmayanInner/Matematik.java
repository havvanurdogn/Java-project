package StaticOlmayanInner;
import java.util.Scanner;
public class Matematik {

	Scanner read = new Scanner(System.in);
	private double PI = Math.PI;
	
	public class Factorial{
		
		public void faktoriyel() {
			System.out.print("Lutfen bir sayi giriniz : ");
			int sayi = read.nextInt();
			int facto = 1 ;
			for(int i = 2 ; i <= sayi ; i++ ) {
				facto *= i ;
			}
			System.out.println(sayi + " 'in faktoriyeli : "+facto);
			
		}
		
	}
	
	public class Asal{
		
		public boolean asal_mi(int sayi1) {
			
			int i = 2 ; 
			
			while(i < sayi1) {
				if(sayi1 % i == 0) {
					return false;
				}
				i++;
			}
			
			return true;
		}
		
	}
	
	public class Alan{
		
		public class DaireAlan{
			
			public void alan_hesapla(){
				
				System.out.print("Dairenin yaricapini giriniz : ");
				int yaricap = read.nextInt();
				System.out.println("Dairenin alani : "+( PI * yaricap * yaricap));
				
			}
		}
		
	}
}

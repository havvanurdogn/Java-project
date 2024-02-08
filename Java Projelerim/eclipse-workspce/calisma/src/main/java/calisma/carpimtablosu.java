package calisma;
import java.util.Scanner;
public class carpimtablosu {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("This program shows the multiplication table.");
		int i,j;
		for(i=1;i<=10;i++) {
			for(j=1;j<=10;j++) {
				System.out.print("\t"+i*j);
			}
			System.out.println("");
		}

	}

}

package InnerClassesExample;
import java.util.Scanner;
public class Vec {
	
	private String isim ;
	private int i ;
	private int j ;
	private int k ;
	
	public Vec(String isim ) {
		this.isim = isim ;
		Scanner read = new Scanner(System.in);
		System.out.println(isim+" in i,j ve k degerlerini sirasiyla giriniz.");
		System.out.print("i : ");
		this.i = read.nextInt();
		System.out.print("j : ");
		this.j = read.nextInt();
		System.out.print("k : ");
		this.k = read.nextInt();
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}
	
	

}

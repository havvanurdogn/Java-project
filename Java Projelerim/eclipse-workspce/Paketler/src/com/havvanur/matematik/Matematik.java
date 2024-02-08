package com.havvanur.matematik;

public class Matematik  implements IMatematik{

	public void toplama(int a, int b) {
		System.out.println("Toplama islemi sonucu : "+(a+b));
	}

	public void cikarma(int a, int b) {
		System.out.println("Cikarma islemi sonucu : "+(a-b));
		
	}

	public void carpma(int a, int b) {
		System.out.println("Carpma islemi sonucu : "+(a*b));
		
	}

	public void bolme(int a, int b) {
		System.out.println("Bolme islemi sonucu : "+(double)(a/b));
		
	}

}

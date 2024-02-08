package LinkedList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
public class SehirTuru{
	
	public static void islemleriGoster() {
		String islemler = "0.Islemleri Goruntule\n"+
	                      "1.Bir onceki sehire git.\n"+
				          "2.Bir sonraki sehire git.\n"+
	                      "3.Uygulamadan cikis yap.";
		System.out.println(islemler);
	}
	public static void sehirleriTurla(LinkedList<String> sehirler) {
		
		ListIterator<String> iterator = sehirler.listIterator();
		Scanner read = new Scanner(System.in);
		int islem;
		boolean cikis = false;
		boolean ileri = true;
		
	    while(!cikis) {
	    	System.out.println("Lutfen bir islem seciniz : ");
	    	islem = read.nextInt();
	    	
	    	switch(islem) {
	    	case 0 :
	    		islemleriGoster();
	    		break;
	    		
	    	case 1 :
	    		if(ileri) {
	    			if(iterator.hasPrevious()) {
	    				iterator.previous();
	    			}
	    			ileri = false ;
	    		}
	    		if(iterator.hasPrevious()) {
	    			System.out.println("Bir onceki sehre gidiliyor : "+iterator.previous());
	    		}
	    		else {
	    			System.out.println("Gidilecek sehir kalmamistir...");
	    			
	    		}
	    		
	    		break;
	    		
	    	case 2 :
	    		if(!ileri) {
	    			if(iterator.hasNext()) {
	    				iterator.next();
	    			}
	    			ileri = true;
	    		}
	    		if(iterator.hasNext()) {
	    			System.out.println("Bir sonraki sehre gidiliyor : "+iterator.next());
	    		}
	    		else {
	    			System.out.println("Gidilecek sehir kalmamistir...");
	    			
	    		}
	    		
	    		break;
	    		
	    	case 3 :
	    		cikis = true;
	    		System.out.println("Uygulamadan cikiliyor...");
	    		break;
	    		
	    	default :
	    		System.out.println("Gecersiz islem...");
	    		break;
	    	
	    	}
	    }
	}
	public static void main(String [] args) {
		LinkedList<String> sehirler = new LinkedList<String>();
		islemleriGoster();
		sehirler.add("Manisa");
		sehirler.add("Mugla");
		sehirler.add("Aydin");
		sehirler.add("Istanbul");
		sehirleriTurla(sehirler);
		
		
		
	}
}


package ExceptionTryCatch;

public class Main {

	public static void main(String[] args) {
		
		
		int [] arr = {3,45,88,27};
		
		String isim = null;
		String kod = "52mhg";
		
		//Integer.parseInt(isim); NumberFormatException
		//Integer.parseInt(kod); NumberFormatException
		//Integer.parseInt(null); NumberFormatException
		
		try {
			int a = 25/0;
		}
		
		catch(RuntimeException a){
			System.out.println("Herhangi bir sayi sifira bolunemez...");
		}
		
		try {
			System.out.println(arr[56]);
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Arrayin boyunu astiniz...");
		}
		System.out.println("Bu kisim calisiyor.");
		System.out.println(arr[0]);
		
	}

}

package Interface;

public class Main {

	public static void main(String[] args) {
		
		IMuhendis muhendis1 = new PcMuhendisi(true , false);
		MachineEngineering muhendis2 = new MachineEngineering(false , false);
		
		String[] array = {"Vestel","BilgiAdam Teknoloji","Intertech","Akbank"};
		String[] array2 = {"ASELSAN" , "Otokoc"};
		String[] arr = {"Mustafa Murat Coskun","Can Boz"};
		
		/*muhendis1.adliSicil();
		muhendis1.askerlikDurumu();
		muhendis1.isTecrubesi(array);
		System.out.println(muhendis1.mezuniyetNotu(3.42));*/
		
		muhendis2.adliSicil();
		muhendis2.askerlikDurumu();
		System.out.println(muhendis2.mezuniyetNotu(2.78));
		muhendis2.isTecrubesi(array2);
		muhendis2.referansGetir(arr);
		muhendis2.calis();

	}

}

package LinkedList;
import java.util.LinkedList;
import java.util.ListIterator;
public class LinkIterator_Tanim {

	public static void siraliEkle(LinkedList<String> kitaplar , String yeni) {
		
		ListIterator<String> iterator = kitaplar.listIterator();
		
		while(iterator.hasNext()) {
			
			int karsilastirma = iterator.next().compareTo(yeni);
			
			if(karsilastirma == 0) {
				System.out.println("Listede aynı adda bir kitap bulunmakta.");
				return;
			}
			
			else if(karsilastirma < 0) {
				
			}
			
			else if(karsilastirma > 0) {
				iterator.previous();
				iterator.add(yeni);
				return;
			}
		}
		
		iterator.add(yeni);
	}
	public static void LinkedList_yazdir(LinkedList<String> kitaplar) {
		ListIterator<String> iterator = kitaplar.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	
	public static void main(String[] args) {
		
		LinkedList<String> kitaplar = new LinkedList<String>();
		
		siraliEkle(kitaplar, "Suc ve Ceza");
		siraliEkle(kitaplar, "Cesur Yeni Dunya");
		siraliEkle(kitaplar, "Hayvan Ciftigi");
		siraliEkle(kitaplar, "Fareler ve Insanlar" );
		siraliEkle(kitaplar, "Var Misin");
		siraliEkle(kitaplar, "Bir Omur Nasil Yasanir");
		
		
		/*kitaplar.add("Suc ve Ceza");
		kitaplar.add("Cesur Yeni Dunya");
		kitaplar.add("Hayvan Ciftigi");
		kitaplar.add("1984");
		kitaplar.add("Fareler ve Insanlar");
		
		LinkedList_yazdir(kitaplar);
		System.out.println("********************************");
		//kitaplar.add(2,"Bir Omur Nasil Yasanir");
		kitaplar.remove(3);*/
		
		
		LinkedList_yazdir(kitaplar);

	}

}

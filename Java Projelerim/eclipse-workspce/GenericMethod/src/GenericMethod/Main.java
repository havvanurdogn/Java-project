package GenericMethod;

public class Main {

	public static void main(String[] args) {
		
		Sayisal s1 = new Sayisal(35, 40, 45, 5);
		Sayisal s2 = new Sayisal(45, 50, 45, 10);
		
		EsitAgirlik ea1 = new EsitAgirlik(45, 30, 3, 38);
		EsitAgirlik ea2 = new EsitAgirlik(43, 29, 4, 46);
		
		Sayisal b1 = birinci(s1, s2);
		EsitAgirlik b2 = birinci(ea1, ea2);
		
		System.out.println("Sayisal birincisinin puani : "+b1.puanHesaplama());
		System.out.println("Esit agirlik birincisinin puani : "+b2.puanHesaplama());
		
		
	}
	public static <E extends Aday> E birinci (E e1 , E e2){
		if(e1.puanHesaplama()>e2.puanHesaplama()) {
			return e1;
		}
		
		return e2;
	}

}

package GenericSinifi;

public class Main {

	public static void main(String[] args) {
		Character[] char_dizi = {'E','C','L','I','P','S','E'};
		String[] string_dizi = {"Suc ve Ceza","Denemeler","Kumarbaz"};
		Integer[] integer_dizi = {1,2,3,4,5};
		Ogrenci[] ogrenci_dizi = { new Ogrenci("Oya"), new Ogrenci("Yasemin") , new Ogrenci("Sevgi")};
		
		
		/*OgrenciYazdir.yazdir(ogrenci_dizi);
		System.out.println("*****************************************");
		CharYazdir.yazdir(char_dizi);
		System.out.println("*****************************************");
		StringYazdir.yazdir(string_dizi);
		System.out.println("*****************************************");
		IntegerYazdir.yazdir(integer_dizi);*/
		
		//Eger generic sınıfı olmasaydı her biri icin ayrı sınıf oluşturup ayrı method tanımlayacaktık.
		
		/*YazdirG<Character> charYazdir = new YazdirG<Character>();
		YazdirG<String> stringYazdir = new YazdirG<String>();
		YazdirG<Integer> integerYazdir = new YazdirG<Integer>();
		YazdirG<Ogrenci> ogrenciYazdir = new YazdirG<Ogrenci>();
		
		charYazdir.Yazdir(char_dizi);
		System.out.println("*****************************************");
		stringYazdir.Yazdir(string_dizi);
		System.out.println("*****************************************");
		integerYazdir.Yazdir(integer_dizi);
		System.out.println("*****************************************");
		ogrenciYazdir.Yazdir(ogrenci_dizi);*/
		
		yazdir(char_dizi);
		System.out.println("*****************************************");
		yazdir(string_dizi);
		System.out.println("*****************************************");
		yazdir(integer_dizi);
		System.out.println("*****************************************");
		yazdir(ogrenci_dizi);

	}
	
	public static <E> void yazdir(E[] dizi) {
		
		for (E e : dizi) {
			System.out.println(e);
		}
		
	}
	

}

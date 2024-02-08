package InnerClassesExample;

public class Problem {
	
	public static class Matematik{
		public static void daireAlani(int yaricap) {
			System.out.println("Dairenin alani : "+(Math.PI * yaricap * yaricap));
		}
		
		public static void ucgenCevre(int a , int b , int c) {
			System.out.println("Ucgenin cevresi : "+(a+b+c));
		}
	}
	
	public static class Fizik{
		public static void icCarpim(Vec vec1 , Vec vec2) {
			int iccarpim = vec1.getI()*vec2.getI()
						 + vec1.getJ()*vec2.getJ()
						 + vec1.getK()*vec2.getK();
			System.out.println(vec1.getIsim()+" ile "+vec2.getIsim()+" in ic carpimi = "+iccarpim);
		}
	}

}

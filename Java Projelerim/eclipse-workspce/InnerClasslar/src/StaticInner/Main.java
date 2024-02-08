package StaticInner;

public class Main {

	public static void main(String[] args) {

		Matematik.Alan alan = new Matematik.Alan();
		alan.daireAlan();  //sadece class staticse bu şekilde kullanılır.
		
		Matematik.Alan.daireAlan(); // eğer class ve method static'se bu şekilde kullanılabilir.
		
		
	}

}

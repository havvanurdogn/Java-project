package LokalInner;

public class Main {

	public static void main(String[] args) {
		
		class Alan /* public static kelimeleri burada kullanılamaz*/{
			
			public void daire_alan(int yaricap) {
				System.out.println("Dairenin alani : "+(yaricap*yaricap*Math.PI));
			}
		}
		
		Alan alan = new Alan();
		alan.daire_alan(10);
		
		
	}

	public void Deneme() {
		//Alan alan1 = new Alan(); olmuyor çünkü alan classı static değil kullanıldıktan sonra kayboluyor
	}
}

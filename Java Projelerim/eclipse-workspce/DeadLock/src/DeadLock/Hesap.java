package DeadLock;

public class Hesap {
	
	private int balance = 10000 ; 

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void deposit(int num) {
		balance += num;
	}
	
	public void withdraw(int num) {
		balance -= num;
	}
	
	public static void transfer(Hesap account1 , Hesap account2 , int num) {
		account1.withdraw(num);
		account2.deposit(num);
	}
	

}

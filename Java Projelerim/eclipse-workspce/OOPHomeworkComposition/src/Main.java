public class Main { 

	public static void main(String[] args) { 

		Customer customer = new Customer(852, "abc", 'f'); 
		Account account = new Account(4532, customer, 1469.52479); 

		System.out.println(customer.toString()); 
		System.out.println(account.toString()); 
		System.out.println("***********************"); 
		account = account.withdraw(95.5793); 
		System.out.println(account.toString()); 
	} 
}
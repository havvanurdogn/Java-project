public class Account { 

	private int id; 
	private Customer customer; 
	private double balance = 0.0; 

	public Account(int id, Customer customer, double balance) { 
		this.id = id; 
		this.customer = customer; 
		this.balance = balance; 
	} 

	public Account(int id, Customer customer) { 
		this.id = id; 
		this.customer = customer; 
	} 

	public double getBalance() { 
		return balance; 
	} 

	public void setBalance(double balance) { 
		this.balance = balance; 
	} 

	public int getId() { 
		return id; 
	} 

	public Customer getCustomer() { 
		return customer; 
	} 

	public String toString() { 
		return customer + "(" + id + ")" + " balance=$" + String.format("%.2f", balance); 
	} 

	public Account deposit(double amount) { 
		return new Account(id, customer, balance + amount); 
	} 

	public Account withdraw(double amount) { 
		if(balance >= amount) { 
			return new Account(id, customer, balance - amount); 
		}
		else { 
			System.out.println("Amount withdrawn exceeds the current balance!"); 
			return new Account(id, customer, balance); 
		} 
	}
} 

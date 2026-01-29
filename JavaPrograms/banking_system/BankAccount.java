package banking_system;

public abstract class BankAccount {
	private double  balance=10000;
	double limit=50000;

	public double getBalance() {
		if(balance > -limit) return balance;
		return -1;
	}

	public void setBalance(double balance) {
		if(balance>=0) {
			this.balance = balance;
		}
	} 
	
	public abstract void withdraw(double amount);
	
	public void displayBalance() {
		System.out.println("balance : "+balance);
	}
}

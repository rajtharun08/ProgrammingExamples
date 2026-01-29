package banking_system;

public class SavingsAccount extends BankAccount{
	public void withdraw(double amount) {
		if(getBalance()>0 && getBalance()>=amount) {
			setBalance(getBalance()-amount);
		}
		else {
			System.out.println("insufficient balance");
		}
	}
}

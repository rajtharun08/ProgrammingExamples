package banking_system;

public class CurrentAccount extends BankAccount {
	public void withdraw(double amount) {
		//overdraft
		if(getBalance()+limit > amount) {
			setBalance(getBalance()-amount);
		}
		else
		{
			System.out.println("insufficient balance");
		}
	}
}

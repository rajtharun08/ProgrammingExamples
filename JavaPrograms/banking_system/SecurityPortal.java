package banking_system;

public class SecurityPortal {
	String userPin="1234";
	BankAccount b;
	
	public boolean isCorrect(String pin) {
		return pin.equals(userPin);
	} 
	
	public BankAccount setAccount(String pin,int ch) {
		if(isCorrect(pin)) {
			if(ch==1) {
				b=new SavingsAccount();
			}
			else {
				b=new CurrentAccount();
			}
		}
		return b;
	}
	
}

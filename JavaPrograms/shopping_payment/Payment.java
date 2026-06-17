package shopping_payment;

public abstract class Payment {
	private double amount;

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		if(amount>0)this.amount = amount;
	}
	
	public void displayAmount() {
		System.out.println("amount : "+amount);
	}
	
}

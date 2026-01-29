package banking_system;

import java.util.Scanner;

public class BankDriver {
	static BankAccount b;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter pin : ");
		String pin=sc.next();
		SecurityPortal s=new SecurityPortal();
		if(s.isCorrect(pin)) 
		{
			System.out.printf("enter your choice :\n1.Savings Account \n2.Current Account \n\n");
			int ch=sc.nextInt();
			b=s.setAccount(pin,ch);		
			int choice;
			do {
				System.out.printf("enter choice : \n1.withdraw \n2.balance \n3.exit \n ");
				choice=sc.nextInt();
				if(choice==1) {
					System.out.println("enter amount to withdraw : ");
					double amount=sc.nextDouble();
					b.withdraw(amount);
				}
				else if(choice==2) {
					System.out.println("balance : "+b.getBalance());
				}
				else if(choice ==3 ) {
					break;
				}
				else {
					System.out.println("enter valid choice");
				}
			} while(choice!=3);
		}
		else {
			System.out.println("Wrong Pin !!!");
		}
	}
}

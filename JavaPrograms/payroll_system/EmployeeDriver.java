package payroll_system;

import java.util.Scanner;

public class EmployeeDriver {
	public static void main(String[] args) {
		Employee e;
		Scanner sc=new Scanner(System.in);
		int type;
		
		System.out.printf("enter type of Employee\n1.Permanent Employee\n2.Contract Employee\n");
		type=sc.nextInt();
		if(type==1) {
			e=new PermanentEmployee();
		}
		else {
			e=new ContractEmployee();
		}
		e.setBasicSalary(10000);
		e.calculateSalary();
	}
	
	
}

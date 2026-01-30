package payroll_system;

public class ContractEmployee extends Employee {
	public void calculateSalary() {
		System.out.println("salary : "+getBasicSalary());
	}
}

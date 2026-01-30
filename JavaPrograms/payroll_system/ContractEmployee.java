package payroll_system;

public class ContractEmployee extends Employee {
	@Override
	public void calculateSalary() {
		System.out.println("salary : "+getBasicSalary());
	}
}

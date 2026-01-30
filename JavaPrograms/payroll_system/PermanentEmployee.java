package payroll_system;

public class PermanentEmployee extends Employee {
	int hra=5000;
	int da=1200;
	
	@Override
	public void calculateSalary() {
		int sal=getBasicSalary()+hra+da;
		setBasicSalary(sal);
		System.out.println("salary : "+sal);
	}
}

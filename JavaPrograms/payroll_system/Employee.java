package payroll_system;

public abstract class Employee {
	private int basicSalary;

	public int getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(int basicSalary) {
		if(basicSalary > 0 ) {
			this.basicSalary = basicSalary;
		}
	}
	
	public void displaySalary() {
		System.out.println("salary : "+basicSalary);
	}
	
	public abstract void calculateSalary();
}

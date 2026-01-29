package vehicle;

public abstract class Vehicle {
	private int speed;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void displaySpeed() {
		System.out.println("fast");
	}
	
	public abstract void move();
	
}

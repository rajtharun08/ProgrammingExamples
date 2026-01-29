package vehicle;

import java.util.Scanner;

public class VehicleDriver {
	
	static Vehicle v;
	public static void main(String[] args) {
		System.out.println("enter the type of vehicle ");
		Scanner sc=new Scanner(System.in);
		String ch=sc.next();
		if(ch.equals("car")) {
			v=new Car();
		}
		else {
			v=new Bike();
		}
		if(v!=null) {
			System.out.println("enter speed of the vehicle : ");
			v.setSpeed(sc.nextInt());
			System.out.println(v.getSpeed());
			v.displaySpeed();
			v.move();
		}
	}
}

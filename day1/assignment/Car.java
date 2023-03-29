package week1.day1.assignment;

public class Car {
	public void driveCar() {
		System.out.println("driving a car");
	}
	public void applyBrake() {
		System.out.println("applying Brake");
	}
	public void soundHorn() {
		System.out.println("sound horn");
	}
	public void isPunture() {
		System.out.println("It is puncture");
	}
	public static void main(String[] args) {
		Car carobj = new Car();
		carobj.driveCar();
		carobj.applyBrake();
		carobj.soundHorn();
		carobj.isPunture();
	}

}

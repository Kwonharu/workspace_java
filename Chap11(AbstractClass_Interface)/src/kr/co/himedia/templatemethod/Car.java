package kr.co.himedia.templatemethod;

public abstract class Car {
	public void startCar() {
		System.out.println("시동을 걸다.");
	}
	public void turnOff() {
		System.out.println("시동을 끈다.");
	}
	public abstract void drive();
	public abstract void stop();
	public abstract void washCar();
	public void wiper() {};
	
	final public void run() {
		startCar();
		wiper();
		drive();
		stop();
		turnOff();
		washCar();
	};
	
}

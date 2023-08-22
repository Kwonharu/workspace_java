package kr.co.himedia.abstractclass;

public abstract class Computer {
	
	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("Computer turnOn()");
	}
	public void turnOff() {
		System.out.println("Computer turnOff()");
	}
	
}



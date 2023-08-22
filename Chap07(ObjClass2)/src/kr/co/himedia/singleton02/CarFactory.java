package kr.co.himedia.singleton02;

public class CarFactory {
	private CarFactory() {}
										 // ↓ 초기값 == null
	private static CarFactory instance = new CarFactory();
	public static CarFactory getInstance() {
		if(instance==null) {
			instance= new CarFactory();
		}
		return instance;
	}
	
	public Car createCar() {
		Car car = new Car();
		return car;
	}
	
}

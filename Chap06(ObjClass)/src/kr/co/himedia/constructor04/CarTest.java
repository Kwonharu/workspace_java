package kr.co.himedia.constructor04;

public class CarTest {
	public static void main(String[] args) {
		Car car = new Car();
		System.out.println(car);
		
		Car car2 = new Car("red", "auto", 5);
		System.out.println(car2);
		
	}
}

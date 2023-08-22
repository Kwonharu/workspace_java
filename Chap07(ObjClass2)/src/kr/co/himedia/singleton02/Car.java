package kr.co.himedia.singleton02;

public class Car {
	private int carNum;
	public static int serialNum = 1000;
	
	public Car() {
		Car.serialNum++;
		carNum=serialNum;
	}

	public int getCarNum() {
		return carNum;
	}
	
}

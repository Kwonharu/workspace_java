package kr.co.himedia.constructor04;

public class Car {

	String color;
	String gearType;
	int door;
	
	
	public Car() {
		//직접적으로 인스턴스 맴버변수를 초기화
//		this.color = "deepdark";
//		this.gearType = "fantasy";
//		this.door = 0;
		this("black","manual",4);
	}
	
	public Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}

	
	@Override
	public String toString() {
		return "Car [color=" + color + ", gearType=" + gearType + ", door=" + door + "]";
	}
	
}

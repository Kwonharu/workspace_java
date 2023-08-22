package kr.co.himedia.singleton02;

/*
 * 자동차 공장은 유일한 객체이고, 여기서 생성되는 자동차는
 * 생산 시 고유의 번호가 부여됨
 * 
 *  자동차 번호 1001번부터 시작
 *  공장 클래스는 싱글톤 패턴을 적용할 것
 *  
 *  ex)
 *  	1001
 *  	1002
 */
public class CarFactoryTest {
	
	public static void main(String[] args) {
	
		CarFactory carFactory = CarFactory.getInstance();
		Car cadillac = carFactory.createCar();
		Car BMW = carFactory.createCar();
		
		System.out.println(cadillac.getCarNum());
		System.out.println(BMW.getCarNum());
	}
	
}

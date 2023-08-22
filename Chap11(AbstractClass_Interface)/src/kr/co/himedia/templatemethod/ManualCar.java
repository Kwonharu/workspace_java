package kr.co.himedia.templatemethod;

public class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("1종 보통");
		System.out.println("내가 직접 출동한다!");
		
	}

	@Override
	public void stop() {
		System.out.println("브레이크!!!");
		
	}

	@Override
	public void washCar() {
		System.out.println("셀프 세차");
		
	}
	
}

package kr.co.himedia.templatemethod;

public class GenerativeAICar extends Car{

	@Override
	public void drive() {
		System.out.println("자율 주행");
		System.out.println("아이쨩이 조종합니다");
		
	}

	@Override
	public void stop() {
		System.out.println("멈춰!");
		
	}

	@Override
	public void washCar() {
		System.out.println("자동 세차");
		
	}
	
}

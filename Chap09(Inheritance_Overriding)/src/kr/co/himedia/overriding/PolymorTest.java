package kr.co.himedia.overriding;

public class PolymorTest {
	public static void main(String[] args) {
		
		/*
		 * Upcasting 객체 생성
		 * - 상속, 재정의(Override), 동적바인딩
		 * - => 다형성 : 상위 클래스가 동일한 메시지로 하위 클래스를 서로 다르게 동작시키는 객체지향 원리   
		 */
		Animal animal = new Dog();
		animal.eat();	//실행 시점에서 사용될(호출될) 메서드가 결정되는 바인딩 (동적바인딩)
		
		animal = new Cat();
		animal.eat();
		
		//Downcasting
		/*
		 * override(재정의) : 동적바인딩 -- 실행시점에서 사용될(호출될) 메서드가 결정되는 바인딩
		 * overlaoding : 정적바인딩 -- 컴파일시점에서 사용될(호출될) 메서드가 결정되는 바인딩
		 */
		((Cat)animal).eat();
		
		
	}
}

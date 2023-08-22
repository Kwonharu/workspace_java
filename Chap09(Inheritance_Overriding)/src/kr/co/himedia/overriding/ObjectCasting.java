package kr.co.himedia.overriding;

public class ObjectCasting {
	public static void main(String[] args) {
		
		//Dog 객체 생성
		Dog dog = new Dog();
		dog.eat();
		
		System.out.println();
		
		//upcasting -- 부모타입으로 자식 객체를 가리킨다
		Animal animal = new Dog();
		animal.eat();
		
		System.out.println();
		
		//upcasting
		Animal animal2 = new Cat();
		animal2.eat();
		
		//downcasting
		Dog ddog = (Dog)animal;
		ddog.chase();
		
		((Dog)animal).chase();
		
		System.out.println();
		
		//downcasting
		Cat ccat = (Cat)animal2;
		ccat.nocturnal();
		
		((Cat)animal2).nocturnal();
		
		
		
	}
}





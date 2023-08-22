package kr.co.himedia.overriding;

public class Cat extends Animal{
	
	public Cat() {
		System.out.println("Cat() 기본 생성자 호출");
	}
	
	public void eat() {
		System.out.println("냥이가 간식을 먹다");
	}
	
	public void nocturnal() {
		System.out.println("잠 좀 자자");
	}
	
	
}

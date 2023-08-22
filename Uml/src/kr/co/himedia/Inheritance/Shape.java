package kr.co.himedia.Inheritance;

//조상클래스
public class Shape {
	
	String color = "black";
	
	public Shape() {
		System.out.println("Shape의 기본 생성자 호출");
	}
	
	public void draw() {
		System.out.println("draw()");
	}
}

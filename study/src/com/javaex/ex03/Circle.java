package com.javaex.ex03;

public class Circle extends Shape{

	// 필드
	private int radius;

	// 생성자
	public Circle() {	//메모리 올리기
	}
	
	public Circle(int radius, String fillColor, String lineColor) {
		super(fillColor, lineColor);
		this.radius = radius;
	}
	
	// 메소드 -gs
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	// 메소드 - 일반
	public void draw() {
		System.out.println("========원 그리기========");
		System.out.println("반지름: " + radius);
		System.out.println("면색: " + super.getFillColor());
		System.out.println("선색: " + super.getLineColor());
		System.out.println("넓이: " + Math.pow(radius, 2)*Math.PI);
		System.out.println("=========================");
		
		
	}
	
}





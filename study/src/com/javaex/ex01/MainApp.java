package com.javaex.ex01;

public class MainApp {

	//필드
	
	
	//생성자
	
	
	//메소드 gs
	
	
	//메소드
	public static void main(String[] args) {
		//메인 시나리오
		
		//Rectangle 메모리에 올린다
		Rectangle r01 = new Rectangle();
		
		r01.setWidth(3);
		r01.setHeight(2);
		r01.setFillColor("Green");
		r01.setLineColor("Red");
		
		r01.draw();
		/*----------------------------------------------------사각형1*/
		System.out.println();
		
		Rectangle r02 = new Rectangle(5, 5, "red", "red");

		r02.draw();
		/*----------------------------------------------------사각형2*/
		System.out.println();
		
		//삼각형1
		Triangle t01 = new Triangle();
		
		t01.setWidth(3);
		t01.setHeight(2);
		t01.setFillColor("blue");
		t01.setLineColor("violet");
		
		t01.draw();
		
		System.out.println();
		//삼각형2
		Triangle t02 = new Triangle(7, 6, "white", "gray");
		
		t02.draw();
		
		System.out.println();
		//원1
		Circle c01 = new Circle();
		
		c01.setRadius(9);
		c01.setFillColor("orange");
		c01.setLineColor("purple");
		
		c01.draw();
		
		System.out.println();
		//원2
		Circle c02 = new Circle(5, "navy", "cian");
		
		c02.draw();
		
	}
	
}







package com.javaex.ex05;

public class Triangle extends Shape implements Drawable{

	// 필드
	protected int width;
	protected int height;

	// 생성자
	public Triangle() {	//메모리 올리기
		super();
	}
	
	public Triangle(int width, int height, String fillColor, String lineColor) {
		/*
		super();
		
		this.width = width;
		this.height = height;
		
		super.setFillColor(fillColor);
		super.setLineColor(lineColor);
		*/
		
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
		
	}
	
	// 메소드 -gs
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
	// 메소드 - 일반
	public void draw() {
		System.out.println("========삼각형 그리기========");
		System.out.println("가로: " + this.width);
		System.out.println("세로: " + this.height);
		System.out.println("면색: " + super.getFillColor());
		System.out.println("선색: " + super.getLineColor());
		System.out.println("=========================");
	}
	
	public double area() {
		return (width * height) / 2;
	}

}





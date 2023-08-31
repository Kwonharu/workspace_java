package com.javaex.ex04;

public class Point implements Drawable {

	//필드
	private int x;
	private int y;

	
	//생성자
	public Point() {
	}
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}


	//메서드 - gs
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
	//메서드 - 일반
	public void draw() {
		//점을 시각화하는 복잡한 로직 작동
		System.out.println("========점 그리기========");
		System.out.println("x: " + x);
		System.out.println("x: " + y);
		System.out.println("=======================");
	}
	
	
	
}





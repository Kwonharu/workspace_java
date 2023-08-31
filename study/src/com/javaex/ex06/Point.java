package com.javaex.ex06;

public class Point {
	
	//필드
	private int x;
	private int y;
	
	//생성자
	public Point() {
		super();	//Object 클래스의 생성자 호출
	}
	
	public Point(int x, int y) {
		super();	//Object 클래스의 생성자 호출
		this.x = x;
		this.y = y;
	}

	//메소드 - gs
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
	//draw();	2일 걸리는 작업

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
}



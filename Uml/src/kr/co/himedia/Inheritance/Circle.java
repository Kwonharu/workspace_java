package kr.co.himedia.Inheritance;

public class Circle extends Shape{
	
	Point center;		//원점
	int radius;			//반지름
	
	public Circle() {
		this(new Point(0, 0), 100);
		System.out.println("Circle 클래스의 기본 생성자 호출");
	}

	public Circle(Point center, int radius) {
		//super();
		System.out.println("Circle 클래스의 매개변수가 있는 생성자 호출");
		this.center = center;
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		System.out.println("color : "+this.color);
		System.out.println("center : ( x : "+this.center.x+
									   ", y : "+this.center.y+
									   ", radius : "+this.radius+")");
	}
	
}

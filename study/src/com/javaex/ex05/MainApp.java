package com.javaex.ex05;

import java.util.ArrayList;

public class MainApp {
	public static void main(String[] args) {
		//모두 담을 수 있는 리스트 만들기
		ArrayList<Drawable> dList = new ArrayList<Drawable>();
		
		//점, 삼, 사, 원 1개씩 만들기
		Drawable t01 = new Triangle(10, 10, "red", "red");
		Drawable c01 = new Circle(100, "yellow", "yellow");
		Drawable r01 = new Rectangle(50, 50, "blue", "blue");
		Drawable p01 = new Point(3, 9);
		
		//리스트에 담기
		dList.add(t01);
		dList.add(c01);
		dList.add(r01);
		dList.add(p01);
		
		//처음부터 끝까지 돌며 모두 그리기
		for(int i=0; i<dList.size(); i++) {
			dList.get(i).draw(); 
		}
		
		for(int i=0; i<dList.size(); i++) {
			if(dList.get(i) instanceof Shape) {	//shape의 자식이면
				System.out.println(((Shape)dList.get(i)).area());
			}
		}
		//obj instanceof Class : obj가 Class에 속하거나 Class를 상속받는 클래스에 속하면 true가 반환
		
	}
		
}






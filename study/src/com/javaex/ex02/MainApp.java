package com.javaex.ex02;

import java.util.ArrayList;

public class MainApp {
	public static void main(String[] args) {

		Triangle t01 = new Triangle(5, 5, "red", "red");
		Triangle t02 = new Triangle(10, 10, "yellow", "yellow");
		Triangle t03 = new Triangle(15, 15, "orange", "orange");
		Triangle t04 = new Triangle(20, 20, "orange", "orange");
		
		Circle c01 = new Circle(100, "blue", "blue");
		Circle c02 = new Circle(200, "blue", "blue");
		
		ArrayList<Triangle> tList = new ArrayList<Triangle>();
		tList.add(t01);
		//t01의 주소만 넘겨줌
		tList.add(t02);
		tList.add(t03);
		tList.add(t04);
		
		//tList.add(c01);
		
		System.out.println(t01.toString());
		System.out.println(tList.get(0).toString());
		
		//t01.draw();
		//t02.draw();
		
		for(int i=0; i<tList.size(); i++) {
			/*
			Triangle tmp = tList.get(i);
			tmp.draw();
			*/
			
			tList.get(i).draw();
		}
		
		//원 관리
		ArrayList<Circle> cList = new ArrayList<Circle>();
		
		cList.add(c01);
		cList.add(c02);
		
		for(int i=0; i<cList.size(); i++) {
			cList.get(i).draw();
		}
		
		///////////////////////////////////////////////////////
		System.out.println();
		// ↓ remove() 오버로딩 확인
		//삼각형 1개 지우기 방번호
		tList.remove(2);
		for(int i=0; i<tList.size(); i++) {
			tList.get(i).draw();
		}
		
		System.out.println("-----------------------------");
		
		//삼각형 1개 지우기 주소값
		tList.remove(t01);
		for(int i=0; i<tList.size(); i++) {
			tList.get(i).draw();
		}
		
		
		System.out.println(Math.round((float)(5*5)/2));
		System.out.println((5*5)/2f);
		System.out.println((float)(5*5)/2);
		
	}
}



package com.javaex.ex04;

import java.util.ArrayList;

public class MainApp {
	public static void main(String[] args) {
		//사각형 삼각형 원 각각 리스트로 관리하지 않고
		
		//모든 도형을 1개의 리스트로 관리
		ArrayList<Shape> sList = new ArrayList<Shape>();
		
		//삼각형
		Shape t01 = new Triangle(3, 3, "red", "red");
		Shape t02 = new Triangle(4, 4, "yellow", "yellow");
		
		//사각형
		Shape r01 = new Rectangle(10,10,"orange","orange");
		
		//원
		Shape c01 = new Circle(100,"blue","blue");
		
		
		//////////////////////////////////////////////////////
		
		
		//섞어쓰기 (업 캐스팅)
		Shape t00 = new Triangle(100, 100, "green", "green");
		Shape c00 = new Circle(100,"green","green");
		//////////////////////////////////////////////////////
		
		sList.add(t01);
		sList.add(t02);
		sList.add(r01);
		sList.add(c01);
		
		//전체
		for(int i=0; i<sList.size(); i++) {
			sList.get(i).draw();
		}
		
		//다운 캐스팅
		Triangle t = ((Triangle)sList.get(0));
		int w = ((Triangle)sList.get(0)).getWidth();
		System.out.println(t);
		System.out.println(w);
		
		
		//shape
		/*
		Shape s01 = new Shape("red", "red");
		s01.draw();
		*/
		
		//면적 구하기
		System.out.println("------------면적------------");
		for(int i=0; i<sList.size(); i++) {
			System.out.println(sList.get(i).area()); 
		}
		
	}
}






package com.javaex.ex06;

import java.util.LinkedList;
import java.util.List;

public class MainApp {
	//필드
	//생성자
	//메소드-gs
	//메소드-일반
	public static void main(String[] args) {
		
		Point p01 = new Point(10, 10);
		Point p02 = new Point(20, 20);
		Point p03 = new Point(30, 30);
		
		// ArrayList  : 검색 Fast / 삽입,삭제 Slow
		// LinkedList : 검색 Slow / 삽입,삭제 Fast
		
		List<Point> list = new LinkedList<Point>();
		list.add(p01);
		list.add(p02);
		list.add(p03);
		
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i).toString()); 
		}
		
		System.out.println();
		
		list.add(p03);
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i).getX()); 
		}
		
		System.out.println();
		
		list.remove(0);
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i).toString()); 
		}
		
		
	}
	
}



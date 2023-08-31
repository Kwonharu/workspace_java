package com.javaex.ex03;

import java.util.ArrayList;

public class MainApp {
	public static void main(String[] args) {
		
		Triangle t01 = new Triangle();
		t01.setWidth(5);
		t01.setHeight(5);
		t01.setFillColor("red");
		t01.setLineColor("red");
		
		//t01.fillColor = "red"; //protected
		
		t01.draw();
		
		Triangle t02 = new Triangle(7, 7, "blue", "blue");
		t02.draw();
		
		/////////////////////////////////////////////////////
		Shape s01 = new Shape();
		s01.setFillColor("asdf");
		s01.setLineColor("qwer");
		
		//s01.draw();
		
		/////////////////////////////////////////////////////
		//리스트로 관리
		
		ArrayList<Triangle> tList = new ArrayList<Triangle>();
		tList.add(t01);
		tList.add(t02);
		
		for(int i=0; i<tList.size(); i++) {
			tList.get(i).draw();
		}
		
	}
}






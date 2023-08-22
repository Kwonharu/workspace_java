package kr.co.himedia.arraylist;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		
		ArrayList<Book> library = new ArrayList<>();
		
		library.add(new Book("방구석에 인어아가씨", "지나가던개"));
		library.add(new Book("데드엔드 99%", "지나가던개"));
		library.add(new Book("죽어버린 별의 넋두리", "지나가던개"));
		library.add(new Book("당신을 기다리는 여우", "지나가던개"));
		library.add(new Book("당신을 기다리는 여우 花", "지나가던개"));
	
		for(int i=0; i<library.size(); i++) {
			library.get(i).showInfo();
		}
	}
}

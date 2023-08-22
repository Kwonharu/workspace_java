package kr.co.himedia.collection;

import java.util.ArrayList;

public class ListLab {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("쏘가리");
		list.add("블루길");
		list.add("무당");
		list.add("쏘가리");
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		list.remove(0);
		list.set(1, "깻잎");
		
		System.out.println();
		
		for(String str : list) {
			System.out.println(str);
		}
		
	}
}

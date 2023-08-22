package kr.co.himedia.generic02;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGeneric {
	public static void main(String[] args) {
		
		List<Movie> list = new ArrayList<>();
		list.add(new Movie("방구석에 인어아가씨", "지나가던개", "2014", "한국"));
		list.add(new Movie("데드엔드 99%", "지나가던개", "2014", "한국"));
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
	}
}

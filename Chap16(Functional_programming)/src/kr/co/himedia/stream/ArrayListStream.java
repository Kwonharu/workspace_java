package kr.co.himedia.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStream {
	public static void main(String[] args) {
		
		List<String> sList = new ArrayList<>();
		sList.add("수아 분신의 방울");
		sList.add("미미르의 만화책");
		sList.add("아린");
		
		Stream<String> stream = sList.stream();
		stream.forEach(s -> System.out.print(s + "\t"));
		System.out.println();
		
		sList.stream().sorted().forEach(s -> System.out.print(s + "\t"));
		System.out.println();
		
		sList.stream().map(s -> s.length()).forEach(n -> System.out.print(n + "\t"));
		System.out.println();
		
		sList.stream().filter(s -> s.length() >= 7).forEach(s -> System.out.print(s + "\t"));
		
		
	}
}

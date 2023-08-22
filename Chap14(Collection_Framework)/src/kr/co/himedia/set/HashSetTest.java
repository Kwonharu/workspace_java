package kr.co.himedia.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		
		set.add(new String("수아"));
		set.add(new String("미미르"));
		set.add(new String("아린"));
		set.add(new String("세은"));
		set.add(new String("세은"));
		
		System.out.println(set.toString());
		
	}
}

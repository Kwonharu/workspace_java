package kr.co.himedia.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest02 {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		set.add("깻잎");
		set.add("메로나");
		set.add("딸기우유");
		set.add("깻잎");
		
		System.out.println(set.size());
		
		System.out.println(set);
		
		for(String element : set) {
			System.out.println(element);
		}
		
		set.remove("딸기우유");
		System.out.println(set);
		
		boolean contains = set.contains("asdf");
		System.out.println(contains);
		
		set.clear();
		
		boolean empty = set.isEmpty();
		System.out.println(empty);
		System.out.println(set);
		
	}
}

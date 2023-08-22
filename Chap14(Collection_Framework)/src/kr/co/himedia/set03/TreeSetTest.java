package kr.co.himedia.set03;

import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("리즈");
		treeSet.add("루시아");
		treeSet.add("안셈");
		treeSet.add("안셈");
		
		for(String str : treeSet) {
			System.out.println(str);
		}
		
	}
}

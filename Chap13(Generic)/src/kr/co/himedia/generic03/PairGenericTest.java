package kr.co.himedia.generic03;

import java.util.HashMap;
import java.util.Map;

public class PairGenericTest {
	public static void main(String[] args) {
		
		Pair<String, Integer> pair = new Pair<>("아연", 2014);
		System.out.println(pair.getKey());
		System.out.println(pair.getValue());
		
		Map<String, Integer> maps = new HashMap<>();
		maps.put("고냥이", 80);
		maps.put("아린", 90);
		maps.put("선배", 100);
		
		System.out.println(maps.get("고냥이"));
		System.out.println(maps.get("아린"));
		System.out.println(maps.get("선배"));
		
	}
}

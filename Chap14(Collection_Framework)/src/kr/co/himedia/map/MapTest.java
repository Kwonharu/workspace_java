package kr.co.himedia.map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		
		//key-value 형태의 데이터를 관리하는 Map 객체 생성
		Map<String, Integer> scoreMap = new HashMap<>();
		
		//데이터 추가
		scoreMap.put("수아", 100);
		scoreMap.put("아린", 63);
		scoreMap.put("미미르", 82);
		scoreMap.put("세은", 47);
		
		//데이터 조회
		System.out.println("수아의 점수: "+scoreMap.get("수아"));
		System.out.println("아린의 점수: "+scoreMap.get("아린"));
		
		//데이터 수정
		scoreMap.put("아린", 75);
		System.out.println("아린의 점수: "+scoreMap.get("아린"));
		
		//데이터 삭제
		scoreMap.remove("세은");
		System.out.println("세은의 점수: "+scoreMap.get("세은"));
		
		System.out.println();
		
		//전체 데이터 츨력
		for(Map.Entry<String, Integer> entry : scoreMap.entrySet()) {
			System.out.println(entry.getKey()+"의 점수는 " + entry.getValue());
		}
	}
}




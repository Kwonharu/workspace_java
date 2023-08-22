package kr.co.himedia.staticzone03;

import java.util.Random;

public class StaticBeforeMain {
	
	static int num;			// 스태틱 맴버 변수
	
	static {				// static 초기화 블록
		Random random = new Random();
		num = random.nextInt(1972);		//0~1972사이의 무작위 숫자 반환
	}
	
	public static void main(String[] args) {
		System.out.println(num);
	}
	
}

package kr.co.hmedia.operator;

public class PrefixPostfixTest {
	public static void main(String[] args) {
		int num = 10;
		System.out.println(++num);	//num값 증가 후 출력
		System.out.println(num);
		
		System.out.println(num++);	//num값 출력 후 증가
		System.out.println(num);		
		
		int x = 10;
		int y = 10;
		System.out.println(x++);
		System.out.println(x);
		
		System.out.println(++y);
		System.out.println(y);
	}
}

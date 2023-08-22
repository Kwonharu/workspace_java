package kr.co.himedia.staticzone;

public class NoneStaticTest {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		NoneStaticTest nst = new NoneStaticTest();
		
		int result = nst.sum(a, b);
		System.out.println(result);
	}
	
	public int sum(int a, int b) {
		int result = a+b;
		return result;
	}
	
}

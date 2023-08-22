package kr.co.himedia.review;

public class MethodTest {
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		int result = add(num1, num2);
		
		int result2 = minus(num1, num2);
		
		
		System.out.println(result);
		System.out.println(result2);
		
	}

	
	
	private static int add(int x, int y) {
		// TODO Auto-generated method stub
		
//		int temp = num1 + num2;
		return x + y;
	}
	
	
	
	
	private static int minus(int s, int d){
		return s-d;
	}	
	
}

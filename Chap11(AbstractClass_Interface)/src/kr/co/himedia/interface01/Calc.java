package kr.co.himedia.interface01;

public interface Calc {
	
	double PI = 3.14;
	int ERROR = -9999999;
	
	int add(int num1, int num2);
	int subtract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void describe() {
		System.out.println("계산기 구현");
		myMethod();
	};
	
	static int total(int[] arr) {
		int total = 0;
		for(int i : arr) {
			total += i;
		}
		myStaticMethod();
		return total;
	}
	
	private void myMethod() {
		System.out.println("private 메서드 호출");
	}
	
	private static void myStaticMethod() {
		System.out.println("private Static 메서드 호출");
	}
	
}






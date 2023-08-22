package kr.co.himedia.memory;

public class MemoryStack {

	public static int add(int x, int y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int result = add(num1, num2);
		System.out.println("result: "+result);
	}
}

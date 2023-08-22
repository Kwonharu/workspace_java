package kr.co.himedia.lambda04;

public class FunctionalInterfaceTest implements MathOperation{
	public static void main(String[] args) {
		
		MathOperation mo = new FunctionalInterfaceTest();
		int result = mo.operation(10, 20);
		System.out.println(result);
		
	}

	@Override
	public int operation(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}
}

package kr.co.himedia.lambda12;

public class TriFunctionTest {
	public static void main(String[] args) {
		
		TriFunction<Integer, Integer, Integer, Integer> add = (a,s,d) -> a+s+d;
		int result = add.apply(1, 2, 300);
		System.out.println(result);
		
	}
}

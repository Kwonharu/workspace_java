package kr.co.himedia.interface01;

public class CompleteCalculatorTest {
	public static void main(String[] args) {
		
		Calc calc = new CompleteCalculator();
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.subtract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		
		calc.describe();
		
		int[] arr = {1,2,3,4,5};
		int sum = Calc.total(arr);
		System.out.println(sum);
		
	}
}

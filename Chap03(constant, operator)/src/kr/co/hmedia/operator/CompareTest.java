package kr.co.hmedia.operator;

public class CompareTest {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 3;
		boolean value = (num1 > num2);
		System.out.println(value);
		
		System.out.println(num1 < num2);
		System.out.println(num1 >= num2);
		System.out.println(num1 <= num2);
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);
		
		System.out.println("1.0 == 1 : " + (1.0 == 1)); //실수형으로 자동 형변환 이후 비교 연산
		System.out.println("1.0 != 1 : " + (1.0 != 1));
		
	}
}

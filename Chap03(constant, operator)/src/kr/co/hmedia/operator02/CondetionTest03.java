package kr.co.hmedia.operator02;

import java.util.Scanner;

//입력 받은 두 수 중에서 큰 수를 출력하시오

public class CondetionTest03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력1: ");
		int num1 = scan.nextInt();
		System.out.print("입력2: ");
		int num2 = scan.nextInt();
		
		int max = (num1 > num2) ? num1 : num2;
		System.out.println("큰1수: "+max);
	
		scan.close();
	}
}

package kr.co.himedia.loop04;

import java.util.Scanner;

public class DoWhileTest {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("샌즈: ");
		
		int sum = 0;
		int input;
		
		do {
			input = scan.nextInt();
			sum += input;
		}while(input != 0);
		
		System.out.println("sum = "+sum);
		
		scan.close();
		
	}
}

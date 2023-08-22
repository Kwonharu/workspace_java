package kr.co.himedia.decisionIf;

import java.util.Scanner;

public class IfElseTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("숫자를 입력하세요: ");
		int age = scan.nextInt();
		
		if(age >= 8) {
			System.out.println("빵!교에 다닙니다");
		}else{
			System.out.println("읎서요.");
		}
		
		
		scan.close();
		
	}
}

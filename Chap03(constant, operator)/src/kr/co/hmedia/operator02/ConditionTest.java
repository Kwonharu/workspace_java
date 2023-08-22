package kr.co.hmedia.operator02;

import java.util.Scanner;

public class ConditionTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력하시오: ");
		int score = scan.nextInt();
		
		char grade = (score >= 90) ? 'A' : 'B';
		System.out.println("당신의 등급: "+grade);
		
		//상항 연산자 중첩
		grade = (score >= 90) ? 'A' : ((score >= 80) ? 'B' : 'C');
		System.out.println("당신의 등급: "+grade);
		
		scan.close();
	}
}

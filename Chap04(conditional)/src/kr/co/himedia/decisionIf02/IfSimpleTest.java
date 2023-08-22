package kr.co.himedia.decisionIf02;

import java.util.Scanner;

public class IfSimpleTest {
	public static void main(String[] args) {
		int x = 5;
		
		if(x>0) {
			System.out.println("양수");
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 주세요: ");
		long num = scan.nextLong();
		if(num % 8 == 0) {
			System.out.println("이세마스 너무 안 봐서 개 밀려서 본다면 하루종일 보겠지 보겠지 그러면 나는 대체 언제 퇴근하지");
		}else {
			System.out.println("퇴근하지~~~~ 퇴근 못하지 내일 수영 가야하는데 그럼 어떡하지 못하지 (못하지) 인생 망했지 근데 만화는 봐야 하는데");
			System.out.println(num % 8);
		}
		
		
		System.out.print("나이를 입력하시오: ");
		int age = scan.nextInt();
		if(age >= 18) {
			System.out.println("성사 되었습니다");
		}else {
			System.out.println("애송이였나");
		}
		
		
		
		scan.close();
	}
}

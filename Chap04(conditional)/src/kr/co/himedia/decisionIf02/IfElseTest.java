package kr.co.himedia.decisionIf02;

import java.util.Scanner;

public class IfElseTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수: ");
		int score = scan.nextInt();
		
		if(score < 0 || score > 100) {
			System.out.println("날아오르라");
		}else if(score >= 80) {
			if(score >= 90) {
				System.out.println("AAAAAAAAAI");
			}else if(score >= 85) {
				System.out.println("B");
			}else{
				System.out.println("C");
			}
		}else {
			System.out.println("not so fast");
		}
		
		scan.close();
	}
}

package kr.co.himedia.decisionIf;

import java.util.Scanner;

public class IfElseIfElseTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요: ");
		int score = scan.nextInt();
		
		if(score >= 90) {
			System.out.println("90~100 사이");
			System.out.println("AAAAAA");
		}else if(score >= 80) {
			System.out.println("80~89 사이");
			System.out.println("B급");
		}else if(score >= 70) {
			System.out.println("70~79 사이");
			System.out.println("CGV");
		}else if(score >= 60) {
			System.out.println("60~69 사이");
			System.out.println("D컷");
		}else {
			System.out.println("병1신 어헣ㅓ허허ㅓ헣ㅎ");
		}
		
		scan.close();
	}
}

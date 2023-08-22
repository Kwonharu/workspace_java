package kr.co.himedia.loop04;

import java.util.Scanner;

public class WhileTest03 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
	
		int sum = 0;
		boolean run = true;

		while(run) {
			System.out.println("----------------------");
			System.out.println("1. 증속	2. 감속	3. 중지");
			System.out.println("----------------------");
			System.out.print("입력: ");
			
			int input = scan.nextInt();
			
			if(input == 1) {
				sum++;
				System.out.println("현재 속도: "+ sum);
			}else if(input == 2) {
				sum--;
				System.out.println("현재 속도: "+ sum);
			}else if(input == 3) {
				System.out.println("프로그램 종료");
				run = false;
			}else{
				System.out.println("아 님 머함");
			}
		}
		

		scan.close();
	}
}

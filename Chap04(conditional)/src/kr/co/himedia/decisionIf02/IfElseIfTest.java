package kr.co.himedia.decisionIf02;

import java.util.Scanner;

public class IfElseIfTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ㄴAㅏ E 를 입력하시오: ");
		int age = scan.nextInt();
		int charge;
		
		if (age<8) {
			charge = 1000;
			System.out.println("샌즈");
		}else {
			charge = 3000;
			System.out.println("MTE");
		}
		System.out.println("큰1돈을"+charge+"벌 거야!");
		
		
		
		scan.close();
	}
}

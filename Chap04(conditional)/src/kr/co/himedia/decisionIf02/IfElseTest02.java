package kr.co.himedia.decisionIf02;

import java.util.Scanner;

public class IfElseTest02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ㄴAㅏ E 를 입력하시오: ");
		int age = scan.nextInt();
		int charge;
		
		if (age<8) {
			charge = 1000;
			System.out.println("샌즈");
		}else if(age<14) {
			charge = 2000;
			System.out.println("애송이였나");
		}else if(age<20) {
			charge = 2500;
			System.out.println("썩션-");
		}else {
			charge = 3000;
			System.out.println("MTE");
		}
		System.out.println("큰1돈을 "+charge+" 벌 거야!");
		

		scan.close();
	}
}

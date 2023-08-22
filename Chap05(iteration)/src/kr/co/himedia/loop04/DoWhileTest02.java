package kr.co.himedia.loop04;

import java.util.Scanner;

public class DoWhileTest02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력: ");
		
		String input;
		
		do {
			System.out.print(">");
			input = scan.nextLine();
			System.out.println("q == 종료 : "+input);
		}while(!input.equals("q"));
		
		System.out.println("그냥 영원히 푹 쉬세요.");
		
		scan.close();
		
	}
}

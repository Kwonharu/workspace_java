package kr.co.himedia.decisionSwitch;

import java.util.Scanner;

public class SwitchCaseTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int month = scan.nextInt();
		
		switch(month) {
			case 2:
				System.out.println("28");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("30");
				break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("31");
				break;
		}
		
		scan.close();
	}
}

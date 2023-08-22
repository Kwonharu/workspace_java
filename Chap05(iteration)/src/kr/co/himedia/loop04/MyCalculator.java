package kr.co.himedia.loop04;

import java.util.Scanner;

public class MyCalculator {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			showMenu();
			char myChar = scan.next().charAt(0);
			if(!checkNum(myChar)) {
				System.out.println("wrong selection");
				continue;
			}
			/*
			 * 뮨자 - 문자
			 * '1' - '0'
			 * 49 - 48
			 * 1
			 */
			int num = myChar - '0';
			if(num == 5) {
				break;
			}else {
				if(num > 5) {
					System.out.println("읎서요.");
					continue;
				}
			}
			// 사칙연산 실행
			System.out.print("첫 번째 수: ");
			int num1 = scan.nextInt();
			System.out.print("두 번째 수: ");
			int num2 = scan.nextInt();
			
			if(num == 1){
				addNum(num1, num2);
			}else if(num == 2){
				minusNum(num1, num2);
			}else if(num == 3){
				multiplyNum(num1, num2);
			}else if(num == 4){
				divisionNum(num1, num2);
			}			
		}
		
		System.out.println("눈좀 떠 보세요 아이네님");
		
		scan.close();
	}
	
	
	public static void divisionNum(int x, int y) {
		int result = x / y;
		System.out.println(x+"/"+y+"="+result);
		
		int result2 = x % y;
		System.out.println(x+"%"+y+"="+result2);
		
	}
	
	
	public static void multiplyNum(int x, int y) {
		int result = x * y;
		System.out.println(x+"*"+y+"="+result);
		
	}


	public static void minusNum(int x, int y) {
		int result = x - y;
		System.out.println(x+"-"+y+"="+result);
		
	}


	public static void addNum(int x, int y) {
		int result = x + y;
		System.out.println(x+"+"+y+"="+result);
		
	}

	public static boolean checkNum(char myChar) {
		if(myChar >= '0' && myChar <= '9') {
			return true;
		}
		return false;
	}
	
	public static void showMenu() {
		System.out.println("1. +");
		System.out.println("2. -");
		System.out.println("3. *");
		System.out.println("4. /");
		System.out.println("5. exit");
	}
}

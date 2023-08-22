package kr.co.hmedia.operator02;

import java.util.Scanner;

/*
 * 여러 숫자 입력 시 버퍼(buffer)에 임시 저장 
 * 스페이스(공백)이나 탭으로 구분하여 립력된 데이터를 변수에 대입
 */

/*
 * next() : 공백을 기준으로 해서 문자를 입력 (단어 입력 시 사용)
 * nextLine() : 엔터르 입력할 때까지 문자열을 입력 (문장 입력 시 사용)
 * 				버퍼 비우기(스트림 비우기)
 */

public class ScannerTest02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 한 자리 입력: ");
		int num = scan.nextInt();
		System.out.println("입력받은 숫자: "+num);
		
		System.out.print("실수 한 자리 입력: ");
		double dNum = scan.nextFloat();
		System.out.println("입력받은 숫자: "+dNum);
		
		scan.nextLine();
		
		System.out.print("문자열을 입력: ");
		String str = scan.next();
		System.out.println("입력받은 문자열: " + str);
		
		scan.nextLine();
		
		System.out.print("문자열을 입력: ");
		String str2 = scan.nextLine();
		System.out.println("입력받은 문자열: " + str2);
		
		scan.close();
		
	}
}

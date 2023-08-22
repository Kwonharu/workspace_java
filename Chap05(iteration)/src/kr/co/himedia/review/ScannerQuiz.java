package kr.co.himedia.review;

import java.util.Scanner;

public class ScannerQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.print("제목 입력: ");
		String title = scan.nextLine();		
		System.out.println("제목: "+title);

		System.out.print("가격 입력: ");
		int price = scan.nextInt();		
		System.out.println("가격: "+price);
		scan.nextLine();	//nextInt로 받은 거 버퍼 초기화

		System.out.print("출판사 입력: ");
		String company = scan.nextLine();			
		System.out.println("출판사: "+company);
		
		System.out.print("저자 입력: ");
		String author = scan.nextLine();		
		System.out.println("저자: "+author);

		System.out.print("쪽수 입력: ");
		int page = scan.nextInt();		
		System.out.println("쪽수: "+page);
		scan.nextLine();

		System.out.print("ISBN 입력: ");
		String isbn = scan.nextLine();		
		System.out.println("ISBN: "+isbn);
		
		
		scan.close();
	}

}

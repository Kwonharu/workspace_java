package kr.co.himedia.string;

import java.util.Scanner;

public class StringSplitTest {
	public static void main(String[] args) {
		
//		String str = "Hello,World,Java";
		String str = "Hello World Java";
		String[] strArray = str.split("\\s");
		
		for(String s : strArray) {
			System.out.println(s);
		}
		
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자열 입력하시오: ");
		String sc = scan.nextLine();
		String[] scAr = sc.split("\\s");
		
		for(String s : scAr) {
			System.out.println(s);
		}
		
		scan.close();
	}
}

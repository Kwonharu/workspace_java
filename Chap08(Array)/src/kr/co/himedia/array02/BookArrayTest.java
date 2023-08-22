package kr.co.himedia.array02;

import java.util.Arrays;

public class BookArrayTest {
	public static void main(String[] args) {
		
		Book[] book = new Book[5];
		
		System.out.println(Arrays.toString(book));
		
		book[0] = new Book("전설의 도시 해병성채", "황근출");
		book[1] = new Book("전설의 해병짜장", "톤톤정");
		book[2] = new Book("전설의 해병", "조 이보이");
		book[3] = new Book("전설의 오도봉고", "무모칠");
		book[4] = new Book("전설의 자진입대", "아쎄이");
		
		System.out.println(Arrays.toString(book));
		
		for(int i = 0; i < book.length; i++) {
//			System.out.println(book[i]);
			book[i].showInfo();
		}
		
		
	}
}

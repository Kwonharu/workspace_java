package kr.co.himedia.array;

import java.util.Arrays;

public class CharArrayTest {
	public static void main(String[] args) {
		
		char[] charArr = new char[26];
		
		System.out.println(Arrays.toString(charArr));
		
//		for(int i = 0; i<charArr.length; i++) {
//			charArr[i] = (char) (65 + i);
//		}
		
		char ch = 'A';
		for(int i = 0; i<charArr.length; i++) {
			charArr[i] = ch++;
		}
		System.out.println(Arrays.toString(charArr));
		
		//향상된 for문
		for(char alpha : charArr) {
			System.out.println(alpha + ","+ (int)alpha);
		}
		
		
		
	}
}

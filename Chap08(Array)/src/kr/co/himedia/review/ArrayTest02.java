package kr.co.himedia.review;

import java.util.Arrays;
import java.util.Scanner;

/*
생성할 배열의 length : 3
배열 요소 입력 : 2 3 4
sum = 9
[2, 3, 4]
*/

public class ArrayTest02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("배열 길이 입력: ");
		int input = scan.nextInt();
		int[] arr = new int[input];
		int num = arr.length;
	
		System.out.print("배열 요소 입력: ");
		scan.nextLine();
		
		for(int i = 0; i<num; i++) {
			arr[i] = scan.nextInt();
		}
		
		int sum = 0;
		for(int i = 0; i<num; i++) {
			sum += arr[i];
		}
		
		System.out.println("sum: "+sum);
		System.out.println(Arrays.toString(arr));
		
		scan.close();
		
	}
}

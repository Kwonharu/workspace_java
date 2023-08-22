package kr.co.himedia.loop04;

public class WhileTest02 {
	public static void main(String[] args) {
		
		int num = 1;
		int count = 0;
		
		while( (num++) <= 100){
			if((num % 5) != 0 || (num % 7) != 0) {
				continue;
			}
			System.out.println(num);
			count++;
		}
		System.out.println(count);
		
	}
}

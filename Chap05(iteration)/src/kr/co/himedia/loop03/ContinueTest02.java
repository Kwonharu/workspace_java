package kr.co.himedia.loop03;

public class ContinueTest02 {
	public static void main(String[] args) {
		
		int count = 0;
		
		for(int i=1; i <= 10; i++) {
			if((i % 3) != 0) {
				continue;
			}
			count++;
		}
		System.out.println(count);
		
	}
}

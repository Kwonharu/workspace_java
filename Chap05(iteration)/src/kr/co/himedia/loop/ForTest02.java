package kr.co.himedia.loop;

public class ForTest02 {
	public static void main(String[] args) {
		int sum = 0;
		int temp = 0;
		
		for(int i=1; i<=100 ;i++) {
			sum += i;
			if(sum > 2000) {
				temp = i;
				break;
			}
		}
		System.out.print(temp+" "+sum);
		
	}
}

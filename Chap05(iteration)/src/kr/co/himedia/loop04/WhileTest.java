package kr.co.himedia.loop04;

public class WhileTest {
	public static void main(String[] args) {
		
		int sum = 0;
		int num = 1;	//while문은 초기화하는 부분이 따로 없음
		
		while(num <= 100) { //while문 옆에는 조건식만 들어감
			sum += num;
			num++;
		}
		System.out.println("1~100 합: "+sum);

		/*
		 * while문은 무한루프 용으로 많이 사용
		 *   - if문, break문과 함께 사용하여 무한 루프를 벗어날 코드를 작성해줘야 함
		 */
		
		int i = 1;
		while(true) {
			System.out.println(i);
			if(i>=100) {
				break;
			}
			i++;
		}
	}
}

package kr.co.hmedia.constant;

public class ConstantTest {
	public static void main(String[]args) {
		final int MAX_NUM = 100;	//선언과 동시에 초기화
		final int MIN_NUM;			//선언만 하기
		MIN_NUM = 60;				//나중에 초기화, 한 번 가능
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		//MAX_NUM = 410;
		
		int myScore = 50;
		if(myScore < MIN_NUM) {   //상수를 사용하면 가독성이 좋아짐
			System.out.println("병1신 어헣ㅎ허ㅓ허헣ㅎㅎ");
		}
		
	}
}

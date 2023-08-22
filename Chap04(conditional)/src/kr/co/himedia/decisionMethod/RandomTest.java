package kr.co.himedia.decisionMethod;

public class RandomTest {
	public static void main(String[] args) {
		
		//0.0(*16) ~ 0.9(*16) 사이의 값을 발생시킴
		System.out.println(Math.random());
		
		//Dice
		int num = (int) (Math.random()*6); //0~5
		num = (int) (Math.random()*6) + 1; //1~6 범위의 수를 발생 
		System.out.println(num);
		
		//lotto : 1~45 중 6개
		int num2 = (int)(Math.random()*45)+1;
		System.out.println(num2);
		
		if(num == 1) {
			System.out.println("1초");
		}else if(num == 2) {
			System.out.println("2렇");
		}else if(num == 3) {
			System.out.println("3초");
		}else if(num == 4) {
			System.out.println("4랑");
		}else if(num == 5) {
			System.out.println("5늘");
		}else {
			System.out.println("6십");
		}
		
		
		switch(num) {
			case 1:
				System.out.println("1초");
				break;
			case 2:
				System.out.println("2초");
				break;
			case 3:
				System.out.println("3초");
				break;
			case 4:
				System.out.println("4초");
				break;
			case 5:
				System.out.println("5초");
				break;
			default:
				System.out.println("6초");
				break;
		}
		
		
		
	}
}

	






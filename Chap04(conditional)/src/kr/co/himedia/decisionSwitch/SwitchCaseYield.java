package kr.co.himedia.decisionSwitch;


public class SwitchCaseYield {
	public static void main(String[] args) {
		int month = 7;
		
		int day = switch(month) {
			case 1,3,5,7,8,10,12 ->{
				System.out.println("31");
				yield 31;
			}
			case 4,6,9,11 ->{
				System.out.println("30");
				yield 30;
			}
			case 2 ->{
				System.out.println("28");
				yield 28;
			}
			default ->{
				System.out.println("asdf");
				yield 0;
			}
		};
		
	}
}

package kr.co.himedia.decisionSwitch;



public class SwitchCaseTest02 {
	public static void main(String[] args) {

		String medal = "gold";
		
		switch(medal) {
			case "gold":
				System.out.println("golden medalist");
				break;
			case "silver":
				System.out.println("silver medalist");
				break;
			case "bornze":
				System.out.println("bornze medalist");
				break;
			default:
				System.out.println("no medalist");
				break;
		}
		

	}
}

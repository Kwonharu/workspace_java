package kr.co.hmedia.operator02;

public class DenyTest {
	public static void main(String[] args) {
		boolean power = false;
		
		power = !power;
		System.out.println(power);
		
		power = !power;
		System.out.println(power);
		
		if(!power) {
			System.out.println("if문 실행");
		}
		
		
	}
}



package kr.co.himedia.builder02;

enum Human {MAN, WOMAN}
enum Machine {TANK, AIRPLANE}

public class EnumTest {
	public static void main(String[] args) {
		createUnit(Machine.TANK);
		
	}
	
	public static void createUnit(Machine machine) {
		switch(machine) {
			case TANK :
				System.out.println("Ready to roll out!");
				break;
			case AIRPLANE :
				System.out.println("Wraith awaiting launch orders.");
				break;
		}
	}
}

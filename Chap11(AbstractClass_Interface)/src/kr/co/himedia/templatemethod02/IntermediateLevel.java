package kr.co.himedia.templatemethod02;

public class IntermediateLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("빨리 달린다");
		
	}

	@Override
	public void jump() {
		System.out.println("jump 한다");
		
	}

	@Override
	public void turn() {
		System.out.println("turn 불가");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("******중급자 레벨******");
		
	}


}

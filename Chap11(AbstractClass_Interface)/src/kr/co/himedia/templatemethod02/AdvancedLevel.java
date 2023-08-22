package kr.co.himedia.templatemethod02;

public class AdvancedLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("준1내 빨리 달린다");
		
	}

	@Override
	public void jump() {
		System.out.println("jump 한다");
		
	}

	@Override
	public void turn() {
		System.out.println("turn 한다");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("******고급자 레벨******");
		
	}

}

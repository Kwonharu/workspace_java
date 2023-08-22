package kr.co.himedia.decorator;

public class WhippedCream extends Decotator {

	public WhippedCream(Coffee coffee) {
		super(coffee);
	}
	
	@Override
	public void brew() {
		super.brew();
		System.out.print("+ 휘핑 크림 추가 ");
	}
	
}

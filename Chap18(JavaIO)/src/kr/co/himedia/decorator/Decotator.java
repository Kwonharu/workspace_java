package kr.co.himedia.decorator;

public abstract class Decotator extends Coffee{
	
	Coffee coffee;
	
	public Decotator(Coffee coffee) {
		this.coffee = coffee;
	}
	
	@Override
	public void brew() {
		coffee.brew();
	}
}

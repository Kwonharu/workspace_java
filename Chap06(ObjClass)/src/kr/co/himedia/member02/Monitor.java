package kr.co.himedia.member02;

public class Monitor {
	
	//맴버 변수(필드)
	String color;
	int channel;
	int volume;
	boolean power;
	
	
	//맴버 메서드
	//Monitor를 켜거나 끄는 기능 (power())
	public void power() {
		if(!power) {
			System.out.println("켜짐");
			this.power = !power;
		}else {
			System.out.println("꺼짐");
			this.power = !power;
		}
	}
	
	public void channelUp(){
		this.channel++;
		System.out.println("current channel: "+this.channel);
	}
	public void channelDown(){
		System.out.println("current channel: "+(--this.channel));
	}
	
	
}

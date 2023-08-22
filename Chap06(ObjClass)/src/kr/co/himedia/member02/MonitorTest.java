package kr.co.himedia.member02;

public class MonitorTest {

	public static void main(String[] args) {
		
		Monitor mo = new Monitor();
		mo.power();
		mo.power();
		mo.power();
		
		mo.channel = 20;
		mo.channelUp();
		mo.channelUp();
		mo.channelDown();
		mo.channelDown();
		mo.channelUp();
	}
	
}

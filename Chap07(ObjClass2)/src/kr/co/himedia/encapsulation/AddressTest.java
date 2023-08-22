package kr.co.himedia.encapsulation;

public class AddressTest {
	
	public static void main(String[] args) {
		DisplayAddress disadd = new DisplayAddress();
		String sBuffer = disadd.getAddress();	
		
		System.out.println(sBuffer);
	}

}

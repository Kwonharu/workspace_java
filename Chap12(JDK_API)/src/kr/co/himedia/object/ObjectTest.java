package kr.co.himedia.object;

public class ObjectTest {
	public static void main(String[] args) {
		
		A a =new A();
		a.display();
		
		//Upcasting
		/*
		 * Object 타입으로 Upcasting되면 => 반드시 Downcasting을 해야 함
		*/
		Object obj = new A();
		((A)obj).display();
		
	}
}

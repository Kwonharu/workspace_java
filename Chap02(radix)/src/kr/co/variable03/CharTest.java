package kr.co.variable03;

public class CharTest {
	
	public static void main(String[] args) {
		char ch = 'A';
		System.out.println(ch);
		
		int capitalA = 'A';
		System.out.println(capitalA);
		
		int capitalB = 'B'+1;
		System.out.println((char)capitalB);
		
		
		char ga = '가';
		System.out.println(ga);
		
		int gha = '가';
		System.out.println(gha);
		
		int ghaU = '\uAC00';
		System.out.println(ghaU);
		
		
		char A = 'A';
		char a = (char)(A + 32);
		System.out.println(a);
		
		char loweru = 'u';
		int upperU = loweru - 32;
		System.out.println((char)upperU);
		
		// '1' + '2' = 99
		int data = '1' + '2';
		System.out.println(data);
		
		// '0' = 48
		char i = '1';	// 49-48
		char j = '2';	// 50-48
		int sum = (i-'0') + (j-'0');
		System.out.println(sum);
		
		
		
	}
}




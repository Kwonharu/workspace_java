package kr.co.himedia;

public class RadixTest {
	public static void main(String[] args) {
		int num = 10;
		int bNum = 0B1010;
		int oNum = 012;	//0을 앞에 붙이면 8진수로 인식
		int xNum = 0xA; //0x를 앞에 붙이면 16진수로 인식
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(xNum);
	}
}

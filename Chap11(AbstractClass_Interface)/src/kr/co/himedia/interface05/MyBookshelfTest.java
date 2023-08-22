package kr.co.himedia.interface05;

public class MyBookshelfTest {
	public static void main(String[] args) {
		
		Queue bQueue = new MyBookshelf();
		bQueue.enQueue("도련님만의 비전 요리책");
		bQueue.enQueue("최애의 아이 2권");
		bQueue.enQueue("읽으면 안돼요! 비밀 일기장");
		bQueue.enQueue("검고 멋있는 싸인");
		bQueue.enQueue("꽃말 모음집");
		
		System.out.println(bQueue.getSize());
		
		System.out.println(bQueue.deQueue());
		System.out.println(bQueue.deQueue());
		System.out.println(bQueue.deQueue());
		System.out.println(bQueue.deQueue());
		System.out.println(bQueue.deQueue());
	}
}

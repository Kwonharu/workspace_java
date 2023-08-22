package kr.co.himedia.staticzone03;

class Cat{
	static int global = 5;		// static 변수
	int num = 3;			    // 맴버(instance) 변수
	
	public void printValue(int num) {
		this.num = num;
		System.out.println(num);
		System.out.println(Cat.global);
	}
}

public class GlobalVariableTest {
	public static void main(String[] args) {
		Cat.global = 10;		// static 변수에 직접 접근
		
		Cat cat1 = new Cat();	// 지역변수(참조변수) => 스택 영역에 생성
		cat1.printValue(20);
		cat1.num = 1;			// 인스턴스 맴버 접근
	}
}

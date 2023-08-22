package kr.co.himedia.lambda09;

public class StringConcatTest {
	public static void main(String[] args) {
		String s1 = "내 목숨을";
		String s2 = "아이어에!";
		
		StringConcat concat = new StringConcatImpl();
		concat.makeString(s1, s2);;
		
		// 익명 내부 클래스로 구현
		StringConcat concat2 = new StringConcat() {
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + ", "+ s2);
			}
		};
		
		concat.makeString(s1, s2);
		
		// 람다식으로 구현
		StringConcat concat3 = (String s, String v) -> System.out.println(s +", "+ v);
		concat3.makeString(s1, s2);
		
	}
}

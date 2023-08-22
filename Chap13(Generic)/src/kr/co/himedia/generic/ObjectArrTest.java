package kr.co.himedia.generic;

public class ObjectArrTest {
	public static void main(String[] args) {
		
		ObjectArr<String> array = new ObjectArr<>(5);
		array.set(0, "수아");
		array.set(1, "미미르");
		array.set(2, "아린");
		array.set(3, "세은");

		for(int i = 0; i<array.size(); i++) {
			System.out.println(array.get(i));
		}
	}
}

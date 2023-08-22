package kr.co.himedia.generic02;

public class GenericTest {
	public static void main(String[] args) {
		
		ObjectArr<Movie> oArr = new ObjectArr<>(5);
		oArr.set(0, new Movie("방구석에 인어아가씨", "지나가던개", "2014", "한국"));
		oArr.set(1, new Movie("데드엔드 99%", "지나가던개", "2014", "한국"));
		oArr.set(2, new Movie("죽어버린 별의 넋두리", "지나가던개", "2016", "한국"));
//		oArr.set(3, new Movie("당신을 기다리는 여우", "지나가던개", "2017", "한국"));
//		oArr.set(4, new Movie("당신을 기다리는 여우 花", "지나가던개", "2019", "한국"));
		
		for(int i = 0; i<oArr.size(); i++){
			System.out.println(oArr.get(i));
		}
		
	}
}

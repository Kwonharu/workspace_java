package kr.co.himedia.generic05;

public class GenericLimitTest {
	public static void main(String[] args) {
		
		Integer[] intArr = {1,2,3,4,5};
		Double[] doubleArr = {8.1, 4.3, 15.1, 6.48, 20.203};
		String[] strArr = {"m","t","e"};
		
		AverageCalc<Integer> integerCalc = new AverageCalc<>(intArr);
		double integerAverage = integerCalc.calculateAverage();
		System.out.println(integerAverage);
		
		AverageCalc<Double> doubleCalc = new AverageCalc<>(doubleArr);
		double doubleAverage = doubleCalc.calculateAverage();
		System.out.println(doubleAverage);
		
//		AverageCalc<String> strCalc = new AverageCalc<>(strArr);
	}
}

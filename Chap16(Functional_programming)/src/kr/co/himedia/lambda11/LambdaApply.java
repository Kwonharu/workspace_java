package kr.co.himedia.lambda11;

public class LambdaApply {
	public static void main(String[] args) {
		
		//람다 표현식으로 모든 문자를 대문자로 변환하는 StringOperation 구현하기
		StringOperation toUpper = (String s) -> {return s.toUpperCase();};
		//소문자
		StringOperation toLower = s -> s.toLowerCase();
		
		String input = "Lambda Expression";
		
		//매개 변수로 전달되는 람다식
		System.out.println(operationString(input, toUpper));
		System.out.println(operationString(input, toLower));
		
		PrintString reStr = returnString();
		reStr.showString("뭉탱이로 있다가");
		
	}
	
	//람다 표현식을 인자로 사용하는 메서드
	public static String operationString(String input, StringOperation operation) {
		return operation.apply(input);
	}
	
	public static PrintString returnString() {		//반환 값으로 사용
		return s -> System.out.println(s + " 유링게슘 아니그냥");
	}
	
}

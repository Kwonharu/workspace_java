package kr.co.himedia.stream02;

import java.util.Arrays;
import java.util.function.BinaryOperator;

public class ReduceTest {
	
	public static void main(String[] args) {
		
		String[] fox = {"여우 저택", "bamboo forest", "기차역 자판기 사슴벌레칩", "phantasmagoria"};
		
		System.out.println(Arrays.stream(fox).reduce("", (s1, s2) -> 
								{
									if(s1.getBytes().length >= s2.getBytes().length) {
										return s1;
									}else {
										return s2;
									}
								}
							));
		
		System.out.println();
		
		String str = Arrays.stream(fox).reduce(new CompareString()).get();
		System.out.println(str);
		
	}
}


class CompareString implements BinaryOperator<String> {

	@Override
	public String apply(String s1, String s2) {
		if(s1.getBytes().length >= s2.getBytes().length) {
			return s1;
		}else {
			return s2;
		}
	}
}





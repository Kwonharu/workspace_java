package kr.co.himedia.field02;

import java.util.Arrays;

public class FieldInit {
	//기본형 변수
	byte byteField;			//1 byte
	short shortField;   	//2
	int intField;			//4
	long longField;			//8
	
	boolean booleanField;	//1
	char charField;			//2
	
	float floatField;		//4
	double doubleField;		//8
	
	//참조형 변수
	int[] arrField;			//4
	String strField;		//4
	
	/*
	 * 클래스 맴버변수(필드)의 값을 수시고 확인하고자 할 때,
	 * 원하는 포맷으로 맴머변수들을 출력하고자 할 때
	 */
	
	@Override
	public String toString() {
		return "FieldTest [byteField=" + byteField + ", shortField=" + shortField + ", intField=" + intField
				+ ", longField=" + longField + ", booleanField=" + booleanField + ", charField=" + charField
				+ ", floatField=" + floatField + ", doubleField=" + doubleField + ", arrField="
				+ Arrays.toString(arrField) + ", strField=" + strField + "]";
	}
	
	
	
}

package kr.co.himedia.dto;

public class Person {
	String name;
	int age;
	String phone;
	
	public void play(){
		System.out.println("플레이");
	}
	
	public void eat(){
		System.out.println("냠");
	}
	
	public void walk(){
		System.out.println("빨갛게 칠하면");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", phone=" + phone + "]";
	}
	
	
	
}

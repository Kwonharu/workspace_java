package kr.co.himedia.dto;

public class PersonTest {
	public static void main(String[] args) {
		
		Person person = new Person();
		person.name = "세은";
		person.age = 16;
		person.phone = "010-1234-6789";
		person.play();
		person.eat();
		person.walk();
		System.out.println(person.toString());
		
		Person person2  = new Person();
		person2.name = "해미네";
		person2.age = 27;
		person2.phone = "010-9876-4321";
		person2.play();
		person2.eat();
		person2.walk();
		System.out.println(person2);
	}
}

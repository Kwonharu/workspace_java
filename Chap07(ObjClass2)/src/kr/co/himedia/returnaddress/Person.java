package kr.co.himedia.returnaddress;

public class Person {
	
	private String name;
	private int age;
	
	public Person(){
		this("뭉탱이",40);
	}
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public Person getPerson() {
		return this;	//자신의 주소흫 반환
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		System.out.println(person.getName());
		
		Person person2 = person.getPerson();
		System.out.println(person);
		System.out.println(person2);
		
	}
	
	
}

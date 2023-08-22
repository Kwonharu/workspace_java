package kr.co.himedia.stream04.model;

public class Consumer {
	
	private String name;
	private int age;
	private int price;
	
	public Consumer(String name, int age, int price) {
		//super();
		this.name = name;
		this.age = age;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "Consumer [name=" + name + ", age=" + age + ", price=" + price + "]";
	}

}

package kr.co.himedia.accessmodifier;

class Student1 {
	String name;
	int age;
}

class Student2 {
	public String name;
	private int age;
	
	public Student2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age < 0 || age > 2147483647) {
			System.out.println("뭉탱이로 있다가 유링게슘 아니그냥");
			return;
		}
		this.age = age;
	}
	
}


public class PrivateUse {
	public static void main(String[] args) {
		Student1 student1 = new Student1();
		student1.name = "선배";		//맴버변수 직접 접근
		student1.age = 500;			//맴버변수 직접 접근
		System.out.printf("%s's age: %d\n", student1.name, student1.age);
		
		Student2 student2 = new Student2("까미", 500);
		student2.name = "까미까미~";
		student2.setAge(1500);
		System.out.printf("%s's age: %d\n", student2.name, student2.getAge());
		
	}
}



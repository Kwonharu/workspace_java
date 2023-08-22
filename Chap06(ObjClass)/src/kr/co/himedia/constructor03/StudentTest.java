package kr.co.himedia.constructor03;

public class StudentTest {
	public static void main(String[] args) {
		//기본 생성자 호출
		Student stu = new Student();
		System.out.println(stu);
		System.out.println(stu.getName());
		System.out.println(stu.getAge());
		
		System.out.println();
		
		//매개변수 2개 있는 생성자 호출
		Student stu2 = new Student("아린", 500);
		System.out.println(stu2);
		System.out.println(stu2.getName());
		System.out.println(stu2.getAge());
		
		System.out.println();
		
		//매개변수 String 있는 생성자 호출
		Student stu3 = new Student("선배");
		System.out.println(stu3);
		
		System.out.println();
		
		//매개변수 int 있는 생성자 호출
		Student stu4 = new Student(1500);
		System.out.println(stu4);

	}
}

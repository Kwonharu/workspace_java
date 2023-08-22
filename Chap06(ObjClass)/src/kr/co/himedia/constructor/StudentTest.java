package kr.co.himedia.constructor;

public class StudentTest {
	public static void main(String[] args) {
		
		Student stu = new Student();
		System.out.println(stu.showStudentInfo());
		
		Student stu2 = new Student(171106, "세은", 6);
		System.out.println(stu2.showStudentInfo());
	}
	
}

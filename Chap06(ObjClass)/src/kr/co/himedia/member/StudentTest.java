package kr.co.himedia.member;

public class StudentTest {
	public static void main(String[] args) {
		
		Student student = new Student();
		student.studentName = "수아";
		student.address = "대나무 숲";
		student.showStudentInfo();
		
		Student student2 = new Student();
		student2.studentName = "유화";
		student2.address = "여우 마을";
		student2.showStudentInfo();
		
		System.out.println(student.toString());
		System.out.println(student2);
	}
}

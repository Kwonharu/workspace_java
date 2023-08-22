package kr.co.himedia.constructor;

public class Student {
	
	int studentId;
	String studentName;
	int grade;
	
	public Student() {
		System.out.println("기본 생성자 호출");
	}
	
	public Student(int studentId, String studentName, int grade){
		this.studentId = studentId;
		this.studentName = studentName;
		this.grade = grade;
	}

	public String showStudentInfo() {
		return studentName+" wa "+studentId+" wa "+grade;
	}

}

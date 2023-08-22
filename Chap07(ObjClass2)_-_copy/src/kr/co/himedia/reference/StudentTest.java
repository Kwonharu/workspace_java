package kr.co.himedia.reference;

public class StudentTest {
	public static void main(String[] args) {
		
		Student student = new Student(100, "도경");
		student.setKoreaSubject("국어", 80);
		student.setMathSubject("수학", 40);
		student.showScore();
		
		Student student2 = new Student(200, "아연");
		student2.setKoreaSubject("국어", 60);
		student2.setMathSubject("수학", 90);
		student2.showScore();
	}
}

package kr.co.himedia.arraylist02;

public class StudentTest {
	public static void main(String[] args) {
		
		Student studentS = new Student(2023, "수아");
		studentS.addSubject("국어", 100);
		studentS.addSubject("수학", 70);
		
		studentS.showInfo();
		
		Student studentA = new Student(1972, "아린");
		studentA.addSubject("국어", 20);
		studentA.addSubject("수학", 120);
		studentA.addSubject("과학", 100);
		
		studentA.showInfo();
	}
}

package kr.co.himedia.arraylist03;

/*
 * Himedia 학원에 학셍 3명
 * 각 학생마다 읽을 책을 기록 중
 * 읽은 책을 Student 클래스 내에 ArrayList를 생성하여 관리
 */

public class StudentTest {
	public static void main(String[] args) {
		Student studentS = new Student(0314, "Sua");
		studentS.addBook("상대를 홀리는 101가지 방법", "아리");
		studentS.addBook("혀를 휘어잡는 요리집", "탐켄치");
		
		Student studentM = new Student(0222, "Mimiru");
		studentM.addBook("귀멸의 칼날", "오니");
		studentM.addBook("나루토", "닌자");
		studentM.addBook("원피스", "해적");
		
		Student studentA = new Student(0501, "Arin");
		studentA.addBook("혁신적인 페르마의 증명", "페르마");
		studentA.addBook("네트워크 회로와 전기신호", "시스코");
		studentA.addBook("INFP도 할 수 있다! ~실전 대화편~", "아잉네");
		studentA.addBook("고백하고 싶은 당신을 위한 연애집", "수아");
		
		studentS.showInfo();
		studentM.showInfo();
		studentA.showInfo();
	}
}

	
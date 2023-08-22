package kr.co.himedia.miniproject.ui;

import kr.co.himedia.miniproject.school.School;
import kr.co.himedia.miniproject.school.Score;
import kr.co.himedia.miniproject.school.Student;
import kr.co.himedia.miniproject.school.Subject;
import kr.co.himedia.miniproject.school.view.GenerateGradeDisplay;
import kr.co.himedia.miniproject.utils.Constant;

/*
 * 1. 요구사항 정의
 * 
 * 		Himedia 아카데미
 * 	
 * 		5명의 학생이 수업을 들음
 * 			 --
 * 		과목은 국어, 수학 존재. 각 학생은 두 과목 모두 수강
 *      ---
 * 		전공은 국어교육학과, 컴퓨터공학 두 가지
 * 		국어교육학과는 국어가 필수과목, 컴퓨터공학은 수학이 필수과목
 * 
 * 		이번 학기 성적은 아래와 같다
 * 		-------------------------------------------------------------------
 * 		이름			학번			전공			필수과목		국어점수		수학점수
 * 		-------------------------------------------------------------------
 * 		수아		 20170314	  국어교욱학과	     국어			 100		  90
 * 		미미르	 20170222	  컴퓨터공학과		 수학			  90		  94
 *      아린		 20170501 	  컴퓨터공학과		 수학			  56		 100
 *      유화		 20190925	  국어교욱학과		 국어			  86		  73
 *      연화		 20190926	  국어교욱학과		 국어			  92		  90
 *      
 *      일반 과목: A ~ F
 *      필수 과목: S ~ F
 * 
 * 		필수 과목 학점
 * 		S		A		B		C		D		F
 * 	 ------------------------------------------------
 * 	  95~100   90~94   80~89   70~79   55~69   60미만
 * 
 *  	일반 과목 학점
 * 				A		B		C		D		F
 * 	 ------------------------------------------------
 * 	          90~100   80~89   70~79   55~69   60미만
 * 	
 * 
 * 		학점 결과를 아래와 같이 출력하도록 구현하시오
 * 		---
 * 		국어과목 학점 결과 >>>
 *		------------------------------------------------
 * 		이름			학번			필수		  점수		학점
 * 		------------------------------------------------
 * 		수아		 20170314	 	국어	      100		 S
 * 		미미르	 20170222	    수학		   90		 A
 *      아린		 20170501 	    수학		   56		 D
 *      유화		 20190925	    국어		   86		 B
 *      연화		 20190926	    국어		   92		 A
 *      ================================================
 *      
 *      수학과목 학점 결과 >>>
 *		------------------------------------------------
 * 		이름			학번			필수		  점수		학점
 * 		------------------------------------------------
 * 		수아		 20170314	 	국어	       90		 A
 * 		미미르	 20170222	    수학		   94		 A
 *      아린		 20170501 	    수학		  100		 S
 *      유화		 20190925	    국어		   73		 C
 *      연화		 20190926	    국어		   90		 A
 *		================================================
 *
 * 2. 업그레이드
 * 	  - 과목과 학점 정책이 추가
 * 		- 골프 과목이 새로 개설되고, 이 괴목의 평가 정책은 pass / fail 
 * 		- 70점 이상 pass, 미만 fail
 * 		- 5명 중 3명만 신청
 * 	  - 학점 결과를 아래같이 구현
 * 
 *      골프과목 학점 결과 >>>
 *		------------------------------------------------
 * 		이름			학번			과목		  점수		학점
 * 		------------------------------------------------
 * 		수아		 20170314	 	골프	       95		 P
 *      유화		 20190925	    골프		   65		 F
 *      연화		 20190926	    골프		   85		 P
 *		================================================
 */

public class UiMain {
	School foxSchool = School.getInstances();
	Subject korean;
	Subject math;
	Subject golf;

	GenerateGradeDisplay gradeDisplay = new GenerateGradeDisplay();
	
	public void createSubject() {
		korean = new Subject(Constant.KOREAN, "국어");
		math = new Subject(Constant.MATH, "수학");
		golf = new Subject(Constant.GOLF, "골프");
		
		golf.setGradeType(Constant.PF_TYPE);
		
		foxSchool.addSubject(korean);
		foxSchool.addSubject(math);
		foxSchool.addSubject(golf);
		
	}
	
	public static void main(String[] args) {
		UiMain uiMain = new UiMain();
		uiMain.createSubject();		//시험과목 생성
		uiMain.createStudent();		//수강생 생성
		
		String display = uiMain.gradeDisplay.getDisplay();
		System.out.println(display);
		
	}
	
	private void createStudent() {
		Student student1 = new Student("수아", 20170314, korean);
		Student student2 = new Student("미미르", 20170222, math);
		Student student3 = new Student("아린", 20170501, math);
		Student student4 = new Student("유화", 20190925, korean);
		Student student5 = new Student("연화", 20190926, korean);
		
		foxSchool.addStudent(student1);
		foxSchool.addStudent(student2);
		foxSchool.addStudent(student3);
		foxSchool.addStudent(student4);
		foxSchool.addStudent(student5);
		
		korean.register(student1);
		korean.register(student2);
		korean.register(student3);
		korean.register(student4);
		korean.register(student5);
		
		math.register(student1);
		math.register(student2);
		math.register(student3);
		math.register(student4);
		math.register(student5);
		
		golf.register(student1);
		golf.register(student4);
		golf.register(student5);
		
		//과목별 성적 입력
		addScoreForStudent(student1, korean, 100);
		addScoreForStudent(student1, math, 90);
		addScoreForStudent(student1, golf, 95);
		
		addScoreForStudent(student2, korean, 90);
		addScoreForStudent(student2, math, 94);
		
		addScoreForStudent(student3, korean, 56);
		addScoreForStudent(student3, math, 100);
		
		addScoreForStudent(student4, korean, 86);
		addScoreForStudent(student4, math, 73);
		addScoreForStudent(student4, golf, 65);
		
		addScoreForStudent(student5, korean, 92);
		addScoreForStudent(student5, math, 90);
		addScoreForStudent(student5, golf, 85);
		
	}
	
	private void addScoreForStudent(Student student, Subject subject, int score) {
		
		Score score1 = new Score(student.getStudentId(), subject, score);
		student.addSubjectScore(score1);
		
	}
}








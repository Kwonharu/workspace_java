package kr.co.himedia.miniproject.school.view;

import java.util.ArrayList;

import kr.co.himedia.miniproject.grade.BasicEvaluation;
import kr.co.himedia.miniproject.grade.PassFailEvaluation;
import kr.co.himedia.miniproject.grade.GradeEvaluation;
import kr.co.himedia.miniproject.grade.MajorEvaluation;
import kr.co.himedia.miniproject.school.School;
import kr.co.himedia.miniproject.school.Score;
import kr.co.himedia.miniproject.school.Student;
import kr.co.himedia.miniproject.school.Subject;
import kr.co.himedia.miniproject.utils.Constant;

public class GenerateGradeDisplay {
	
	School school = School.getInstances();
	
	public static final String TITLE = "과목 학점 결과 >>> \n";
	public static final String LINE = "------------------------------------------------ \n";
	public static final String HEADER = "이름\t   학번\t\t필수\t  점수\t    학점 \n";
	public static final String LINE2 = "================================================ \n";
	
	private StringBuffer buffer = new StringBuffer();
	
	public String getDisplay() {
		ArrayList<Subject> subjects =  school.getSubjects();
		
		for(Subject subject : subjects) {
			makeHeader(subject);
			makeBody(subject);
			makefooter(subject);
		}
		return buffer.toString();
	}

	private void makefooter(Subject subject) {
		
		
	}

	private void makeBody(Subject subject) {
		ArrayList<Student> students = subject.getStudents();
		for(int i=0; i<students.size(); i++) {
			Student student = students.get(i);
			
			buffer.append(student.getStudentName());
			
			if(student.getStudentName().length() >= 6) {
				buffer.append("\t");
			}else {
				buffer.append("\t");
			}
			
			buffer.append(student.getStudentId());
			buffer.append("\t");
			buffer.append(student.getMajorSubject().getSubjectName());
			buffer.append("\t  ");
			GetScoreGrade(student, subject);
			
			buffer.append("\n");
		}
		
	}

	private void GetScoreGrade(Student student, Subject subject) {
		
		ArrayList<Score> scoreList = student.getScores();
		int majorId = student.getMajorSubject().getSubjectId();
		
		GradeEvaluation[] gradeEvaluations = 
			{new BasicEvaluation(), new MajorEvaluation(), 
					new PassFailEvaluation()};		//학점 평가 클래스들
		
		for(int i = 0; i<scoreList.size(); i++) {	//학생이 가진 점수들
			Score score = scoreList.get(i);
			
			if(score.getSubject().getSubjectId() == subject.getSubjectId()) {
				String grade;

				if(score.getSubject().getGradeType() == Constant.PF_TYPE) {
					grade = gradeEvaluations[Constant.PF_TYPE].getGrade(score.getScore()); 
				}
				else{
					//필수과목
					if(score.getSubject().getSubjectId() == majorId) {	
						grade = gradeEvaluations[Constant.SAB_TYPE].getGrade(score.getScore()); 
					}else {
						grade = gradeEvaluations[Constant.AB_TYPE].getGrade(score.getScore()); 
					}
				}
				
				buffer.append(score.getScore());
				buffer.append("\t     ");
				buffer.append(grade);
			}
		}
			
	}

	private void makeHeader(Subject subject) {
		buffer.append(subject.getSubjectName());
		buffer.append(GenerateGradeDisplay.TITLE);
		buffer.append(GenerateGradeDisplay.LINE);
		buffer.append(GenerateGradeDisplay.HEADER);
		buffer.append(GenerateGradeDisplay.LINE2);
		
	}
	
}






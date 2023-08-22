package kr.co.himedia.miniproject.school;

public class Score {
	
	private int StudentId;		//학번
	private Subject subject; 	//과목
	private int score;			//점수
	
	public Score(int studentId, Subject subject, int score) {
		//super();
		this.StudentId = studentId;
		this.subject = subject;
		this.score = score;
	}

	public int getStudentId() {
		return StudentId;
	}

	public Subject getSubject() {
		return subject;
	}

	public int getScore() {
		return score;
	}
	
	
	
}

package com.javaex.ex01;

public class AuthorVo {

	//필드
	private int authorId;
	private String authorName;
	private String authorDesc;

	
	//생성자
	public AuthorVo() {
		super();
	}
	
	public AuthorVo(int authotId, String authorName, String authorDesc) {
		super();
		this.authorId = authotId;
		this.authorName = authorName;
		this.authorDesc = authorDesc;
	}
	

	//메서드 gs
	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authotId) {
		this.authorId = authotId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getAuthorDesc() {
		return authorDesc;
	}

	public void setAuthorDesc(String authorDesc) {
		this.authorDesc = authorDesc;
	}


	//메서드 일반
	@Override
	public String toString() {
		return "AuthorVo [authotId=" + authorId + ", authorName=" + authorName + ", authorDesc=" + authorDesc + "]";
	}
	
}







package kr.co.himedia.constructor02;

public class UserInfo {
	
	String userId;
	String userPW;
	String userName;
	String userAdd;
	String phoneNum;
	
	public UserInfo(String userId, String userPW, String userName) {
		this.userId = userId;
		this.userPW = userPW;
		this.userName = userName;
	}

	public UserInfo() {
		// TODO Auto-generated constructor stub
	}

	public String showUserInfo() {
		return "ID: "+userId+" Name: "+userName;
	}
	
}

package kr.co.himedia.constructor02;

public class UserInfoTest {
	public static void main(String[] args) {
		
		UserInfo userInfo = new UserInfo();
		userInfo.userId = "Suaaa";
		userInfo.userPW = "0314";
		userInfo.userName = "수아";
		System.out.println(userInfo.showUserInfo());
		
		UserInfo userInfo2 = new UserInfo("Mimiru", "0222", "미미르");
		System.out.println(userInfo2.showUserInfo());
	}
}

package kr.co.himedia.review;

public interface Connection {

		//DB 연결
	void getConnection(String url, String username, String password);
}

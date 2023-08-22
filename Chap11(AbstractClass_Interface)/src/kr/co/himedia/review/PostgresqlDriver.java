package kr.co.himedia.review;

public class PostgresqlDriver implements Connection {

	@Override
	public void getConnection(String url, String username, String password) {
		System.out.println("url, username, password 정보를 이용하여 Posgresql DB를 접속 시도한다.");
	}

}

package kr.co.himedia.exception03;

public class PasswordTest {
	
	private String passwd;

	public void setPassword(String passwd) throws PasswordException{
		if(passwd == null) {
			throw new PasswordException("pw는 null일 수 없다.");
		}else if(passwd.length() < 5){
			throw new PasswordException("pw는 5자 이상이어야 한다.");
		}else if(passwd.matches("[a-zA-Z]+")) {
								//어 이거 
			throw new PasswordException("pw는 숫자나 특수문자를 포함해야 한다.");
		}
		
		this.passwd = passwd;
	}
	
	public static void main(String[] args) {
		
		PasswordTest test = new PasswordTest();
		String password = null;
		
		try {
			test.setPassword(password);
			System.out.println("오류 없음");
		} catch (PasswordException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}

		System.out.println();
		
		password = "asdf";
		try {
			test.setPassword(password);
		} catch (PasswordException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		
		password = "asdfqwer";
		try {
			test.setPassword(password);
		} catch (PasswordException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("모시깽이");
	}
	
}



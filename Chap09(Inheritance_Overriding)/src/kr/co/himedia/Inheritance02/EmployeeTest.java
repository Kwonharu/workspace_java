package kr.co.himedia.Inheritance02;

public class EmployeeTest {
	public static void main(String[] args) {
		
		RempDTO dto = new RempDTO();
		System.out.println(dto);
		
		//상속관계에서 초기화 => 부모의 생성자에서 초기화 (정보은닉 적용)
		RempDTO dto2 = new RempDTO("asdf", 16, "010-1234-5678", "2017-05-01", "개발");
		
		System.out.println(dto2);
	}
}

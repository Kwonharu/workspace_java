package kr.co.himedia.encapsulation;

public class DisplayAddress {
	
	StringBuffer buffer = new StringBuffer();
	private String line = "=====================================\n";
	private String title = "이름\t 주소 \t\t 전화번호		\n";
	
	public String getAddress() {
		makeHeader();
		makeBody();
		makeFooter();
		return buffer.toString();
	}

	private void makeHeader() {
		buffer.append(line);
		buffer.append(title);
		buffer.append(line);
	}
	
	private void makeBody() {
		buffer.append("케인인\t");
		buffer.append("서울시 은평구 \t");
		buffer.append("010-2478-8962 \n");

		buffer.append("무빙맨\t");
		buffer.append("서울시 은평구 \t");
		buffer.append("010-1231-7897 \n");
	}
	
	private void makeFooter() {
		buffer.append(line);
	}
	
}

package kr.co.himedia.builder;

public interface MakeReport {
	
	void makeHeader();
	void makeBody();
	void makeFooter();
	
	String getReport();
	
}

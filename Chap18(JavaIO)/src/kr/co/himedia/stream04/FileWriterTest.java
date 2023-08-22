package kr.co.himedia.stream04;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	public static void main(String[] args) {
		
		try(FileWriter fw = new FileWriter("write.txt")){
			
			fw.write('A');		//문자 하나 출력
			
			char[] buf = {'B', 'C', 'D', 'E', 'F', 'G'};
			fw.write(buf);		//문자 하나 출력
			
			fw.write("수아앗! 수아앗...");	//String 출력
			fw.write(buf, 1, 2);	//문자 배열의 일부 출력
			fw.write("65");		//문자 65 출력
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("출력 완료");
	}
}

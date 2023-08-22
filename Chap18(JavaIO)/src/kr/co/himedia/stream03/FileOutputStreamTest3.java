package kr.co.himedia.stream03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest3 {
	public static void main(String[] args) throws FileNotFoundException {
		
		FileOutputStream fos = new FileOutputStream("output3.txt");
		//FileOutputStream은 AutoCloseable를 implements
		
		try(fos){

			byte[] bs = new byte[26];
			byte data = 65;		//'A'의 아스키 코드 값
			for(int i = 0; i<bs.length; i++) {
				bs[i] = data++;
			}
			fos.write(bs, 2, 10);		//배열의 두 번째 위치부터 10개 byte 출력하기
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("출력 완료.");
	}
}

package ex2_byte;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exam02 {
	public static void main(String[] args) throws Exception {
		// 파일의 경로를 지정
		File dir = new File("C:\\java\\test");
		// 파일의 이름을 변수로 지정
		File f = new File(dir, "aaa.txt");
		// ==================================> 파일만 지정해놓은 것
		
		FileInputStream fis = new FileInputStream(f);
		
		while(true) {
			// read()를 통해 한 글자씩 가져온다.
			int result = fis.read();
			
			// 파일의 데이터가 모두 전송되면 -1값을 가져온다.
			if(result == -1) {
				break;
			}
			System.out.println((char) result);
		}
		fis.close();
	}
}

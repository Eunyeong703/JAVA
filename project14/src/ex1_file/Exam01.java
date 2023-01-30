package ex1_file;

import java.io.File;
import java.io.IOException;

public class Exam01 {
	public static void main(String[] args) throws IOException {
		// 파일 경로 지정 및 파일 지정 방법
		File dir = new File("C:\\java\\test");
		File fl = new File("C:\\java\\test", "ddd.txt");
		File f2 = new File(dir, "eee.txt");
		File f3 = new File("C:\\java\\test\\fff.txt");
		
		// createNewFile() : 결과값 boolean
		if(f3.createNewFile()) {
			// 파일이 없으면 true
			System.out.println("파일을 생성합니다.");
		} else {
			// 파일이 있으면 false
			System.out.println("파일이 기존에 있습니다.");
		}
		
		long fileLength = f2.length();
		System.out.println("파일 크기 : " + fileLength);
		
		// 임시 파일 생성
		// File.createTempFile(처음나올 이름, 확장자, 경로)
		// test랜덤값.dat 파일이 생성된다.
		File imsi = File.createTempFile("test", ".dat", dir);
		
		// 프로그램이 종료되면 삭제된다.
		imsi.deleteOnExit();
		
		// 프로그램 종료를 5초 멈춤
		try {
			Thread.sleep(5000);
		} catch(Exception e) {
			
		}
		
		// File.delete() : 파일을 바로 삭제
		f3.delete();
		
		// 프로그램 종료를 5초 멈춤
		try {
			Thread.sleep(5000);
		} catch(Exception e) {
			
		}
	}
}

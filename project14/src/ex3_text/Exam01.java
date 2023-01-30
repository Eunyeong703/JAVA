package ex3_text;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Exam01 {
	public static void main(String[] args) throws Exception {
		File dir = new File("C:\\java\\test");
		File f = new File(dir, "zzz.txt");
		
		// true를 넣으면 이어쓰기, 생략하면 덮어쓰기
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
		// 한 줄 내림 안 되고 저장
		pw.print("안녕하세요.");
		pw.print("반갑습니다.");
		pw.print(123);
		
		pw.println("안녕하세요.");
		pw.println("반갑습니다.");
		pw.println(123);
		
		pw.println();
		
		//한 줄 내리고 저장
		pw.close();
		bw.close();
		fw.close();
	}
}

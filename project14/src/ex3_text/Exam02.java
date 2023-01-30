package ex3_text;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exam02 {
	public static void main(String[] args) throws Exception {
		File dir = new File("C:\\java\\test");
		File f = new File(dir, "zzz.txt");
		
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			String msg = br.readLine();
			
			// msg�� ������ ���� null�̶�� ���� �����Ͱ� ���ٴ� ���̴�.
			if(msg == null) {
				break;
			}
			System.out.println(msg);
		}
		
		br.close();
		fr.close();
	}
}

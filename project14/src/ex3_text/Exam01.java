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
		
		// true�� ������ �̾��, �����ϸ� �����
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
		// �� �� ���� �� �ǰ� ����
		pw.print("�ȳ��ϼ���.");
		pw.print("�ݰ����ϴ�.");
		pw.print(123);
		
		pw.println("�ȳ��ϼ���.");
		pw.println("�ݰ����ϴ�.");
		pw.println(123);
		
		pw.println();
		
		//�� �� ������ ����
		pw.close();
		bw.close();
		fw.close();
	}
}

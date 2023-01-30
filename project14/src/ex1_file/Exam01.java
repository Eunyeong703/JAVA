package ex1_file;

import java.io.File;
import java.io.IOException;

public class Exam01 {
	public static void main(String[] args) throws IOException {
		// ���� ��� ���� �� ���� ���� ���
		File dir = new File("C:\\java\\test");
		File fl = new File("C:\\java\\test", "ddd.txt");
		File f2 = new File(dir, "eee.txt");
		File f3 = new File("C:\\java\\test\\fff.txt");
		
		// createNewFile() : ����� boolean
		if(f3.createNewFile()) {
			// ������ ������ true
			System.out.println("������ �����մϴ�.");
		} else {
			// ������ ������ false
			System.out.println("������ ������ �ֽ��ϴ�.");
		}
		
		long fileLength = f2.length();
		System.out.println("���� ũ�� : " + fileLength);
		
		// �ӽ� ���� ����
		// File.createTempFile(ó������ �̸�, Ȯ����, ���)
		// test������.dat ������ �����ȴ�.
		File imsi = File.createTempFile("test", ".dat", dir);
		
		// ���α׷��� ����Ǹ� �����ȴ�.
		imsi.deleteOnExit();
		
		// ���α׷� ���Ḧ 5�� ����
		try {
			Thread.sleep(5000);
		} catch(Exception e) {
			
		}
		
		// File.delete() : ������ �ٷ� ����
		f3.delete();
		
		// ���α׷� ���Ḧ 5�� ����
		try {
			Thread.sleep(5000);
		} catch(Exception e) {
			
		}
	}
}

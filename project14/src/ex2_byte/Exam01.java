package ex2_byte;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Exam01 {
	public static void main(String[] args) throws Exception{
		// ������ ��θ� ����
		File dir = new File("C:\\java\\test");
		// ���� �̸��� ������ ����
		File f = new File(dir, "aaa.txt"); // ��ο� ���� �̸� ����
		// ================================== ������ ���������� �ʴ´�.
		
		// ������ ������ �������� ���ؼ� FileOutputStream�� ���
		// new FileOutputStream(���ϸ�) : �⺻���� false, �� ����Ⱑ �ȴ�.
		// new FileOutputStream(���ϸ�, true) : �̾��
		FileOutputStream fos = new FileOutputStream(f);
		
		// write() �޼��带 �̿��ؼ� ���� �������⸦ �Ѵ�.
		fos.write(65);
		fos.write('B');
		String msg = "Hello JAVA!!";
		
		// ���ڿ��� byte ���°� �ƴϱ� ������ String.getBytes() �޼��带 �̿��Ͽ� �迭 ���·� ����
		byte b[] = msg.getBytes();
		// fos.write(b);
		// fos.write(�迭, ���� �ε���, ���ڼ�)
		fos.write(b, 6, 4);
		
		// 10�� \n(��ĭ ����)�� �ǹ��Ѵ�.
		fos.write(10);
		// ��°��� byte�̱� ������ ���Ͽ� ����� ���� ASCII�ڵ� ������ �νĵǾ� ����ȴ�.
		// fos�� ���۵Ǵ� ��� �����ʹ� ���ڶ�� �����ϸ� �ȴ�.
		fos.close();
	}
}

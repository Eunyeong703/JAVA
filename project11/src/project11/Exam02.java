package project11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0;
		
			// try ~ catch ���� �̿��ϸ� ���α׷��� ������� �ʴ´�.
		try {
			// ���ܰ� �߻����� �ʾ��� ��
			System.out.print("���� �Է� : ");
			num1 = sc.nextInt();
		} catch (InputMismatchException ime) { // catch(���� ���� ����) 
			// ���ܰ� �߻����� ��
			// InputMismatchException�� �Էµ� ������ Ÿ�԰� ������ ������ ������ Ÿ���� �ٸ� �� �߻��Ѵ�.
			System.out.println("���ڸ� �Է� �����մϴ�.");
		} finally {
			// try ~ catch���� ����� ��
			// ���ܰ� �߻��ϰ� �߻����� �ʰ� ������ ����ȴ�.
			System.out.println("try ~ catch�� ����");
		}
		System.out.println(num1);
	}
}

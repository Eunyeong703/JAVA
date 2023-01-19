package project11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		
		try {
			System.out.print("���� �Է� : ");
			num1 = sc.nextInt();
			System.out.print("���� �Է� : ");
			num2 = sc.nextInt();
			// �ڹٿ����� �������� �� �� 0���� ������ ���ܰ� �߻��Ѵ�.
			System.out.println(num1 / num2);
		} catch (InputMismatchException ime) { 
			// catch���� ���� ������ ���ܸ� ó���� �� �ִ�.
			System.out.println("���ڸ� �Է� �����մϴ�.");
		} catch(ArithmeticException ae) {
			System.out.println("0���� ���� �� �����ϴ�.");
			// finally�� ���� ����
		} catch(Exception e) { // ���� ū ����. ���� �� ���� ������ �� ��.
			System.out.println("������ �߻��߽��ϴ�.");
			e.printStackTrace();
		}
	}
}
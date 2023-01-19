package project11;

import java.util.Scanner;

public class Exam05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] sub = {"����", "����", "����" };
		for(int i=0;i<3;i++) {
			try {

				System.out.print(sub[i] + " ���� �Է� : ");
				int score = sc.nextInt();

				// if���� ����ó�� ���·� ����� ����.
				if(score < 0 || score > 100) {
					throw new SubException(sub[i]);
				}

				System.out.println(sub[i] + " ���� : " + score);

			} catch(SubException se) {
				System.out.println(se.getMessage());
			} catch(Exception e) {
				System.out.println("���ڸ� ���� �մϴ�.");
			}
		}
	}
}
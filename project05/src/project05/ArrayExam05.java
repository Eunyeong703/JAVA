package project05;

import java.util.Scanner;

public class ArrayExam05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� �ο��� : ");
		int num = sc.nextInt();
		
		String name[] = new String[num];
		int score[][] = new int[num][4];
		double avg[] = new double[num];
		String subject[] = {"����", "����", "����", "����"};
		
		for(int i=0; i<num; i++) {
			System.out.println("###" + (i+1) + "��° ###");
			System.out.print("\n�̸� : ");
			name[i] = sc.next();

			
			for(int j=0;j<3;j++) { // 3�� ������ ������ �ڵ� ����ǹǷ�.
			System.out.print(subject[j]+" ���� �Է� : ");
			score[i][j] = sc.nextInt(); // j�� ���� ���� ���� ����
			score[i][3] += score[i][j]; // ���� ��
			
			}
			avg[i] = score[i][3] / 3.0;
		}
		
		System.out.println("\n");
			System.out.println("�̸�\t����\t���");
			for(int i=0; i<num ;i++) {
				System.out.printf("%s\t%d\t%.2f\n", name[i], score[i][3], avg[i]);
			
		}
	}
}

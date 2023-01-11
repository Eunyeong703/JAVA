package method.quiz;

import java.util.Scanner;

public class Quiz01 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static String nameInput() {
		System.out.print("�̸� �Է� : ");
		String name = sc.next();
		return name;
	}
	
	public static int scoreSum(int kor, int eng, int math) {
		return kor + eng + math;
	}
	
	public static double scoreAvg(int sum) {
		return sum/3.0;
	}
	public static int scoreInput(String subject) {
		System.out.print(subject + " ���� �Է� : ");
		int score = sc.nextInt();
		return score;
	}
	public static void output(String name, int sum, double avg) {
		System.out.println(name + "���� ������ " + sum + "���̰�, ����� " + avg + "�Դϴ�.");	
	}
	public static void main(String[] args) {
		String name = nameInput();
		int kor = scoreInput("����");
		int eng = scoreInput("����");
		int math = scoreInput("����");
		
		int sum = scoreSum(kor, eng, math); //���� int kor...�� ���� ����. ���� ���� �Ѱ��� ��
		double avg = scoreAvg(sum);
		
		output(name, sum, avg);
		}
}
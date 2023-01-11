package method.quiz;

import java.util.Scanner;

public class Quiz01 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static String nameInput() {
		System.out.print("이름 입력 : ");
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
		System.out.print(subject + " 점수 입력 : ");
		int score = sc.nextInt();
		return score;
	}
	public static void output(String name, int sum, double avg) {
		System.out.println(name + "님의 총점은 " + sum + "점이고, 평균은 " + avg + "입니다.");	
	}
	public static void main(String[] args) {
		String name = nameInput();
		int kor = scoreInput("국어");
		int eng = scoreInput("영어");
		int math = scoreInput("수학");
		
		int sum = scoreSum(kor, eng, math); //위의 int kor...과 같지 않음. 그저 값만 넘겨줄 뿐
		double avg = scoreAvg(sum);
		
		output(name, sum, avg);
		}
}
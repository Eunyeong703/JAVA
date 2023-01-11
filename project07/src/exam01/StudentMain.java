package exam01;

import java.util.Scanner;

// 성적에 대한 입력 프로그램을 실행하는 클래스
public class StudentMain {
	public static void main(String[] args) {
		// 이름, 국어, 영어, 수학 입력받기
		// 이름, 총점, 합계에 대한 출력
		
		// 객체 생성 방법
		// 클래스 변수명 = new 클래스명();
		
		Student s1 = new Student();
		s1.input();
		s1.output();
		
		Student s2 = new Student();
		s2.input();
		s2.output();
	}
}

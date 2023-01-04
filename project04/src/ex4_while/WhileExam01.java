package ex4_while;

public class WhileExam01 {
	public static void main(String[] args) {
		// while문 : 반복문
		// 형식상 횟수의 제한이 없는 무한반복에 많이 사용된다.
		// for문은 수치에 대한 반복(특정 횟수에 대한)
		// while문은 조건에 대한 반복(특정 조건이 되었을 때 종료함)
		
		// 형식
		// while(조건) { 반복할 문장 }
		// 시작조건과 증감값이 존재하지 않음 
		// ==> 형식 자체에서 반복에 대한 자유로움이 있다는 의미.
		
		int i = 0; //시작값을 while문 밖에서 만들어야 한다.
		
		while (i<10) {  // while(종료 조건)
			System.out.println(i); // 반복 실행할 문장
			i++; // 종료 조건에 맞추기 위한 식 - 증감값(내부에다 써야)
		}
	}
}

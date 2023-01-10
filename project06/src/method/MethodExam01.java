package method;

public class MethodExam01 {
	public static void main(String[] args) {
		// 메서드
		// 특정 기능이 반복되는 코드를 사용하는 방법
		// 1. copy & paste - 수정해야하는 코드를 일일히 찾아서 수정
		// 2. method - 수정해야하는 코드를 하나만 변경하면 된다.
		
		// public : 접근제한자 - 메서드에 대한 접근 권한
		// static : 지정 예약어 - 특정 기능을 가지는 키워드(생략 가능)
		// void : 반환형 - 메서드가 종료될 때 반환하는 값의 데이터 형식
		// main : 메서드 이름 - 메서드를 호출하기 위한 이름
		// (String[] args) : 매개변수 - 메서드를 호출한 메서드가 전달하는 데이터
		
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
	}
}

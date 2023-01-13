package exam09;

public class Exam09 {
	public static void main(String[] args) {
		// Object : 모든 객체의 최상위 클래스
		Exam09 e1 = new Exam09();
		Exam09 e2 = new Exam09();
		
		// Object.equals(Object obj) : 두 개의 객체가 같은지 비교 - boolean
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e1));
		
		// Object.clone() : 객체를 복사한다.
		// e.clone();
		
		// Object.finalize() : 객체의 리소스를 정리할 때 호출
		
		// Object.getClass() : 객체의 클래스형을 반환한다.
		System.out.println(e1.getClass());
		
		// Object.hascode() : 객체의 코드값을 반환한다.
		System.out.println(e1.hashCode()); // 위치값이라고 생각하면 된다.
		
		// Object.notity() : wait된 스레드 실행을 제거할 때 호출
		// Object.wait() : 스레드를 일시적으로 중지할 때 호출
		// Object.notityAll() : wait 되어있는 모든 스레드를 제거할 때 호출
		// Object.wait(long timeout) : timeout 시간만큼 일시정지 할 때 호출
		// Object.wait(long timeout, int nanos) : timeout 시간만큼 일시정지 할 때 호출

	}
}

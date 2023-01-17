package exam02;

// 인터페이스의 상속 키워드 implements 이다
public class Exam02 implements ExamInterface {

	@Override
	public void footString() {
		// TODO Auto-generated method stub
		System.out.println("사람의 다리는 " + FOOT + " 개 이다.");
	}

	@Override
	public void handString() {
		// TODO Auto-generated method stub
		System.out.println("사람의 손은 " + HAND + " 개 이다.");
	}

}
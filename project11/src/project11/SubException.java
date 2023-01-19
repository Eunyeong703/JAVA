package project11;

// 강제 예외 처리를 하기 위해서는 반드시 Exception을 상속받아야 한다.
public class SubException extends Exception {
	public SubException(String msg) { 
		super(msg); // 외부에서 받아오는 데이터를 Exception으로 전달해준다.
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage() + " 점수는 0 ~ 100까지 입니다.";
	}
}

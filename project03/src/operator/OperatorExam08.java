package operator;

public class OperatorExam08 {
	public static void main(String[] args) {
		
		String msg = false ? (true ? "A참" : "A거짓") : 
			(false? "B참" : "B거짓");
		// false(조건식) : "참" : "거짓" 
		System.out.println(msg);
	}
}

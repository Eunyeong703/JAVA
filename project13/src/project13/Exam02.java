package project13;

public class Exam02 {
	public static void main(String[] args) {
		// 기본 길이가 16인 공간을 가진 빈 문자열
		StringBuffer sb1 = new StringBuffer();
		// 20만큼의 공간을 가진 빈 문자열
		StringBuffer sb2 = new StringBuffer(20);
		// 문자열이 입력된 공간을 가진 문자열
		StringBuffer sb3 = new StringBuffer("Hello Hi Java!");
		
		// capacity() : 배열의 길이값 반환
		System.out.println(sb1.capacity());
		System.out.println(sb2.capacity());
		System.out.println(sb3.capacity());
		
		// append(문자열) : 문자열을 추가한다.
		sb3.append("test");
		System.out.println(sb3);
		
		// append(StringBuffer) : 문자열을 추가한다.
		StringBuffer sb4 = new StringBuffer("~~~~");
		sb3.append(sb4);
		System.out.println(sb3);
		
		// delete(start, end) : start부터 end-1까지 문자열을 제거 - end 인덱스는 안 지워진다.
		sb3.delete(14, 20);
		System.out.println(sb3);
		
		// insert(start, 문자열) : start 위치에 문자열을 추가하고 기존 문자는 뒤로 밀린다.
		sb3.insert(6, sb4);
		System.out.println(sb3);
		
		// replace(start, end, "문자열") : start부터 end-1 인덱스까지 문자를 문자열로 변환
		// end 위치는 바뀌지 않는다.
		sb3.replace(6, 9, "####"); // 6~9사이의 값을 "####"이 대체한다.
		System.out.println(sb3);
		
		// reverse() : 문자열의 순서를 반대로 반환
		System.out.println(sb3.reverse());
		
		// setLength(크기) : 새로운 길이로 재설정한다.
		System.out.println(sb3.capacity());
		sb3.setLength(40);
		System.out.println(sb3.capacity());
	}
}

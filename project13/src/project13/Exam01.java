package project13;

public class Exam01 {
	public static void main(String[] args) {
		String str1 = "HELLO hi Java!";
		String str2 = "hello HI jAVA!";
		
		// charAt(int index) : 지정된 인덱스 번호의 문자를 반환
		System.out.println(str1.charAt(4));
		
		// 같은 문자열이면 0, 그 외는 다 다른 문자열이다.
		// compareTo(문자열) : 문자열을 사전적으로 구분 - 대소문자를 구분
		System.out.println(str1.compareTo(str2));
		
		// compareToIgnoreCase(문자열) : 대소문자 구분이 없음
		System.out.println(str1.compareToIgnoreCase(str2));
		
		// 문자열 연결 연산자 + 를 이용해서 두 문자열이 연결가능하다.
		System.out.println(str1 + str2);
		
		// concat(문자열) : 두 문자열을 연결
		System.out.println(str1.concat(str2));
		
		// startWith(문자열) : 문자열이 입력된 문자열로 시작 - 대소문자를 구분
		System.out.println(str1.startsWith("HELLO"));
		System.out.println(str1.startsWith("HELLo"));
		System.out.println(str1.endsWith("!"));
		System.out.println(str1.endsWith("."));
		
		// equals(문자열) : 같은 문자열인지 비교 - 대소문자를 구분
		System.out.println(str1.equals(str2));
		
		// equalsIgnoreCase(문자열) : 같은 문자열인지 비교 - 대소문자 구분 안함
		System.out.println(str1.equalsIgnoreCase(str2));
		
		// getBytes() : 문자열을 byte 배열로 반환
		byte[] by = str1.getBytes();
		for(byte b : by) {
			System.out.print(b);
		}
		for(byte b : by) {
			System.out.print((char)b); // 문자로 보기 위해 char 형태로 형변환
		}
		
		// hashCode() : 해시코드 값 반환
		System.out.println(str1.hashCode());
		
		// indexOf("문자") : 해당 문자가 처음 나오는 인덱스 번호 반환
		System.out.println(str1.indexOf(" "));
		
		// lastIndexOf("문자") : 해당 문자가 마지막부터 앞으로 이동하면서 나오는 인덱스 번호 반환
		System.out.println(str1.lastIndexOf(" "));
		
		// isEmpty() : 비어있는지 알려준다.
		String str3 = "";
		System.out.println(str1.isEmpty());
		System.out.println(str3.isEmpty());
		
		// length() : 문자열 길이 반환
		System.out.println(str1.length());
		
		// split("문자") : 문자를 기준으로 배열을 만들어준다.
		String[] str4 = str1.split(" ");
		for(String s : str4) {
			System.out.println(s);
		}
		
		// subString(숫자) : 숫자부터 끝까지 문자열 반환
		System.out.println(str1.substring(6));
		
		// subString(숫자, 숫자) : 인덱스 번호 숫자부터 숫자-1 까지 문자열을 반환
		System.out.println(str1.substring(6, 9));
		
		// toCharArray() : 문자열을 char 배열로 반환
		char[] ch = str1.toCharArray();
		for(char c : ch) {
			System.out.print(c);
		}
		
		// toLowerCase() : 대문자를 소문자로, 소문자는 소문자로 반환
		System.out.println(str1.toLowerCase());
		
		// toUpperCase() : 대문자를 대문자로, 소문자는 대문자로 반환
		System.out.println(str1.toUpperCase());
		
		// trim() : 앞뒤 공백을 모두 없애고 반환
		String str5 = " 1234 ";
		System.out.println(str5.trim());
		
		// valueOf(기본형 데이터) : 기본 자료형 값을 문자열 형태 반환
		System.out.println(String.valueOf(123));
		
		int num = 1234;
		// String str6 = (String) num; 이것이 불가능하다.
		String str6 = String.valueOf(num);
		System.out.println(str6);
	}
}

package exam09;

public class Exam09_1 {
	public static void main(String[] args) {
		String str1 = "홍길동";
		System.out.println("str1 : " + str1.hashCode());
		System.out.println("str1.toString() : " + str1.toString());
		
		String str2 = "홍길동";
		System.out.println("str2 : " + str2.hashCode());
		System.out.println("str2.toString() : " + str2.toString());
		
		if(str1 == str2) {
			System.out.println("같다"); 
		} else {
			System.out.println("다르다");
		}
		
		String str3 = new String("홍길동");
		System.out.println("str3 : " + str3.hashCode());
		System.out.println("str3.toString() : " + str3.toString());
		
		if(str1 == str3) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
	}
}

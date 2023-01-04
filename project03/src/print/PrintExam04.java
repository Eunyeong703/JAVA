package print;

public class PrintExam04 {
	public static void main(String[] args) {
		// %d : 정수형 표시
		// %c : 단일 문자
		// %s : 문자열
		// %f : 실수형 - 소수점 6자리까지 출력 따라서 1.1111'00'
		System.out.printf("%d %c %s %f \n", 
				100, 'A', "안녕하세요", 1.1111);
		
		// %숫자[형식] : 숫자만큼 공간 확보 후 그 안에 출력
		System.out.printf("%d%d\n", 10, 10);
		System.out.printf("%5d%5d\n", 10, 10);
		
		System.out.printf("%3d%3d\n", 1000, 1000);
		// 출력할 때 공간이 데이터보다 작을경우 숫자(공간)은 무시하고 그냥 데이터 출력
		
		// (문자열도 마찬가지)
		System.out.printf("%10s\n","hello");
		System.out.printf("%10s\n","안녕하세요");
		
		
		// %-숫자[형식] : 숫자만큼 공간 확보 후 왼쪽부터 출력
		System.out.printf("%d%d\n", 10, 10);
		System.out.printf("%-5d%-5d\n", 10, 10);
		System.out.printf("%-3d%-3d\n", 1000, 1000);
		System.out.printf("%-10s\n","hello");
		System.out.printf("%-10s\n","안녕하세요");
		
		// %0숫자[형식] : 공간 확보 후 빈공간에 0을 추가하여 출력 (문자열은 안됨)
		System.out.printf("%d%d\n", 10, 10);
		System.out.printf("%05d%05d\n", 10, 10);
		System.out.printf("%03d%03d\n", 1000, 1000);
		
		System.out.printf("%03d - %04d - %04d\n", 10, 1234, 5678);
		
		// %숫자.소수점자리f : 숫자만큼 공간 확보 후 소수점 자리만큼 출력
		// 공간의 수는 생략 가능하다
		System.out.printf("%10.2f\n", 123.123456789);

		// %.소수점자리f
		System.out.printf("%.2f\n", 1234.56789);

	}
}

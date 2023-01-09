package project05;

public class ArrayExam01 {
	public static void main(String[] args) {
		// 배열 : 하나의 데이터 타입으로 여러 개의 값을 가진 변수를 의미한다.
		// 변수 : 하나의 값을 가진 메모리 영역
		// 변수명 : 메모리 영역의 데이터를 호출하기 위한 이름
		
		int num1 =10;
		int num2 = 20;
		int num3 = 30;
		System.out.println(num1 + ", " + num2 + ", " + num3);
		 
		// 배열 선언 - [데이터 타입] [변수명] [] = new [데이터타입] [저장할 수];
		int arr[] = new int[3]; // 정수형 값 3개를 저장하는 배열 선언
		// int arr[];
		// arr = new int[3];
		
		// 초기화 하는 방법 - 인덱스 번호를 사용한다.
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;

		// 출력하는 방법
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		// 배열 : 동일한 자료형의 여러 개의 값을 연이어 저장할 수 있는 공간의 집합체
		// 원소 : 각각의 인덱스에 저장된 값
		// 인덱스 : 배열에 접근하기 위한 순서
	}
}

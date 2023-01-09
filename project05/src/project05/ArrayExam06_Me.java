package project05;

import java.util.Scanner;

public class ArrayExam06_Me {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5]; // 정수형 값 5개를 저장하는 배열 선언
		
		// 배열의 크기를 알려주는 메서드 arr.length
		System.out.println(arr.length);
		
		// 인덱스를 저장하는 변수 필요함
		int idx = 0;
		
		while(true) {
			System.out.println("1. 입력");
			System.out.println("2. 출력");
			System.out.print("선택 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				if(idx == arr.length) {
					System.out.println("범위를 벗어났습니다.");
				} else {
					System.out.println("입력");
					System.out.println((idx+1) + "번째 정수 입력 : ");
					arr[idx] = sc.nextInt();
					idx++;
				}
				break;
			case 2:
				System.out.println("출력");
				if(idx == 0) {
					System.out.println("저장된 데이터가 없습니다.");
				} else {
					for(int i=0;i<idx;i++) {
						System.out.println(arr[i]);
					}
				}
				break;
			}
		}
	}
}

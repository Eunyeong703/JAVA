package project05;

public class ArrayExam08 {
	public static void main(String[] args) {
		// 배열의 문제점
		// 인덱스 순서에 따른 데이터 순차처리가 불가능하다는 것.
		// 삭제된 데이터 뒤에 있던 데이터를 앞으로 가져오는 방식으로 처리한다.
		
		int[] arr = {1,2,3,4,5};
		
		int cnt = 5; // 현재 위치값을 저장하는 애
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == 3) {
				System.out.println("삭제합니다.");
				// arr.length에서 1을 뺀 건 인덱스 5가 불가능하기 때문
				for(int j=i;j<arr.length-1;j++) {
					arr[j] = arr[j+1];
				}
				cnt--;
				break;
			}
		}
		
		for(int i=0;i<cnt;i++) {
			System.out.println(arr[i]);
		}
		
		arr[cnt] = 6;
		cnt++;
		
		for(int i=0;i<cnt;i++) {
			System.out.println(arr[i]);
		}
	}
}

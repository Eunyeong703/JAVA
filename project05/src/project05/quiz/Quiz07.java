package project05.quiz;

public class Quiz07 {
	public static void main(String[] args) {
		int sort[] = {5, 3, 7, 1, 2};
		
		// 버블 정렬 : 전체 내용을 계속 확인하면서 정렬하는 방식
//		for(int i=0; i<sort.length; i++) {
//			System.out.println((i+1)+" 회차");
//			for(int j=0;j<4;j++) { // 아랫줄에서 [j+1]을 할 것이기 때문에 4
//				if(sort[j] > sort[j+1]) {
//					int tmp = sort[j+1];
//					sort[j+1] = sort[j];
//					sort[j] = tmp;
//				}
//			}
//			System.out.println(sort[0] + ", " + sort[1] + ", " 
//			+ sort[2] + ", " + sort[3] + ", " + sort[4]);
//		}
		
        // 선택 정렬 : 회차당 제일 작은 수를 선택하고, 그 수를 제일 앞으로 이동
//		for(int i=0; i<4; i++) {
//			System.out.println((i+1)+" 회차");
//			for(int j=i+1;j<5;j++) { // 아랫줄에서 [j+1]을 할 것이기 때문에 4
//				if(sort[i] > sort[j]) { // i와 j를 비교함
//					int tmp = sort[i];
//					sort[i] = sort[j];
//					sort[j] = tmp;
//				}
//			}
//			System.out.println(sort[0] + ", " + sort[1] + ", " 
//			+ sort[2] + ", " + sort[3] + ", " + sort[4]);
//		}
//	}
		
		// 삽입 정렬 : 비교 대상을 하나씩 추가해서 정렬하는 방식
		for(int i=0; i<4; i++) {
		System.out.println((i+1)+" 회차");
		for(int j=i+1;j>0;j++) { // 아랫줄에서 [j+1]을 할 것이기 때문에 4
			if(sort[j-1] > sort[j]) { // i와 j를 비교함
				int tmp = sort[j-1];
				sort[j-1] = sort[j];
				sort[j] = tmp;
			}
		}
		System.out.println(sort[0] + ", " + sort[1] + ", " 
				+ sort[2] + ", " + sort[3] + ", " + sort[4]);
	}
}
}

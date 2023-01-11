package method.quiz;

import java.util.Scanner;

public class Quiz02 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("저장할 성적 갯수 입력 : ");
		int scoreNum = sc.nextInt();
		
		int[] score = new int[scoreNum];
		
		// 저장할 위치값을 가진 변수 필요
		int idx = 0;
		// 반복되어야 할 구간
		while(true) {
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 성적 수정");
			System.out.println("4. 성적 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				// 성적 입력
				System.out.println("### 성적 입력 ###");
				// 인덱스 번호가 저장공간 위치 보다 많아지만 에러가 발생하는데, 그걸 방지하기 위해서 if문 생성
				if(idx == scoreNum) {
					System.out.println("더 이상 저장할 공간이 없습니다.");
				} else {
				System.out.print((idx +1) + "번째 점수 입력 : ");
				score[idx] = sc.nextInt();
				// 입력 후 다음 저장 위치로 인덱스값을 증가시킨다.
				idx++;
				}
				break;
			case 2:
				System.out.println("### 성적 출력 ###");
				// 입력된 성적이 없을 경우에 사용자가 성적이 안나오는 이유를 알수 없기 때문에 만들어주는 것이 좋다.
				if(idx == 0) {
					System.out.println("입력된 성적이 없습니다.");
				} else {
				// 최대치를 idx로 잡은 이유 : 입력된 수 만큼만 출력하기 위해서
				for(int i=0; i<idx; i++) {
					System.out.println((i+1) + "번째 성적 : " + score[i]);
					}
				}
				break;
			case 3:
				// 성적 수정
				System.out.println("### 성적 수정 ###");
				if(idx == 0) {
					System.out.println("입력된 값이 없습니다.");
				} else {
					// scoreNum = 최대 저장할 수 있는 갯수
					// idx = 실제 저장된 갯수
				System.out.println("1 ~ " + idx + " 위치값 중 선택");
				System.out.print("수정할 위치값 입력 : ");
				int modSpace = sc.nextInt();
				
				// 입력받은 위치값이 저장된 수보다 많거나 1보다 작으면 에러 처리
				if(modSpace > idx || modSpace < 1) {
					System.out.println("선택된 위치값은 수정할 수 없습니다.");
				} else {
				// modSpace -1 처리한 이유는 입력을 1부터 받기 때문에 생긴다.
				System.out.print("수정할 성적 입력 : ");
				score[modSpace - 1] = sc.nextInt();
					}
				}
				break;
			case 4:
				// 성적 삭제
				System.out.println("### 성적 삭제 ###");
				// 삭제할 데이터가 없으면 실행할 필요가 없기 때문에 if문 사용
				if(idx == 0) {
					System.out.println("입력된 데이터가 없습니다.");
				} else {
					System.out.println("1 ~ " + idx + " 위치값 중 선택");
					System.out.print("삭제할 위치값 입력 : ");
					int delSpace = sc.nextInt();
					
					if(delSpace > idx || delSpace < 1) {
						System.out.println("선택된 위치값은 삭제할 수 없습니다.");
					} else {
						// idx를 -1처리한 이유는 범위 밖의 값을 가져올 수 있기 때문이다.
						idx --;
						for(int i=delSpace-1;i<idx;i++) {
							score[i] = score[i+1];
						}
						System.out.println("삭제가 완료되었습니다.");
					}
				}
				break;
			case 0:
				// 반복문 종료 - while문을 종료해도 되지만 return으로 main 메서드 종료 가능
				System.out.println("프로그램 종료");
				return;
			default:
				// 위의 1,2,3,4,0번 숫자 이외에 모든 값을 처리
				System.out.println("선택된 메뉴가 없습니다.");
			}
		}
	}
}

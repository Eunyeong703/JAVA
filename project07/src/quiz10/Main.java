package quiz10;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MainService ms = new MainService();
		
		int scoreNum = ms.scoreNum();
		
		Score[] score = new Score[scoreNum];
		int idx = 0;
		
		while(true) {
			int menu = ms.menu();
			
			sub:switch(menu) {
			case 1:
				System.out.println("===== 점수 입력 =====");
				if(idx == scoreNum) {
					System.out.println("더 이상 저장할 공간이 없습니다.");
				} else {
					score[idx] = ms.input();
					idx++;
				}
				break;
			case 2:
				System.out.println("===== 점수 출력 =====");
				if(idx == 0) {
					System.out.println("저장된 데이터가 없습니다.");
				} else {
					ms.output(idx, score);
				}
				break;
			case 3:
				System.out.println("===== 점수 수정 =====");
				if(idx == 0) {
					System.out.println("저장된 데이터가 없습니다.");
				} else {
					score = ms.mod(idx, score);
				}
				break;
			case 4:
				System.out.println("===== 점수 삭제 =====");
				if(idx == 0) {
					System.out.println("저장된 데이터가 없습니다.");
				} else {
					System.out.print("삭제할 이름 입력 : ");
					String delName = sc.next();
					
					for(int i=0;i<idx;i++) {
						if(delName.equals(score[i].getName())) {
							idx--;
							score = ms.del(idx, score, i, delName);
							break sub;
						}
					}
				}
				System.out.println("찾으시는 이름이 없습니다.");
				break;
			case 0:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("선택된 메뉴가 없습니다.");
			}
			System.out.println();
		}
	}
}
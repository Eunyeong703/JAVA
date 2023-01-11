package quiz01;

import java.util.Scanner;

public class GroupMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.print("입력할 그룹 수 입력 : ");
		int groupNum = sc.nextInt();
			
		Group group[] = new Group[groupNum];
		int idx = 0;
			
		while(true) {
			System.out.println("1. 입력");
			System.out.println("2. 출력");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 : ");
				
			int menu = sc.nextInt();
				
			switch(menu) {
			case 1:
				if(idx==groupNum) {
					System.out.println("저장할 공간이 없습니다.");
				} else {
				group[idx] = new Group();
				System.out.print("그룹 이름 입력 : ");
				group[idx].setgName(sc.next());
				System.out.print("그룹 인원 입력 : ");
				group[idx].setMember(sc.nextInt());
				System.out.print("그룹 대표곡 입력 : ");
				group[idx].setSong(sc.next());
				idx++; 
				}
				break;
			case 2:
				for(int i=0;i<idx;i++) {
					System.out.println("### " + group[i].getgName() + " ###");
					System.out.println("인원수 : " + group[i].getMember());
					System.out.println("대표곡 : " + group[i].getSong());
				}
				break;
			case 0:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("선택된 메뉴가 없습니다.");
			}
		}
	}
}

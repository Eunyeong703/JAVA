package project05.quiz;

import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("저장할 인원 입력 : ");
		int inwon = sc.nextInt();
		
		// 이름, 전화번호 저장 변수 배열
		String name[] = new String[inwon];
		String tel[] = new String[inwon];
		
		// 인덱스 번호를 가지는 변수
		int idx = 0;
		
		while(true) {
			// 반복될 메뉴
			System.out.println("1. 전화번호 입력");
			System.out.println("2. 전화번호 출력");
			System.out.println("3. 전화번호 수정");
			System.out.println("4. 전화번호 삭제");
			System.out.println("5. 전체 전화번호");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 선택");
			int menu = sc.nextInt();
			
			// 기능 구현
			switch(menu) {
			case 1: // 전화번호 입력
				if(idx==inwon) {
					System.out.println("더 이상 저장할 공간이 없습니다.");
				} else {
				System.out.print("이름 입력 : ");
				name[idx] = sc.next();
				System.out.print("전화번호 입력 : ");
				tel[idx] = sc.next();
				idx++;
				}
				break;
			case 2: // 전화번호 출력
				System.out.println("#### 전화번호 출력 ####");
				System.out.print("출력할 이름 입력 : ");
				String findName = sc.next();
				
				for(int i=0;i<idx;i++) {
					if(findName.equals(name[i])) {
						System.out.println("이름 : " + findName);
						System.out.println("전화번호 : " + tel[i]);
						break;
					}
				}
				break;
			case 3: // 전화번호 수정
				System.out.println("#### 전화번호 출력 ####");
				System.out.print("수정할 이름 입력 : ");
				String modName = sc.next();
				
				for(int i=0;i<idx;i++) {
					if(modName.equals(name[i])) {
						System.out.print("수정할 전화번호 입력 : ");
						tel[i] = sc.next();
						break;
					}
				}
				break;
			case 4: // 전화번호 삭제
				System.out.println("#### 전화번호 삭제 ####");
				System.out.print("삭제할 이름 입력 : ");
				String delName = sc.next();
				
				for(int i=0;i<idx;i++) {
					if(delName.equals(name[i])) {
						idx--;
						for(int j=i;j<idx;j++) {
							name[j] = name[j+1];
							tel[j] = tel[j+1];
						}
						System.out.println(delName + "님의 정보를 삭제합니다.");
						break;
					}
				}
				break;
			case 5: // 전체 전화번호 출력
				System.out.println("#### 전체 전화번호 ####");
				for(int i=0;i<idx;i++) {
					System.out.println("==== " + name[i] + " ====");
					System.out.println("전화번호 : " + tel[i]);
				}
				break;
			case 0: // 프로그램 종료
				System.out.println("#### 프로그램 종료 ####");
				return;
			default: // 없는 메뉴 선택시
				System.out.println("잘못된 메뉴 선택입니다.");
			}
			System.out.println();
		}
	}
}

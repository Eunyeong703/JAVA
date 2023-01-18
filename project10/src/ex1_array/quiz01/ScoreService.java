package quiz01;

import java.util.List;
import java.util.Scanner;

public class ScoreService implements ScoreServiceImpl{
	Scanner sc = new Scanner(System.in);
	
	@Override
	public int menu() {
		// TODO Auto-generated method stub
		System.out.println("1. 점수 등록");
		System.out.println("2. 점수 출력");
		System.out.println("3. 점수 수정");
		System.out.println("4. 점수 삭제");
		System.out.println("5. 전체 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택 : ");
		return sc.nextInt();
	}

	@Override
	public void input(List<Score> scoreList) {
		// TODO Auto-generated method stub
		Score s = new Score();
		System.out.print("이름 입력 : ");
		s.setName(sc.next());
		System.out.print("점수 입력 : ");
		s.setNum(sc.nextInt());
		
		scoreList.add(s);
	}

	@Override
	public void output(List<Score> scoreList) {
		// TODO Auto-generated method stub
		for (Score s: scoreList) {
			System.out.println("이름 : " + s.getName());
			System.out.println("점수 : " + s.getNum());
		}
	}

	@Override
	public void modify(List<Score> scoreList) {
		// TODO Auto-generated method stub
		System.out.print("수정할 이름 입력 : ");
		String name = sc.next();
		
		for(Score s: scoreList) {
			if(s.getName().equals(name)) {
				System.out.print("수정할 점수 입력 : ");
				s.setNum(sc.nextInt());
				break;
			}
		}
	}

	@Override
	public void delete(List<Score> scoreList) {
		// TODO Auto-generated method stub
		System.out.print("삭제할 이름 입력 : ");
		String name = sc.next();
		
		for(Score s: scoreList) {
			if(s.getName().equals(name)) {
				System.out.println(name + "님의 정보를 삭제합니다.");
				scoreList.remove(s);
				break;
			}
		}
	}

	@Override
	public void clear(List<Score> scoreList) {
		// TODO Auto-generated method stub
		System.out.print("전체 삭제를 하시겠습니까? (Y/N)");
		String confirm = sc.next();
		
		if(confirm.equals("Y") || confirm.equals("y")) {
			scoreList.clear();
		} else {
			System.out.println("삭제 취소합니다.");
		}
	}
}

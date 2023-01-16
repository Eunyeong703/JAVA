package quiz01;

public class ScoreService extends Template{

	@Override
	public int menu() {
		// TODO Auto-generated method stub
		System.out.println("1. 점수 입력");
		System.out.println("2. 점수 출력");
		System.out.println("3. 점수 수정");
		System.out.println("4. 점수 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택 : ");
		return sc.nextInt();
	}

	@Override
	public void input(Object[] obj) {
		// TODO Auto-generated method stub
		Score[] score = (Score[]) obj; 
		score[idx] = new Score();
		System.out.print("이름 입력 : ");
		score[idx].setName(sc.next());
		System.out.print("국어 점수 입력 : ");
		score[idx].setKor(sc.nextInt());
		System.out.print("영어 점수 입력 : ");
		score[idx].setEng(sc.nextInt());
		System.out.print("수학 점수 입력 : ");
		score[idx].setMath(sc.nextInt());
		score[idx].setSum();
		score[idx].setAvg();
		idx++;
	}

	public void emptyData() {
		System.out.println("저장된 데이터가 없습니다.");
	}
	@Override
	public void output(Object[] obj) {
		// TODO Auto-generated method stub
		Score[] score = (Score[]) obj;
		if(idx == 0) {
			emptyData();
		} else {
			for(int i=0;i<idx;i++) {
				System.out.println("### " + score[i].getName() + " ###");
				System.out.println("총점 : " + score[i].getSum());
				System.out.println("평균 : " + score[i].getAvg());
			}
		}
	}

	@Override
	public void modify(Object[] obj) {
		// TODO Auto-generated method stub
		Score[] score = (Score[]) obj;
		if(idx == 0) {
			emptyData();
		} else {
			System.out.print("수정할 이름 입력 : ");
			String name = sc.next();
			
			for(int i=0;i<idx;i++) {
				if(name.equals(score[i].getName())) {
					System.out.print("국어 점수 입력 : ");
					score[i].setKor(sc.nextInt());
					System.out.print("영어 점수 입력 : ");
					score[i].setEng(sc.nextInt());
					System.out.print("수학 점수 입력 : ");
					score[i].setMath(sc.nextInt());
					score[i].setSum();
					score[i].setAvg();
					return;
				}
			}
			System.out.println("찾으시는 이름이 없습니다.");
		}
	}

	@Override
	public void delete(Object[] obj) {
		// TODO Auto-generated method stub
		Score[] score = (Score[]) obj;
		if(idx == 0) {
			emptyData();
		} else {
			System.out.print("삭제할 이름 입력 : ");
			String name = sc.next();
			
			for(int i=0;i<idx;i++) {
				if(name.equals(score[i].getName())) {
					System.out.println(name + " 님의 정보를 삭제합니다.");
					idx--;
					for(int j=i;j<idx;j++) {
						score[j] = score[j+1];
					}
					return;
				}
			}
			System.out.println("찾으시는 이름이 없습니다.");
		}
	}

}
package quiz01;

public class ScoreService extends Template{

	@Override
	public int menu() {
		// TODO Auto-generated method stub
		System.out.println("1. ���� �Է�");
		System.out.println("2. ���� ���");
		System.out.println("3. ���� ����");
		System.out.println("4. ���� ����");
		System.out.println("0. ���α׷� ����");
		System.out.print("���� : ");
		return sc.nextInt();
	}

	@Override
	public void input(Object[] obj) {
		// TODO Auto-generated method stub
		Score[] score = (Score[]) obj; 
		score[idx] = new Score();
		System.out.print("�̸� �Է� : ");
		score[idx].setName(sc.next());
		System.out.print("���� ���� �Է� : ");
		score[idx].setKor(sc.nextInt());
		System.out.print("���� ���� �Է� : ");
		score[idx].setEng(sc.nextInt());
		System.out.print("���� ���� �Է� : ");
		score[idx].setMath(sc.nextInt());
		score[idx].setSum();
		score[idx].setAvg();
		idx++;
	}

	public void emptyData() {
		System.out.println("����� �����Ͱ� �����ϴ�.");
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
				System.out.println("���� : " + score[i].getSum());
				System.out.println("��� : " + score[i].getAvg());
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
			System.out.print("������ �̸� �Է� : ");
			String name = sc.next();
			
			for(int i=0;i<idx;i++) {
				if(name.equals(score[i].getName())) {
					System.out.print("���� ���� �Է� : ");
					score[i].setKor(sc.nextInt());
					System.out.print("���� ���� �Է� : ");
					score[i].setEng(sc.nextInt());
					System.out.print("���� ���� �Է� : ");
					score[i].setMath(sc.nextInt());
					score[i].setSum();
					score[i].setAvg();
					return;
				}
			}
			System.out.println("ã���ô� �̸��� �����ϴ�.");
		}
	}

	@Override
	public void delete(Object[] obj) {
		// TODO Auto-generated method stub
		Score[] score = (Score[]) obj;
		if(idx == 0) {
			emptyData();
		} else {
			System.out.print("������ �̸� �Է� : ");
			String name = sc.next();
			
			for(int i=0;i<idx;i++) {
				if(name.equals(score[i].getName())) {
					System.out.println(name + " ���� ������ �����մϴ�.");
					idx--;
					for(int j=i;j<idx;j++) {
						score[j] = score[j+1];
					}
					return;
				}
			}
			System.out.println("ã���ô� �̸��� �����ϴ�.");
		}
	}

}
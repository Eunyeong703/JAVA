package quiz01;

public class ScoreMain {
	public static void main(String[] args) {
		ScoreService ss = new ScoreService();
		Score[] score = new Score[5];
		
		while(true) {
			int menu = ss.menu();
			
			switch(menu) {
			case 1:
				ss.input(score);
				break;
			case 2:
				ss.output(score);
				break;
			case 3:
				ss.modify(score);
				break;
			case 4:
				ss.delete(score);
				break;
			case 0:
				System.out.println("���α׷� ����");
				return;
			default:
				System.out.println("���õ� �޴��� �����ϴ�.");
			}
			System.out.println();
		}
	}
}
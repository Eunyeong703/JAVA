package project05.quiz;

public class Quiz07 {
	public static void main(String[] args) {
		int sort[] = {5, 3, 7, 1, 2};
		
		// ���� ���� : ��ü ������ ��� Ȯ���ϸ鼭 �����ϴ� ���
//		for(int i=0; i<sort.length; i++) {
//			System.out.println((i+1)+" ȸ��");
//			for(int j=0;j<4;j++) { // �Ʒ��ٿ��� [j+1]�� �� ���̱� ������ 4
//				if(sort[j] > sort[j+1]) {
//					int tmp = sort[j+1];
//					sort[j+1] = sort[j];
//					sort[j] = tmp;
//				}
//			}
//			System.out.println(sort[0] + ", " + sort[1] + ", " 
//			+ sort[2] + ", " + sort[3] + ", " + sort[4]);
//		}
		
        // ���� ���� : ȸ���� ���� ���� ���� �����ϰ�, �� ���� ���� ������ �̵�
//		for(int i=0; i<4; i++) {
//			System.out.println((i+1)+" ȸ��");
//			for(int j=i+1;j<5;j++) { // �Ʒ��ٿ��� [j+1]�� �� ���̱� ������ 4
//				if(sort[i] > sort[j]) { // i�� j�� ����
//					int tmp = sort[i];
//					sort[i] = sort[j];
//					sort[j] = tmp;
//				}
//			}
//			System.out.println(sort[0] + ", " + sort[1] + ", " 
//			+ sort[2] + ", " + sort[3] + ", " + sort[4]);
//		}
//	}
		
		// ���� ���� : �� ����� �ϳ��� �߰��ؼ� �����ϴ� ���
		for(int i=0; i<4; i++) {
		System.out.println((i+1)+" ȸ��");
		for(int j=i+1;j>0;j++) { // �Ʒ��ٿ��� [j+1]�� �� ���̱� ������ 4
			if(sort[j-1] > sort[j]) { // i�� j�� ����
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

package project05;

public class ArrayExam08 {
	public static void main(String[] args) {
		// �迭�� ������
		// �ε��� ������ ���� ������ ����ó���� �Ұ����ϴٴ� ��.
		// ������ ������ �ڿ� �ִ� �����͸� ������ �������� ������� ó���Ѵ�.
		
		int[] arr = {1,2,3,4,5};
		
		int cnt = 5; // ���� ��ġ���� �����ϴ� ��
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == 3) {
				System.out.println("�����մϴ�.");
				// arr.length���� 1�� �� �� �ε��� 5�� �Ұ����ϱ� ����
				for(int j=i;j<arr.length-1;j++) {
					arr[j] = arr[j+1];
				}
				cnt--;
				break;
			}
		}
		
		for(int i=0;i<cnt;i++) {
			System.out.println(arr[i]);
		}
		
		arr[cnt] = 6;
		cnt++;
		
		for(int i=0;i<cnt;i++) {
			System.out.println(arr[i]);
		}
	}
}

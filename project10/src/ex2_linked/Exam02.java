package ex2_linked;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exam02 {
	public static void main(String[] args) {
		List arr = new ArrayList();
		
		arr.add(10);
		arr.add("ȫ�浿");
		arr.add(1.234);
		
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		
		List<String> str = new LinkedList<String>();
		str.add("ȫ�浿");
		// ���׸����� ������ Ÿ���� �����ϸ� �ٸ� ������ Ÿ���� ������� �ʴ´�.
		// str.add(10);
		// str.add(1.233);
		
		// ������ : Integer, Double, Long ������ ������ Ÿ��(Wrapper Ÿ��)
		// List���� �������� ����ؾ� �ϴ� ������ null���� ����Ǿ�� �ϱ� �����̴�.
		List<Integer> num = new ArrayList<Integer>();
		List<Double> db = new ArrayList<Double>();
	}
}

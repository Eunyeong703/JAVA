package ex1_list;

import java.util.ArrayList;
import java.util.List;

public class Exam01 {
	public static void main(String[] args) {
	// List<> : <>�� ���׸��̶� �θ��µ� �̰��� �������� ������ ��� �ڷ��� ������ �����ϴ�.
	// ���׸��� �����ϸ� �ش��ϴ� ������ Ÿ�Ը� ���� ����
		List<String> strList = new ArrayList<String>();
		
		// boolean add(E e);
		// true�̸� ����� ���̰�, false�� ���е� ��.
		boolean b = strList.add("ȫ�浿");
		System.out.println(b);
		strList.add("�̼���");
		strList.add("������");
		
		// �迭 ���� ���, ����� ��Ÿ�� ���� �迭�̸�.length�� ���
		// List���� ���, �޼��带 ����ؾ� �ϰ� List�̸�.size() ���
		for(int i=0;i<strList.size();i++) {
			System.out.println(strList.get(i));
		}
		
		System.out.println();
		// for(������Ÿ�� ������ : List������)
		// List ������ ���� ���� ������ ��ȯ���ִ� ����� ����� �� �ִ�.
		for(String s : strList) {
			System.out.println(s);
		}
		System.out.println();
		
		// void add(int index, E e) : �ε��� �ڸ��� �߰� ��ü�� ����
		strList.add(1, "������");
		for(String s : strList) {
			System.out.println(s);
		}
		System.out.println();
		
		// set(int index, E e) : �ε��� �ڸ��� �ִ� �����ʹ� �����ϰ�, ���ο� ������ ����
		strList.set(2, "�ɻ��Ӵ�");
		for(String s : strList) {
			System.out.println(s);
		}
		System.out.println();
		
		// contains(Object o) : ���� ��ü�� �ִ��� ��
		System.out.println(strList.contains("ȫ�浿"));
		System.out.println(strList.contains(new String ("ȫ�浿")));
		// Ŭ������ ��ü�� ���ٴ� ǥ���� ������ ��ƴ�. ��Ȯ���� �������ٰ� ���� ��.
		
		List list = new ArrayList();
		// isEmpty : ��������� true, �����Ͱ� �����ϸ� false
		System.out.println(list.isEmpty());
		System.out.println(strList.isEmpty());
		System.out.println();
		
		// remove(int index) : �����͸� �����ϸ鼭 ������ ��ȯ
		String str = strList.remove(1);
		System.out.println(str);
		System.out.println();
		
		// remove(Object o) : �����Ǹ� true, �ȵǸ� false
		boolean t = strList.remove("ȫ�浿");
		System.out.println(t);
		
		// clear() : ��� ������ ����
		strList.clear();
		
		System.out.println(strList.isEmpty());
	}
}

package ex4_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Exam01 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// ����
		map.put("hong", 1234);
		map.put("lee", 1234);
		map.put("kim", 1234);
		
		// ũ��
		System.out.println(map.size());
		
		// Ű���� �̿��ؼ� ���� ��ȯ
		System.out.println(map.get("hong"));
		
		// ���� Ű���� �ִ��� ��
		System.out.println(map.containsKey("hong"));
		System.out.println(map.containsKey("yoo"));
		
		// ���� ���� �ִ��� �� 
		System.out.println(map.containsValue(1234));
		System.out.println(map.containsValue(0000));
		
		// map.entry ������ ���� ���
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIter = entrySet.iterator();
		
		while(entryIter.hasNext()) {
			Map.Entry<String, Integer> entry = entryIter.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		System.out.println();
		
		for(Map.Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println();
		}
		
		// Ű���� ��������
		Set<String> keySet = map.keySet();
		for(String s : keySet) {
			System.out.println(s);
		}
		
		// ���� ��������
		Collection<Integer> value = map.values();
		for(int i:value) {
			System.out.println(i);
		}
		
		// Ű������ ����
		int num = map.remove("hong");
		System.out.println(num);
		System.out.println(map.size());
		
		// ��ü  ����
		map.clear();
		
		// �÷��� ��� �ִ��� ����
		if(map.isEmpty()) {
			System.out.println("��ü ���� �Ϸ�");
		}
	}
}
package ex4_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Exam02 {
	public static void main(String[] args) {
		Map<String, User> map = new HashMap<String, User>();
		
		User u1 = new User();
		u1.id = "ȫ�浿";
		u1.pwd = "1234";
		
		// Ű�� ���̵�, ���� ��ü
		map.put(u1.id, u1);
		
		User u2 = new User();
		u2.id = "�̼���";
		u2.pwd = "1234";
		
		Set<String> key = map.keySet();
		
		for(String s : key) {
			if(s.equals(u2.id)) {
				System.out.println("���̵� �����ϴ�.");
			} else {
				System.out.println("���� �����մϴ�.");
			}
		}
	}
}

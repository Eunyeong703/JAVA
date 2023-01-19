package ex4_map;

import java.util.HashMap;
import java.util.Map;

public class Exam03 {
	public static void main(String[] args) {
		Map<String, User> userList = new HashMap<String, User>();
		
		User u1 = new User();
		u1.id = "hong";
		u1.pwd = "1234";
		
		userList.put(u1.id, u1);
		
		User u2 = userList.get("hong");
		System.out.println(u2.id);
		
		User u3 = userList.get("lee");
		// Ű�� �ش��ϴ�  ���� ������ null ���� ����.
		System.out.println(u3);
		// null ���� �Ӽ��� �̿��ϸ� (.) ���ܰ� �߻��Ѵ�. 
		// System.out.println(u3.id);
	}
}
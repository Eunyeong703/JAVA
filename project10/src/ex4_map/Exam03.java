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
		// 키에 해당하는  값이 없으면 null 값이 들어간다.
		System.out.println(u3);
		// null 값의 속성을 이용하면 (.) 예외가 발생한다. 
		// System.out.println(u3.id);
	}
}
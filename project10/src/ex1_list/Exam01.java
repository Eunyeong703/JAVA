package ex1_list;

import java.util.ArrayList;
import java.util.List;

public class Exam01 {
	public static void main(String[] args) {
	// List<> : <>를 제네릭이라 부르는데 이것을 설정하지 않으면 모든 자료형 저장이 가능하다.
	// 제네릭을 설정하면 해당하는 데이터 타입만 저장 가능
		List<String> strList = new ArrayList<String>();
		
		// boolean add(E e);
		// true이면 저장된 것이고, false면 실패된 것.
		boolean b = strList.add("홍길동");
		System.out.println(b);
		strList.add("이순신");
		strList.add("김유신");
		
		// 배열 같은 경우, 사이즈를 나타낼 때는 배열이름.length를 사용
		// List같은 경우, 메서드를 사용해야 하고 List이름.size() 사용
		for(int i=0;i<strList.size();i++) {
			System.out.println(strList.get(i));
		}
		
		System.out.println();
		// for(데이터타입 변수명 : List변수명)
		// List 변수가 가진 값을 변수명에 반환해주는 방식을 사용할 수 있다.
		for(String s : strList) {
			System.out.println(s);
		}
		System.out.println();
		
		// void add(int index, E e) : 인덱스 자리에 추가 객체를 저장
		strList.add(1, "유관순");
		for(String s : strList) {
			System.out.println(s);
		}
		System.out.println();
		
		// set(int index, E e) : 인덱스 자리에 있는 데이터는 제거하고, 새로운 데이터 저장
		strList.set(2, "심사임당");
		for(String s : strList) {
			System.out.println(s);
		}
		System.out.println();
		
		// contains(Object o) : 같은 객체가 있는지 비교
		System.out.println(strList.contains("홍길동"));
		System.out.println(strList.contains(new String ("홍길동")));
		// 클래스의 객체는 같다는 표현이 나오기 어렵다. 정확도가 떨어진다고 보면 됨.
		
		List list = new ArrayList();
		// isEmpty : 비어있으면 true, 데이터가 존재하면 false
		System.out.println(list.isEmpty());
		System.out.println(strList.isEmpty());
		System.out.println();
		
		// remove(int index) : 데이터를 삭제하면서 데이터 반환
		String str = strList.remove(1);
		System.out.println(str);
		System.out.println();
		
		// remove(Object o) : 삭제되면 true, 안되면 false
		boolean t = strList.remove("홍길동");
		System.out.println(t);
		
		// clear() : 모든 데이터 제거
		strList.clear();
		
		System.out.println(strList.isEmpty());
	}
}

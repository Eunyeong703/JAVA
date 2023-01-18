package ex4_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Exam01 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// 저장
		map.put("hong", 1234);
		map.put("lee", 1234);
		map.put("kim", 1234);
		
		// 크기
		System.out.println(map.size());
		
		// 키값을 이용해서 값을 반환
		System.out.println(map.get("hong"));
		
		// 같은 키값이 있는지 비교
		System.out.println(map.containsKey("hong"));
		System.out.println(map.containsKey("yoo"));
		
		// 같은 값이 있는지 비교 
		System.out.println(map.containsValue(1234));
		System.out.println(map.containsValue(0000));
		
		// map.entry 가져고 오는 방법
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
		
		// 키값만 가져오기
		Set<String> keySet = map.keySet();
		for(String s : keySet) {
			System.out.println(s);
		}
		
		// 값만 가져오기
		Collection<Integer> value = map.values();
		for(int i:value) {
			System.out.println(i);
		}
		
		// 키값으로 삭제
		int num = map.remove("hong");
		System.out.println(num);
		System.out.println(map.size());
		
		// 전체  삭제
		map.clear();
		
		// 컬렉션 비어 있는지 유무
		if(map.isEmpty()) {
			System.out.println("전체 삭제 완료");
		}
	}
}
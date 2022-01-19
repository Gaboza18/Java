package Exercise;

import java.util.*;

public class HashMapEx1 {

	public static void main(String[] args) {

		Map<String, Double> map = new HashMap<>();

		map.put("김우빈", 188.0);
		map.put("임시완", 166.0);
		map.put("김수현", 177.0);
		map.put("권지용", 168.5);
		map.put("에릭", 177.5);
		map.put("강호동", null);

		System.out.println("이름: 김수현, 키: " + map.get("김수현")); // key: 김수현
		System.out.println();

		// Keyset() 을 이용한 값의 검색

		Set<String> keys = map.keySet();
		System.out.println("키의목록: " + keys);
		Iterator<String> it = keys.iterator();

		while (it.hasNext()) {
			String key = it.next();
			System.out.printf("%s 의 키는 %5.4f\n", key, map.get(key));

		}
		System.out.println();
		System.out.println("HashMap size: " + map.size());

		System.out.println();
		System.out.println("'김수현' 키의 존재여부: " + map.containsKey("김수현")); // 김수현 이라는 키 값이 존재하는가

		System.out.println();
		System.out.println("'177.0' 값의 존재여부: " + map.containsValue(177.0)); // 값의 존재여부

		System.out.println("HashMap이 비어 있는가 " + map.isEmpty()); // HashMap 비어 있는지 여부

		map.remove("강호동"); // 강호동의 Key를 삭제한다
		keys = map.keySet();
		System.out.println("키의목록: " + keys);
	}

}

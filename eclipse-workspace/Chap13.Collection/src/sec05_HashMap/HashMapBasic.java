package sec05_HashMap;

import java.util.*;
import java.util.Map.Entry;

public class HashMapBasic {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<>(); // HashMap 객체 생성

		// 데이터 저장
		map.put("철수", "1");
		map.put("영희", "2");
		map.put("길동", "3");
		map.put("호동", null);
		map.put(null, "100");

		// 데이터 불러오기
		String value = map.get("길동");
		System.out.println("Key: 길동, Value= " + value);

		// 항목에 없는 키값을 요청할경우
		value = map.get("이순신");
		System.out.println("Key: 이순신, Value= " + value);

		// 키에 대한 값이 없을 경우 기본값 설정
		value = map.getOrDefault("이순신", "기본값");
		System.out.println("Key: 이순신, Value= " + value);

		// 키 존재 여부 확인
		System.out.println(map.containsKey("영희"));
		System.out.println(map.containsKey("99"));

		Set<Entry<String, String>> entryset = map.entrySet();
		System.out.println(entryset);

		System.out.println("map size= " + map.size());
	}

}

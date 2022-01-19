package sec03_hashset;

import java.util.*;

public class HashSetTest {

	public static void main(String[] args) {

		HashSet<String> fruits = new HashSet<String>();

		// set에 데이터 추가
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");

		// set에 데이터가 비어 있는지 확인
		System.out.println("fruits set은 비어있는가? " + fruits.isEmpty());

		// 특정 데이터가 있는지 확인(참:true / 거짓:false)
		System.out.println("fruits에 Apple 데이터가 있는가? " + fruits.contains("Apple"));
		System.out.println("fruits에 Mango 데이터가 있는가? " + fruits.contains("Mango"));

		// set에 들어 있는 데이터의 갯수
		System.out.println("fruits의 size: " + fruits.size());

		// List에 들어 있는 set에 한꺼번에 추가할때
		List<String> list1 = new ArrayList<String>();

		list1.add("Grape");
		list1.add("Peach");
		list1.add("Strawberry");
		fruits.addAll(list1);
		System.out.println("추가된 fruits의 항목: " + fruits);

		// 전체 데이터의 내용을 하나씩 처리하는 방법
		Iterator<String> it = fruits.iterator(); // set에 들어있는 전체 데이터를 Iterator형식으로 추출

		while (it.hasNext()) { // it에 처리할 데이터가 남아있는가?
			System.out.println(it.next());
		}

		// set에서 항목 삭제
		fruits.remove("Banana");
		System.out.println(fruits);
	}

}

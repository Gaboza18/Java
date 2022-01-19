package sec03_hashset;

import java.util.*;

public class HashSetTest2 {

	public static void main(String[] args) {

		Set<String> Computer = new HashSet<>();

		Computer.add("맥북");
		Computer.add("한성");
		Computer.add("델");
		Computer.add("삼성");

		System.out.println("Computer 의 set은 비어있는가? " + Computer.isEmpty());
		System.out.println("Computer 에 LG 데이터가 들어있는가? " + Computer.contains("LG"));
		System.out.println("Computer Size: " + Computer.size());

		List<String> list = new ArrayList<>(); // 리스트에 저장된 객체생성

		list.add("LG"); // 추가항목
		list.add("인텔");
		list.add("hp");
		list.add("hp"); // 중복저장 x

		Computer.addAll(list); // 리스트의 내용을 Computer 객체에 넣는다
		System.out.println(Computer); // 순서유지 x , 중복저장 x

		Iterator<String> it = Computer.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		Computer.remove("델");
		System.out.println(Computer);
	}

}

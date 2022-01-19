package sec5_wildcard;

import java.util.*;

public class TestWildCard {

	// 모든 종류의 데이터 목록을 출력하는 메소드
	public static void printList(List<?> lst) { // ? = 모든 종류 타입 가능
		// public static void printList(List<Object> lst) // Object 타입의 목록만 출력 가능
		for (Object obj : lst) {
			System.out.println(obj);
		}

	}

	public static void main(String[] args) {

		List<Object> objList = new ArrayList<Object>();

		objList.add(Integer.valueOf(55));
		objList.add(Integer.valueOf(47));
		printList(objList);

		List<String> strList = new ArrayList<String>();
		strList.add("one");
		strList.add("two");
		printList(strList);
	}

}

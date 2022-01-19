package sec01_arraylist;

import java.util.*;

public class ArrayListEx1_Practice {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();

		// 리스트1에 데이터 추가
		list1.add(5);
		list1.add(4);
		list1.add(3);
		list1.add(2);
		list1.add(1);

		System.out.println("list1: " + list1);

		list1.add(0, 3); // index값이 0인 위치에 3을 추가한다(0번자리 값을 뒤로 밀고)
		System.out.println("list1(0번 index에 3추가): " + list1);

		list1.set(3, 6); // index값이 3인 위치에 내용을 6으로 바꾼다
		System.out.println("list1(3번 index값 6으로 변경): " + list1);
		System.out.println();

		list2.add(5);
		list2.add(4);
		list2.add(3);
		list2.add(2);
		list2.add(1);

		System.out.println("list2: " + list2);
		System.out.println("4가 저장된 처음 index: " + list2.indexOf(4));
		System.out.println("1이 저장된 마지막 index: " + list2.lastIndexOf(1));
		System.out.println("list2의 항목 개수: " + list2.size());
		System.out.println("list2의 0번 index 부터 ~ 4번 index값 전 출력: " + list2.subList(0, 4));
		System.out.println("list2의 4가 저장된 index 삭제: " + list2.remove(4) + "번 index");
		System.out.println("list2: " + list2);

		Object[] intArr1 = list1.toArray(); // list1의 내용을 객체 배열로 변환
		System.out.printf("list1의 배열 변환: ");
		for (int i = 0; i < intArr1.length; i++) {
			System.out.printf(intArr1[i] + " ");
		}
		System.out.println();

		Object[] intArr2 = list2.toArray();
		System.out.printf("list2의 배열 변환: "); // list2의 내용을 객체 배열로 변환
		for (int i = 0; i < intArr2.length; i++) {
			System.out.printf(intArr2[i] + " ");
		}
		System.out.println();

		list1.retainAll(list2);
		System.out.println("list1의 내용중 list2 내용만 남겨두고 삭제: " + list1);

		list2.retainAll(list1);
		System.out.println("list2의 내용중 list1 내용만 남겨두고 삭제: " + list2);

		list1.remove(0);
		System.out.println(list1);
		System.out.println("1번 index의 값은: " + list1.get(1));

	}

}

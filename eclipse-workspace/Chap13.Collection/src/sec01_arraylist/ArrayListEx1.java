package sec01_arraylist;

import java.util.*;

public class ArrayListEx1 {

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		// 리스트1에 데이터 추가
		list1.add(5);
		list1.add(4); // auto boxing
		list1.add(Integer.valueOf(1));
		list1.add(2);

		System.out.println("list1: " + list1); // list1.toString() 실행한 것과 동일 의미

		list1.add(3, 3); // index가 3인 위치에 3을 추가 (3번자리를 밀어내고 추가한다)
		System.out.println("list1: " + list1);

		list1.set(3, 6); // 3번 index의 내용을 6으로 변경 (3번자리 값만 바꾼다)
		System.out.println("list1: " + list1);
		System.out.println();

		// 리스트2에 데이터 추가
		list2.add(4);
		list2.add(5);
		list2.add(6);
		list2.add(4);

		System.out.println("list2: " + list2);
		System.out.println("4가 저장된 처음 인덱스: " + list2.indexOf(4));
		System.out.println("4가 저장된 마지막 인덱스: " + list2.lastIndexOf(4));
		System.out.println("list2의 항목 갯수는: " + list2.size());
		System.out.println("list2의 sublist= " + list2.subList(1, 3)); // 1번 index 부터 3번 index전까지 출력
		System.out.println();

		System.out.println("list2의 내용을 배열로 변환");
		Object[] intArr = list2.toArray();
		System.out.printf("Integer 배열: ");
		for (int i = 0; i < intArr.length; i++) {
			System.out.printf(intArr[i] + " ");
		}
		System.out.println();

		// list1의 내용에서 list2에 있는 값만 남겨두고 list1에서 나머지 삭제
		list1.retainAll(list2);
		System.out.println("list1.retainAll(list2)= " + list1);

		System.out.println("list.contains(3)= " + list1.contains(3));

		list1.remove(0); // 리스트에서 0번 인덱스 내용 삭제
		System.out.println(list1);
		System.out.println("1번 인덱스의 값은: " + list1.get(1));
	}

}
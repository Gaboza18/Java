package Exercise;

import java.util.*;

/*
 *  1~100사이 랜덤넘버 10개를 생성하여 Linked List 저장한다.
 *  4번째 5번째 항목 데이터 교환하는 프로그램 작성
 */
public class LinkedListEx1 {
	public static void main(String[] args) {

		LinkedList<Integer> list1 = new LinkedList<Integer>();

		for (int i = 0; i < 10; i++) {
			list1.add((int) (Math.random() * 100) + 1);
		}
		System.out.println("교환전 리스트");
		System.out.println(list1);

		/*
		 * 4번째 항목과 5번째 항목 교환
		 */
		int temp = list1.get(3);
		list1.set(3, list1.get(4));
		list1.set(4, temp);

		System.out.println("교환후 리스트");
		System.out.println(list1);

	}
}

package Exercise;

import java.util.*;

/*
 *  1~50 사이에 랜던넘버 10개를 생성하여 Linked List 저장한다.
 *  1번째 9번쨰 항목 데이터를 교환하는 프로그램 작성
 */
public class LinkedListEx1_Practice {

	public static void main(String[] args) {

		List<Integer> randomList = new LinkedList<>();

		for (int i = 0; i < 10; i++) {
			randomList.add((int) (Math.random() * 50) + 1);
		}
		System.out.println("교환전 리스트");
		System.out.println(randomList);

		int temp = randomList.get(0); // 1번째 항목 temp에 저장
		randomList.set(0, randomList.get(8)); // 9번째 항목 1번째 index에 저장
		randomList.set(8, temp);

		System.out.println("교환후 리스트");
		System.out.println(randomList);
	}

}

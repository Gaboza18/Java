package Exercise;

import java.util.*;

public class IteratorEx1 { // HashSet에 1~100 사이 임의의 숫자 10개 저장 -> Interator를 이용하여 Set에 들어가 있는 값중
							// 최댓값,최솟값,합계,평균 구하기

	public static void main(String[] args) {

		Set<Integer> setA = new HashSet<>();

		int max = 0, min = 0, total = 0;
		int next = 0;

		for (int i = 0; i < 10; i++) {
			setA.add((int) (Math.random() * 100) + 1);
		}
		System.out.println("HashSet 내용: " + setA);

		Iterator<Integer> it = setA.iterator();
		int index = 0; // 순서를 표현하기 위해

		while (it.hasNext()) {

			next = it.next();
			index++; // 0 -> 1

			// iterator에서 첫번째 값을 min 변수에 저장함. -> min 값을 0으로 초기화 하면 최소값을 구할 수 없음
			if (index == 1) { // index 값이 1일때
				min = next; // 최소값을 넣어준다
			}
			if (max < next) { // 최댓값
				max = next;
			}
			if (min > next) { // 최솟값
				min = next;
			}

			total += next;
		}
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
		System.out.println("합: " + total);
		System.out.println("평균: " + (total / 10.0));
	}

}

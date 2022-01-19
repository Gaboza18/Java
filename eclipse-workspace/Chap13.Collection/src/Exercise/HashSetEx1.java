package Exercise;

import java.util.*;

/*
 * 합집합, 교집합, 차집합 구하기
 */
public class HashSetEx1 {

	public static void main(String[] args) {

		int[] arrA = { 1, 2, 3, 4, 5 };
		int[] arrB = { 4, 5, 6, 7, 8 };

		Set<Integer> setA = new HashSet<Integer>();
		Set<Integer> setB = new HashSet<Integer>();

		Set<Integer> setHab = new HashSet<Integer>(); // 합집합 저장용 변수
		Set<Integer> setKyo = new HashSet<Integer>(); // 교집합 저장용 변수
		Set<Integer> setCha = new HashSet<Integer>(); // 차집합 저장용 변수

		// 배열 arrA의 내용을 Hahset A에 저장
		for (int i = 0; i < arrA.length; i++) {
			setA.add(arrA[i]);
		}

		// 배열 arrA의 내용을 Hahset B에 저장
		for (int i = 0; i < arrB.length; i++) {
			setB.add(arrB[i]);
		}

		// 합집합 구하기
		setHab.addAll(setA); // Hashset은 중복데이터 허용하지 않는다
		setHab.addAll(setB);
		System.out.println("합집합: " + setHab);

		// 교집합 구하기
		setKyo.addAll(setA); // setA 배열을 SetKyo에 넣는다
		setKyo.retainAll(setB); // setB에 포함된 내용을 유지하고 나머지는 삭제
		System.out.println("교집합: " + setKyo);

		// 차집합 구하기
		setCha.addAll(setA); // setA 배열을 SetCha에 넣는다
		setCha.removeAll(setB); // setCha - SetB
		System.out.println("차집합: " + setCha);

	}
}

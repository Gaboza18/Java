package Exercise;

import java.util.*;

public class HashSetEx1_Practice {

	public static void main(String[] args) {

		int[] arrA = { 1, 85, 95, 33, 56, 6 };
		int[] arrB = { 95, 66, 88, 56, 1, 4, 6 };

		Set<Integer> A = new HashSet<>();
		Set<Integer> B = new HashSet<>();

		Set<Integer> Kyo = new HashSet<>();
		Set<Integer> Hab = new HashSet<>();
		Set<Integer> Cha = new HashSet<>();

		for (int i = 0; i < arrA.length; i++) {
			A.add(arrA[i]);
		}

		for (int i = 0; i < arrB.length; i++) {
			B.add(arrB[i]);
		}

		Hab.addAll(A);
		Hab.addAll(B);
		System.out.println("합집합: " + Hab);

		Kyo.addAll(A);
		Kyo.retainAll(B);
		System.out.println("교집합: " + Kyo);

		Cha.addAll(A);
		Cha.removeAll(B);
		System.out.println("차집합: " + Cha);

	}

}

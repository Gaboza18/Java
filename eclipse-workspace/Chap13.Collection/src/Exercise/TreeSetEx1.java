package Exercise;

import java.util.*;

public class TreeSetEx1 {

	public static void main(String[] args) {

		int[] score = { 80, 95, 50, 35, 45, 65, 10, 100 };

		TreeSet<Integer> tset = new TreeSet<>();

		for (int i = 0; i < score.length; i++) {
			tset.add(score[i]);
		}
		System.out.println("score = " + tset);
		System.out.println("50���� �������� = " + tset.headSet(50));
		System.out.println("50���� ū ���� = " + tset.tailSet(51));
		System.out.println("50���� ū ���� = " + tset.tailSet(tset.higher(50))); // 50���� ū ��ü �ٷ����� ���� ����

	}

}

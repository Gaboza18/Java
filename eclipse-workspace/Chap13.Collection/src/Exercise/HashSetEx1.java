package Exercise;

import java.util.*;

/*
 * ������, ������, ������ ���ϱ�
 */
public class HashSetEx1 {

	public static void main(String[] args) {

		int[] arrA = { 1, 2, 3, 4, 5 };
		int[] arrB = { 4, 5, 6, 7, 8 };

		Set<Integer> setA = new HashSet<Integer>();
		Set<Integer> setB = new HashSet<Integer>();

		Set<Integer> setHab = new HashSet<Integer>(); // ������ ����� ����
		Set<Integer> setKyo = new HashSet<Integer>(); // ������ ����� ����
		Set<Integer> setCha = new HashSet<Integer>(); // ������ ����� ����

		// �迭 arrA�� ������ Hahset A�� ����
		for (int i = 0; i < arrA.length; i++) {
			setA.add(arrA[i]);
		}

		// �迭 arrA�� ������ Hahset B�� ����
		for (int i = 0; i < arrB.length; i++) {
			setB.add(arrB[i]);
		}

		// ������ ���ϱ�
		setHab.addAll(setA); // Hashset�� �ߺ������� ������� �ʴ´�
		setHab.addAll(setB);
		System.out.println("������: " + setHab);

		// ������ ���ϱ�
		setKyo.addAll(setA); // setA �迭�� SetKyo�� �ִ´�
		setKyo.retainAll(setB); // setB�� ���Ե� ������ �����ϰ� �������� ����
		System.out.println("������: " + setKyo);

		// ������ ���ϱ�
		setCha.addAll(setA); // setA �迭�� SetCha�� �ִ´�
		setCha.removeAll(setB); // setCha - SetB
		System.out.println("������: " + setCha);

	}
}

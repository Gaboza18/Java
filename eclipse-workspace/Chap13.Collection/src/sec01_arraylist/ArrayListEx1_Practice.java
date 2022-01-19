package sec01_arraylist;

import java.util.*;

public class ArrayListEx1_Practice {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();

		// ����Ʈ1�� ������ �߰�
		list1.add(5);
		list1.add(4);
		list1.add(3);
		list1.add(2);
		list1.add(1);

		System.out.println("list1: " + list1);

		list1.add(0, 3); // index���� 0�� ��ġ�� 3�� �߰��Ѵ�(0���ڸ� ���� �ڷ� �а�)
		System.out.println("list1(0�� index�� 3�߰�): " + list1);

		list1.set(3, 6); // index���� 3�� ��ġ�� ������ 6���� �ٲ۴�
		System.out.println("list1(3�� index�� 6���� ����): " + list1);
		System.out.println();

		list2.add(5);
		list2.add(4);
		list2.add(3);
		list2.add(2);
		list2.add(1);

		System.out.println("list2: " + list2);
		System.out.println("4�� ����� ó�� index: " + list2.indexOf(4));
		System.out.println("1�� ����� ������ index: " + list2.lastIndexOf(1));
		System.out.println("list2�� �׸� ����: " + list2.size());
		System.out.println("list2�� 0�� index ���� ~ 4�� index�� �� ���: " + list2.subList(0, 4));
		System.out.println("list2�� 4�� ����� index ����: " + list2.remove(4) + "�� index");
		System.out.println("list2: " + list2);

		Object[] intArr1 = list1.toArray(); // list1�� ������ ��ü �迭�� ��ȯ
		System.out.printf("list1�� �迭 ��ȯ: ");
		for (int i = 0; i < intArr1.length; i++) {
			System.out.printf(intArr1[i] + " ");
		}
		System.out.println();

		Object[] intArr2 = list2.toArray();
		System.out.printf("list2�� �迭 ��ȯ: "); // list2�� ������ ��ü �迭�� ��ȯ
		for (int i = 0; i < intArr2.length; i++) {
			System.out.printf(intArr2[i] + " ");
		}
		System.out.println();

		list1.retainAll(list2);
		System.out.println("list1�� ������ list2 ���븸 ���ܵΰ� ����: " + list1);

		list2.retainAll(list1);
		System.out.println("list2�� ������ list1 ���븸 ���ܵΰ� ����: " + list2);

		list1.remove(0);
		System.out.println(list1);
		System.out.println("1�� index�� ����: " + list1.get(1));

	}

}

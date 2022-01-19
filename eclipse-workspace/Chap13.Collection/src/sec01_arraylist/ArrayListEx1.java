package sec01_arraylist;

import java.util.*;

public class ArrayListEx1 {

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		// ����Ʈ1�� ������ �߰�
		list1.add(5);
		list1.add(4); // auto boxing
		list1.add(Integer.valueOf(1));
		list1.add(2);

		System.out.println("list1: " + list1); // list1.toString() ������ �Ͱ� ���� �ǹ�

		list1.add(3, 3); // index�� 3�� ��ġ�� 3�� �߰� (3���ڸ��� �о�� �߰��Ѵ�)
		System.out.println("list1: " + list1);

		list1.set(3, 6); // 3�� index�� ������ 6���� ���� (3���ڸ� ���� �ٲ۴�)
		System.out.println("list1: " + list1);
		System.out.println();

		// ����Ʈ2�� ������ �߰�
		list2.add(4);
		list2.add(5);
		list2.add(6);
		list2.add(4);

		System.out.println("list2: " + list2);
		System.out.println("4�� ����� ó�� �ε���: " + list2.indexOf(4));
		System.out.println("4�� ����� ������ �ε���: " + list2.lastIndexOf(4));
		System.out.println("list2�� �׸� ������: " + list2.size());
		System.out.println("list2�� sublist= " + list2.subList(1, 3)); // 1�� index ���� 3�� index������ ���
		System.out.println();

		System.out.println("list2�� ������ �迭�� ��ȯ");
		Object[] intArr = list2.toArray();
		System.out.printf("Integer �迭: ");
		for (int i = 0; i < intArr.length; i++) {
			System.out.printf(intArr[i] + " ");
		}
		System.out.println();

		// list1�� ���뿡�� list2�� �ִ� ���� ���ܵΰ� list1���� ������ ����
		list1.retainAll(list2);
		System.out.println("list1.retainAll(list2)= " + list1);

		System.out.println("list.contains(3)= " + list1.contains(3));

		list1.remove(0); // ����Ʈ���� 0�� �ε��� ���� ����
		System.out.println(list1);
		System.out.println("1�� �ε����� ����: " + list1.get(1));
	}

}
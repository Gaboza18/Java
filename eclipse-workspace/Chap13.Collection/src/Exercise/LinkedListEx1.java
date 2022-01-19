package Exercise;

import java.util.*;

/*
 *  1~100���� �����ѹ� 10���� �����Ͽ� Linked List �����Ѵ�.
 *  4��° 5��° �׸� ������ ��ȯ�ϴ� ���α׷� �ۼ�
 */
public class LinkedListEx1 {
	public static void main(String[] args) {

		LinkedList<Integer> list1 = new LinkedList<Integer>();

		for (int i = 0; i < 10; i++) {
			list1.add((int) (Math.random() * 100) + 1);
		}
		System.out.println("��ȯ�� ����Ʈ");
		System.out.println(list1);

		/*
		 * 4��° �׸�� 5��° �׸� ��ȯ
		 */
		int temp = list1.get(3);
		list1.set(3, list1.get(4));
		list1.set(4, temp);

		System.out.println("��ȯ�� ����Ʈ");
		System.out.println(list1);

	}
}

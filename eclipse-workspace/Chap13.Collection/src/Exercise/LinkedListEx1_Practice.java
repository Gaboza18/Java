package Exercise;

import java.util.*;

/*
 *  1~50 ���̿� �����ѹ� 10���� �����Ͽ� Linked List �����Ѵ�.
 *  1��° 9���� �׸� �����͸� ��ȯ�ϴ� ���α׷� �ۼ�
 */
public class LinkedListEx1_Practice {

	public static void main(String[] args) {

		List<Integer> randomList = new LinkedList<>();

		for (int i = 0; i < 10; i++) {
			randomList.add((int) (Math.random() * 50) + 1);
		}
		System.out.println("��ȯ�� ����Ʈ");
		System.out.println(randomList);

		int temp = randomList.get(0); // 1��° �׸� temp�� ����
		randomList.set(0, randomList.get(8)); // 9��° �׸� 1��° index�� ����
		randomList.set(8, temp);

		System.out.println("��ȯ�� ����Ʈ");
		System.out.println(randomList);
	}

}

package Exercise;

import java.util.*;

public class IteratorEx1 { // HashSet�� 1~100 ���� ������ ���� 10�� ���� -> Interator�� �̿��Ͽ� Set�� �� �ִ� ����
							// �ִ�,�ּڰ�,�հ�,��� ���ϱ�

	public static void main(String[] args) {

		Set<Integer> setA = new HashSet<>();

		int max = 0, min = 0, total = 0;
		int next = 0;

		for (int i = 0; i < 10; i++) {
			setA.add((int) (Math.random() * 100) + 1);
		}
		System.out.println("HashSet ����: " + setA);

		Iterator<Integer> it = setA.iterator();
		int index = 0; // ������ ǥ���ϱ� ����

		while (it.hasNext()) {

			next = it.next();
			index++; // 0 -> 1

			// iterator���� ù��° ���� min ������ ������. -> min ���� 0���� �ʱ�ȭ �ϸ� �ּҰ��� ���� �� ����
			if (index == 1) { // index ���� 1�϶�
				min = next; // �ּҰ��� �־��ش�
			}
			if (max < next) { // �ִ�
				max = next;
			}
			if (min > next) { // �ּڰ�
				min = next;
			}

			total += next;
		}
		System.out.println("�ִ밪: " + max);
		System.out.println("�ּҰ�: " + min);
		System.out.println("��: " + total);
		System.out.println("���: " + (total / 10.0));
	}

}

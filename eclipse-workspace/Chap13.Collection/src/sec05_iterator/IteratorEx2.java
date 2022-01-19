package sec05_iterator;

import java.util.*;

public class IteratorEx2 { // iterator�� �ѹ� ������ �ٽ� �����Ҷ� �� ��°��� �ȳ������� Ȯ��

	public static void main(String[] args) {

		ArrayList<Integer> original = new ArrayList<>(10);
		ArrayList<Integer> copy1 = new ArrayList<>(10);

		for (int i = 0; i < 10; i++) { // 0~9����
			original.add(i);
		}

		Iterator<Integer> it = original.iterator();

		while (it.hasNext()) { // original ������ copy1 �� ��´�
			copy1.add(it.next());
		}

		System.out.println("copy1= " + copy1);

		System.out.print("original ����Ʈ�� ����: "); // iterator�� �ٽ� ����Ϸ��� iterator()�� �̿��ϸ� �ٽ� �����ؾ���.
		while (it.hasNext()) { // original ������ iterator�� ������ �ٽ� �ݺ��Ͽ� ����ϰ��� ��
			System.out.println(it.next() + " "); // ��µ��� ���� �� while�� ������ �迭���� ��ġ������
		}
	}

}

package sec02_linkedlist;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {

		LinkedList<String> a = new LinkedList<String>();
		LinkedList<String> b = null;
		
		String[] alphabet = { "A", "B", "C", "D", "E" };

		for (String s : alphabet) {
			a.add(s);
		}
		System.out.println("a=" + a);

		b = (LinkedList<String>) a.clone(); // a����Ʈ�� ������ b�� �����Ѵ�.
		System.out.println("b=" + b);

		// peek(), poll()
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.peek()); // ����Ʈ���� ���� ù��°�� ������ ��������
			System.out.println(a.poll()); // ����Ʈ���� ���� ù��°�� ������ ������ �����Ѵ�
		}
	}

}

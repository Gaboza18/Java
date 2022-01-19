package sec02_linkedlist;

import java.util.LinkedList;

public class LinkedListTest_Practice {
	public static void main(String[] args) {

		LinkedList<String> a = new LinkedList<String>();
		LinkedList<String> b = new LinkedList<String>();

		String[] alphabet = { "a", "b", "c", "d", "e" };

		for (String s : alphabet) {
			a.add(s);
		}
		System.out.println("a=" + a);

		b = (LinkedList<String>) a.clone(); // a����Ʈ�� ������ ����
		System.out.println("b=" + b);

		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.peek()); // ����Ʈ���� ���� ù��°�� ������ ������
			System.out.println(a.poll()); // ����Ʈ���� ���� ù��°�� ������ ������ ����
		}
	}
}

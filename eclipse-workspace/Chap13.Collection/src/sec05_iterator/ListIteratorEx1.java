package sec05_iterator;

import java.util.*;

public class ListIteratorEx1 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		list.add("�̼���");
		list.add("�念��");
		list.add("�庸��");
		list.add("ȫ�浿");
		list.add("������");

		ListIterator<String> it = list.listIterator();

		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println("");

		while (it.hasPrevious()) { // �������� ����Ѵ�
			System.out.print(it.previous() + " ");
		}

	}

}

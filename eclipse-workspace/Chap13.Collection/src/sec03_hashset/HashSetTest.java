package sec03_hashset;

import java.util.*;

public class HashSetTest {

	public static void main(String[] args) {

		HashSet<String> fruits = new HashSet<String>();

		// set�� ������ �߰�
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");

		// set�� �����Ͱ� ��� �ִ��� Ȯ��
		System.out.println("fruits set�� ����ִ°�? " + fruits.isEmpty());

		// Ư�� �����Ͱ� �ִ��� Ȯ��(��:true / ����:false)
		System.out.println("fruits�� Apple �����Ͱ� �ִ°�? " + fruits.contains("Apple"));
		System.out.println("fruits�� Mango �����Ͱ� �ִ°�? " + fruits.contains("Mango"));

		// set�� ��� �ִ� �������� ����
		System.out.println("fruits�� size: " + fruits.size());

		// List�� ��� �ִ� set�� �Ѳ����� �߰��Ҷ�
		List<String> list1 = new ArrayList<String>();

		list1.add("Grape");
		list1.add("Peach");
		list1.add("Strawberry");
		fruits.addAll(list1);
		System.out.println("�߰��� fruits�� �׸�: " + fruits);

		// ��ü �������� ������ �ϳ��� ó���ϴ� ���
		Iterator<String> it = fruits.iterator(); // set�� ����ִ� ��ü �����͸� Iterator�������� ����

		while (it.hasNext()) { // it�� ó���� �����Ͱ� �����ִ°�?
			System.out.println(it.next());
		}

		// set���� �׸� ����
		fruits.remove("Banana");
		System.out.println(fruits);
	}

}

package sec03_hashset;

import java.util.*;

public class HashSetTest2 {

	public static void main(String[] args) {

		Set<String> Computer = new HashSet<>();

		Computer.add("�ƺ�");
		Computer.add("�Ѽ�");
		Computer.add("��");
		Computer.add("�Ｚ");

		System.out.println("Computer �� set�� ����ִ°�? " + Computer.isEmpty());
		System.out.println("Computer �� LG �����Ͱ� ����ִ°�? " + Computer.contains("LG"));
		System.out.println("Computer Size: " + Computer.size());

		List<String> list = new ArrayList<>(); // ����Ʈ�� ����� ��ü����

		list.add("LG"); // �߰��׸�
		list.add("����");
		list.add("hp");
		list.add("hp"); // �ߺ����� x

		Computer.addAll(list); // ����Ʈ�� ������ Computer ��ü�� �ִ´�
		System.out.println(Computer); // �������� x , �ߺ����� x

		Iterator<String> it = Computer.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		Computer.remove("��");
		System.out.println(Computer);
	}

}

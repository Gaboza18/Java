package Exercise;

import java.util.*;

public class HashMapEx1 {

	public static void main(String[] args) {

		Map<String, Double> map = new HashMap<>();

		map.put("����", 188.0);
		map.put("�ӽÿ�", 166.0);
		map.put("�����", 177.0);
		map.put("������", 168.5);
		map.put("����", 177.5);
		map.put("��ȣ��", null);

		System.out.println("�̸�: �����, Ű: " + map.get("�����")); // key: �����
		System.out.println();

		// Keyset() �� �̿��� ���� �˻�

		Set<String> keys = map.keySet();
		System.out.println("Ű�Ǹ��: " + keys);
		Iterator<String> it = keys.iterator();

		while (it.hasNext()) {
			String key = it.next();
			System.out.printf("%s �� Ű�� %5.4f\n", key, map.get(key));

		}
		System.out.println();
		System.out.println("HashMap size: " + map.size());

		System.out.println();
		System.out.println("'�����' Ű�� ���翩��: " + map.containsKey("�����")); // ����� �̶�� Ű ���� �����ϴ°�

		System.out.println();
		System.out.println("'177.0' ���� ���翩��: " + map.containsValue(177.0)); // ���� ���翩��

		System.out.println("HashMap�� ��� �ִ°� " + map.isEmpty()); // HashMap ��� �ִ��� ����

		map.remove("��ȣ��"); // ��ȣ���� Key�� �����Ѵ�
		keys = map.keySet();
		System.out.println("Ű�Ǹ��: " + keys);
	}

}

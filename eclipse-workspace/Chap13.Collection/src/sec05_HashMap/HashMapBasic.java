package sec05_HashMap;

import java.util.*;
import java.util.Map.Entry;

public class HashMapBasic {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<>(); // HashMap ��ü ����

		// ������ ����
		map.put("ö��", "1");
		map.put("����", "2");
		map.put("�浿", "3");
		map.put("ȣ��", null);
		map.put(null, "100");

		// ������ �ҷ�����
		String value = map.get("�浿");
		System.out.println("Key: �浿, Value= " + value);

		// �׸� ���� Ű���� ��û�Ұ��
		value = map.get("�̼���");
		System.out.println("Key: �̼���, Value= " + value);

		// Ű�� ���� ���� ���� ��� �⺻�� ����
		value = map.getOrDefault("�̼���", "�⺻��");
		System.out.println("Key: �̼���, Value= " + value);

		// Ű ���� ���� Ȯ��
		System.out.println(map.containsKey("����"));
		System.out.println(map.containsKey("99"));

		Set<Entry<String, String>> entryset = map.entrySet();
		System.out.println(entryset);

		System.out.println("map size= " + map.size());
	}

}

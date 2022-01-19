package sec05_HashMap;

import java.util.*;
import java.util.Map.Entry;

public class StudentTest {

	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();

		map.put(new Student(1, "ȫ�浿"), 90); // ��ȣ, �̸�, ����
		map.put(new Student(2, "������"), 85);
		map.put(new Student(1, "ȫ�浿"), 90); // �ߺ��� ����

		System.out.println("��ü ��Ʈ�� ��: " + map.size()); // �ߺ��� ������ ���� �ʴ´�

		Set<Entry<Student, Integer>> entry = map.entrySet();
		System.out.println(entry); // toString �����Ǿ� ���� toString �޼ҵ� �������̵� �ؾ� �������� �� ��µȴ� / �������̵� ���� ������ �ؽ��ڵ�� ���
	}

}

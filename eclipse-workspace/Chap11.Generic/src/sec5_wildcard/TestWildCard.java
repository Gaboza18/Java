package sec5_wildcard;

import java.util.*;

public class TestWildCard {

	// ��� ������ ������ ����� ����ϴ� �޼ҵ�
	public static void printList(List<?> lst) { // ? = ��� ���� Ÿ�� ����
		// public static void printList(List<Object> lst) // Object Ÿ���� ��ϸ� ��� ����
		for (Object obj : lst) {
			System.out.println(obj);
		}

	}

	public static void main(String[] args) {

		List<Object> objList = new ArrayList<Object>();

		objList.add(Integer.valueOf(55));
		objList.add(Integer.valueOf(47));
		printList(objList);

		List<String> strList = new ArrayList<String>();
		strList.add("one");
		strList.add("two");
		printList(strList);
	}

}

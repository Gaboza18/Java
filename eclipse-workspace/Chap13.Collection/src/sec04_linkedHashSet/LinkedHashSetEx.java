package sec04_linkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {

	public static void main(String[] args) {

		LinkedHashSet<String> lset = new LinkedHashSet<String>(); // LinkedHashSet ����

		lset.add("PQR");
		lset.add("JHK");
		lset.add("N");
		lset.add("N"); // �ߺ���� ���� �ʴ´�
		lset.add("FG");
		System.out.println(lset); // �ߺ� ���x, �������� o

		LinkedHashSet<Integer> lset2 = new LinkedHashSet<>(); // LinkedHashSet ����

		lset2.add(1);
		lset2.add(2);
		lset2.add(3);
		System.out.println(lset2);

	}
}

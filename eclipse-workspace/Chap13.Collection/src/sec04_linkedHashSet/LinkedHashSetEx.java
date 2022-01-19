package sec04_linkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {

	public static void main(String[] args) {

		LinkedHashSet<String> lset = new LinkedHashSet<String>(); // LinkedHashSet 선언

		lset.add("PQR");
		lset.add("JHK");
		lset.add("N");
		lset.add("N"); // 중복허용 하지 않는다
		lset.add("FG");
		System.out.println(lset); // 중복 허용x, 순서유지 o

		LinkedHashSet<Integer> lset2 = new LinkedHashSet<>(); // LinkedHashSet 선언

		lset2.add(1);
		lset2.add(2);
		lset2.add(3);
		System.out.println(lset2);

	}
}

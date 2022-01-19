package sec05_iterator;

import java.util.*;

public class ListIteratorEx1 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		list.add("이순신");
		list.add("장영실");
		list.add("장보고");
		list.add("홍길동");
		list.add("유관순");

		ListIterator<String> it = list.listIterator();

		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println("");

		while (it.hasPrevious()) { // 역순으로 출력한다
			System.out.print(it.previous() + " ");
		}

	}

}

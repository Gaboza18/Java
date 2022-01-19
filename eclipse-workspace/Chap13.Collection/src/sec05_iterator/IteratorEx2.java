package sec05_iterator;

import java.util.*;

public class IteratorEx2 { // iterator를 한번 실행후 다시 실행할때 왜 출력값이 안나오는지 확인

	public static void main(String[] args) {

		ArrayList<Integer> original = new ArrayList<>(10);
		ArrayList<Integer> copy1 = new ArrayList<>(10);

		for (int i = 0; i < 10; i++) { // 0~9까지
			original.add(i);
		}

		Iterator<Integer> it = original.iterator();

		while (it.hasNext()) { // original 내용을 copy1 에 담는다
			copy1.add(it.next());
		}

		System.out.println("copy1= " + copy1);

		System.out.print("original 리스트의 내용: "); // iterator를 다시 사용하려면 iterator()를 이용하면 다시 추출해야함.
		while (it.hasNext()) { // original 내용을 iterator의 내용을 다시 반복하여 출력하고자 함
			System.out.println(it.next() + " "); // 출력되지 않음 위 while문 마지막 배열값에 위치해있음
		}
	}

}

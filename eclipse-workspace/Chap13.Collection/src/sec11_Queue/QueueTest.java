package sec11_Queue;

import java.util.*;

public class QueueTest {

	public static void main(String[] args) {

		Queue<String> que = new LinkedList<>();

		que.offer("one"); // Queue�� ��ü�� �����Ѵ�( .offer( ); )
		que.offer("two");
		que.offer("three");
		que.offer("four");
		que.offer("five");

		while (!que.isEmpty()) {
			System.out.println(que.poll()); // Queue�� ��ü�� ���� ��ȯ ( .poll())
		}

	}

}

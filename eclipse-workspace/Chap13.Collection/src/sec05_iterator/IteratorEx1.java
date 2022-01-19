package sec05_iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx1 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>(); // 뒤에 생성자 생략 가능 <>, 배열리스트 선언

		list.add("국어");
		list.add("영어");
		list.add("수학");
		list.add("과학");
		list.add("사회");
		
		Iterator<String> it = list.iterator(); // <String> 타입으로 선언 선언하지 않으면 Object로 출력한다
		
		while(it.hasNext()) { // it에 처리할 데이터가 있는지 조건을 돌린다
			String str = it.next();
			System.out.println(str);
		}
	}

}

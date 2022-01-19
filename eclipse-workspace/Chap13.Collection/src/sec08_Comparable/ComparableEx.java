package sec08_Comparable;

import java.util.*;

public class ComparableEx {

	public static void main(String[] args) {

		TreeSet<Person> tset = new TreeSet<>();

		tset.add(new Person("홍길순", 92));
		tset.add(new Person("김아무개", 55));
		tset.add(new Person("김덕수", 75));

		Iterator<Person> it = tset.iterator(); // Person 객체안에 있기때문에 for문 사용 불가 -> Interactor 사용후 while문 사용해서 출력한다.
		while (it.hasNext()) {
			Person p = it.next();
			System.out.printf("%s : %d\n", p.name, p.age); // 나이 순서대로 출력 
		}

	}

}

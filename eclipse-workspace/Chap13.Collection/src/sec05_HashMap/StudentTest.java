package sec05_HashMap;

import java.util.*;
import java.util.Map.Entry;

public class StudentTest {

	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();

		map.put(new Student(1, "홍길동"), 90); // 번호, 이름, 점수
		map.put(new Student(2, "유관순"), 85);
		map.put(new Student(1, "홍길동"), 90); // 중복된 내용

		System.out.println("전체 엔트리 수: " + map.size()); // 중복된 내용은 들어가지 않는다

		Set<Entry<Student, Integer>> entry = map.entrySet();
		System.out.println(entry); // toString 생략되어 있음 toString 메소드 오버라이드 해야 정상적인 값 출력된다 / 오버라이드 하지 않으면 해쉬코드로 출력
	}

}

package sec03_hashset.package1;

import java.util.*;

class Person {

	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name + ":" + age;

	}
}

public class HashSetProblem {

	public static void main(String[] args) {

		HashSet set1 = new HashSet();

		set1.add("abc");
		set1.add("abc");
		System.out.println(set1); // "abc"는 중복데이터 이므로 하나만 저장됨.

		set1.add(new Person("Michael", 24));
		set1.add(new Person("Michael", 24)); // 사람이 보기에는 2개의 데이터가 동일한 것으로 판단.
		System.out.println(set1);
	}

}

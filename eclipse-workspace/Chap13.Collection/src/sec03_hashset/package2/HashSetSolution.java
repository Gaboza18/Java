package sec03_hashset.package2;

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

	@Override
	public int hashCode() {
		return (name + age).hashCode(); // 2개의 데이터를 연결한 문자열의 hashCode 호출
	}

	// 내가 갖고 있는 name과 age와 obj에 저장된 name과 age를 비교함
	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Person) {
			Person tmp = (Person) obj; // Object 타입의 객체를 Person 타입으로 cast
			boolean result = name.equals(tmp.name) && age == tmp.age;
			return result;
		}
		return false;
	}

}

public class HashSetSolution {

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

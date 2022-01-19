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
		return (name + age).hashCode(); // 2���� �����͸� ������ ���ڿ��� hashCode ȣ��
	}

	// ���� ���� �ִ� name�� age�� obj�� ����� name�� age�� ����
	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Person) {
			Person tmp = (Person) obj; // Object Ÿ���� ��ü�� Person Ÿ������ cast
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
		System.out.println(set1); // "abc"�� �ߺ������� �̹Ƿ� �ϳ��� �����.

		set1.add(new Person("Michael", 24));
		set1.add(new Person("Michael", 24)); // ����� ���⿡�� 2���� �����Ͱ� ������ ������ �Ǵ�.
		System.out.println(set1);
	}

}

package sec08_Comparable;

public class Person implements Comparable<Person> {

	public String name;
	public int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	/*
	 * Tree�� ����� ���� ���ϱ� ���� �޼ҵ� Person o: ������ �� age ���� ������ -1 / ������ 0 / ũ�� 1 ����
	 */
	@Override
	public int compareTo(Person o) {
		if (age < o.age) {
			return -1;
		} else if (age == o.age) {
			return 0;
		} else
			return 1;

	}

}

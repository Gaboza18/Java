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
	 * Tree에 저장시 값을 비교하기 위한 메소드 Person o: 저장할 값 age 값이 작으면 -1 / 같은면 0 / 크면 1 리턴
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
